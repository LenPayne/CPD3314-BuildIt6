/*
 * Copyright 2014 Len Payne <len.payne@lambtoncollege.ca>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cpd3314.buildit6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Len Payne <len.payne@lambtoncollege.ca>
 */
public class Employee {

    private String name;
    private String empid;
    private String deptid;
    private String mgrid;
    private String jobtitle;
    private Date hiredate;

    /**
     * Default Constructor - Sets Initial Values
     */
    public Employee() {
        name = "";
        empid = "";
        deptid = "";
        mgrid = "";
        jobtitle = "";
        hiredate = new Date();
    }

    /**
     * Constructor from YAML Text Block
     *
     * @param textBlock - Employee Record in YAML Format
     */
    public Employee(String textBlock) {
        Scanner input = new Scanner(textBlock);
        while (input.hasNext()) {
            String key = input.next();
            String value = input.nextLine();
            if (key.equals("name:")) {
                name = value;
            } else if (key.equals("empid:")) {
                empid = value;
            } else if (key.equals("deptid:")) {
                deptid = value;
            } else if (key.equals("mgrid:")) {
                mgrid = value;
            } else if (key.equals("jobtitle:")) {
                jobtitle = value;
            } else if (key.equals("hiredate:")) {
                // The following code is the "Correct" way to do this. I showed 
                // a simpler method in-class that was more error-prone.
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-dd");
                try {
                    hiredate = sdf.parse(value);
                } catch (ParseException ex) {
                    System.err.println(ex.getMessage());
                }
            }
        }
    }

    /**
     * Constructor Accepting Individual Fields
     *
     * @param n - Name
     * @param e - Employee ID
     * @param d - Department ID
     * @param m - Manager ID
     * @param j - Job Title
     * @param h - Hire Date
     */
    public Employee(String n, String e, String d, String m, String j, Date h) {
        name = n;
        empid = e;
        deptid = d;
        mgrid = m;
        jobtitle = j;
        hiredate = h;
    }

    /**
     * Retrieve the Employee's Name
     *
     * @return - Employee's Name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the Employee's Name
     *
     * @param n - Employee's Name
     */
    public void setName(String n) {
        name = n;
    }

    /**
     * Retrieve the Employee's ID
     *
     * @return - Employee's ID
     */
    public String getEmpid() {
        return empid;
    }

    /**
     * Set the Employee's ID
     *
     * @param e - Employee's ID
     */
    public void setEmpid(String e) {
        empid = e;
    }

    /**
     * Retrieve the Employee's Department ID
     *
     * @return - Department ID
     */
    public String getDeptid() {
        return deptid;
    }

    /**
     * Set the Employee's Department ID
     *
     * @param d - Department ID
     */
    public void setDeptid(String d) {
        deptid = d;
    }

    /**
     * Retrieve the Employee's Manager's ID
     *
     * @return - Manager's ID
     */
    public String getMgrid() {
        return mgrid;
    }

    /**
     * Set the Employee's Manager's ID
     *
     * @param m - Manager's ID
     */
    public void setMgrid(String m) {
        mgrid = m;
    }

    /**
     * Retrieve the Employee's Job Title
     *
     * @return - Job Title
     */
    public String getJobtitle() {
        return jobtitle;
    }

    /**
     * Set the Employee's Job Title
     *
     * @param j - Job Title
     */
    public void setJobtitle(String j) {
        jobtitle = j;
    }

    /**
     * Retrieve the Employee's Hire Date
     *
     * @return - Hire Date
     */
    public Date getHiredate() {
        return hiredate;
    }

    /**
     * Set the Employee's Hire Date
     *
     * @param h - Hire Date
     */
    public void setHiredate(Date h) {
        hiredate = h;
    }

    /**
     * Output the Employee's Record as a YAML Text Block
     *
     * @return - YAML Text Block
     */
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-dd");
        String output = "";
        output += "name: " + name + "\n";
        output += "empid: " + empid + "\n";
        output += "deptid: " + deptid + "\n";
        output += "mgrid: " + mgrid + "\n";
        output += "jobtitle: " + jobtitle + "\n";
        output += "hiredate: " + sdf.format(hiredate) + "\n";
        return output;
    }

    /**
     * Output the Employee's Record as an HTML Text Block
     *
     * @return - HTML Text Block
     */
    public String toHTML() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-dd");
        String output = "";
        output += "<h1>" + name + "</h1>\n";
        output += "<p>Employee ID: " + empid + "</p>\n";
        output += "<p>Department ID: " + deptid + "</p>\n";
        output += "<p>Manager ID: " + mgrid + "</p>\n";
        output += "<p>Job Title: " + jobtitle + "</p>\n";
        output += "<p>Hire Date: " + sdf.format(hiredate) + "</p>\n";
        return output;
    }
}
