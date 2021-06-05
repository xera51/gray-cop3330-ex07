/*
 *  UCF COP3330 Summer 2021 Exercise 6 Solution
 *  Copyright 2021 Christopher Gray
 */
package base;

import java.util.Scanner;

public class App {

    static Scanner in = new Scanner(System.in);
    static final double CONVERSION_FACTOR = 0.09290304; // feet squared to meters squared

    public static void main(String[] args) {
        App myApp = new App();

        double length = myApp.readLength();
        double width = myApp.readWidth();

        String output = myApp.generateOutputString(length, width);
        myApp.displayOutput(output);
    }

    public double readLength() {
        System.out.print("What is the length of the room in feet? ");
        return Double.parseDouble(in.nextLine());
    }

    public double readWidth() {
        System.out.print("What is the width of the room in feet? ");
        return Double.parseDouble(in.nextLine());
    }

    public String generateOutputString(double lengthFeet, double widthFeet) {
        double areaFeet = area(lengthFeet, widthFeet);
        double areaMeters = feetSquaredToMetersSquared(areaFeet);
        return String.format("You entered dimensions of %.0f feet by %.0f feet.%n" +
                "The area is%n%.0f square feet%n%.3f square meters%n",
                lengthFeet, widthFeet, areaFeet, areaMeters);
    }

    private static double area(double length, double width) { return length * width; }

    private static double feetSquaredToMetersSquared(double area) { return area * CONVERSION_FACTOR; }

    public void displayOutput(String output) { System.out.println(output); }

}
