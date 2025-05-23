package gr.ggeorgiadis.exceptionplayground;

import java.util.Scanner;

public class DivisionCalculator {
    /**
     * Divides two integers and handles division by zero.
     *
     * @param numerator the numerator
     * @param denominator the denominator
     * @return the result of the division
     * @throws ArithmeticException if denominator is zero
     */
    public static double divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }

        return (double) numerator / denominator;
    }

    /**
     * Interactive demo for division with exception handling.
     *
     * @param scanner shared scanner from main app
     */
    public static void runDivisionCalculator(Scanner scanner) {
         try {
             System.out.print("Enter numerator: ");
             int numerator = Integer.parseInt(scanner.nextLine());

             System.out.print("Enter numerator: ");
             int denominator = Integer.parseInt(scanner.nextLine());

             double result = divide(numerator, denominator);
             System.out.println("Result: " + result);
         } catch (NumberFormatException e) {
             System.out.println("Invalid input — please enter integers.");
         } catch (IllegalArgumentException e) {
             System.out.println("Error: " + e.getMessage());
         }


    }
}
