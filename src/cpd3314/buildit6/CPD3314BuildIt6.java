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

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Len Payne <len.payne@lambtoncollege.ca>
 */
public class CPD3314BuildIt6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Exercise 1: Building the Square w/o Constructors");
        System.out.println("================================================");
        doExercise1();
        System.out.println("Exercise 2: Building the Square w/ Constructors");
        System.out.println("================================================");
        doExercise2();
        System.out.println("Case Study: Working with the Employee Class");
        System.out.println("===========================================");
        doCaseStudy();
    }

    public static void doExercise1() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the length of one side of the square:");
        double side = kb.nextDouble();
        Square sq = new Square();
        sq.setLength(side);
        System.out.println("Length: " + sq.getLength());
        System.out.println("Perimeter: " + sq.getPerimeter());
        System.out.println("Area: " + sq.getArea());
    }

    public static void doExercise2() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the length of one side of the square:");
        double side = kb.nextDouble();
        Square sq = new Square(side);
        System.out.println("Length: " + sq.getLength());
        System.out.println("Perimeter: " + sq.getPerimeter());
        System.out.println("Area: " + sq.getArea());
    }

    public static void doCaseStudy() throws IOException {
        File file = new File("employees.yml");
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            String line = input.nextLine();
            String record = "";
            while (!line.equals("---")) {
                record += line + "\n";
                line = input.nextLine();
            }
            if (!record.isEmpty()) {
                Employee emp = new Employee(record);
                System.out.println(emp.toHTML());
            }
        }
    }
}
