/**
 * <h1>Assignment 1</h1>
 * This application allows the user to enter data for a circle
 * or rectangle. The circumference and area are then calculated
 * and the result is displayed to the standard output.
 * @author Jonas Gemborg (Joge1900)
 * @version 1.0
 * @since 2020-11-18
*/


package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter exit to quit the program. \n");
        boolean running = true;
        while (running) {
            Scanner sc = new Scanner(System.in);
            System.out.println("What geometric shape do you want to use?");
            String typeOfShape = sc.nextLine();
            switch (typeOfShape){
                case "circle": calculateCircle();
                    break;
                case "rectangle": calculatRectangle();
                    break;
                case "exit": System.out.println("Good Bye!");
                    running = false;
                    break;
                default: System.out.println("Unknown shape!");
                    break;
            }

        }
    }

    /**
     * Calculates circle and prints result
     */
    private static void calculateCircle() {
        System.out.println("Enter radius:");
        double radius = takeNumericInput();
        System.out.println("Circumference = " + calculateCircumference(radius));
        System.out.println("Area = " + calculateAreaCircle(radius) + "\n");

    }

    /**
     * Calculates Area for circle
     * @param radius
     * @return Area
     */
    private static double calculateAreaCircle(double radius) {
        return (radius * radius) * 3.14;
    }

    /**
     * Calculate Circumference for circle
     * @param radius
     * @return Cuírcumference
     */
    private static double calculateCircumference(double radius) {
        return 2*3.14*radius;
    }

    /**
     * Helperfunction to take input from user
     * @return numeric input
     */
    private static double takeNumericInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextFloat();
    }
    /**
     * Calculates and prints a rectangles valuea
     */
    private static void calculatRectangle() {
        System.out.println("Enter width: ");
        double width = takeNumericInput();
        System.out.println("Enter height: ");
        double height = takeNumericInput();
        System.out.println("Circumference = " + calculateCircumferenceRectangle(width, height));
        System.out.println("Area = " + calculateAreaRectangle(width, height) + "\n");
    }

    /**
     * Calculates area for retangle
     * @param width
     * @param height
     * @return area
     */
    private static double calculateAreaRectangle(double width, double height) {
        return width * height;
    }

    /**
     * Calculates circumference for a rectangle
     * @param width
     * @param height
     * @return Circumference Rectangle
     */
    private static double calculateCircumferenceRectangle(double width, double height) {
        return 2*width + 2*height;
    }

}
