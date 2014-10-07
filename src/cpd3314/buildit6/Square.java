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

/**
 * @author Len Payne <len.payne@lambtoncollege.ca>
 */
public class Square {

    private double length;

    /**
     * Default Constructor
     */
    public Square() {
        length = 0;
    }

    /**
     * Constructor Initializing Length
     *
     * @param l - Length of a Side
     */
    public Square(double l) {
        length = l;
    }

    /**
     * Retrieve the Length of a Side
     *
     * @return - The Length of a Side
     */
    public double getLength() {
        return length;
    }

    /**
     * Set the Length of a Side
     *
     * @param length - The Length of a Side
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Retrieve the Perimeter of the Square
     *
     * @return - The Perimeter of the Square
     */
    public double getPerimeter() {
        return 4 * length;
    }

    /**
     * Retrieve the Area of the Square
     *
     * @return - The Area of the Square
     */
    public double getArea() {
        return length * length;
    }
}
