package gr.ggeorgiadis.exceptionplayground;

import java.util.Scanner;

public class InputValidator {
    /**
     * Validates that the input string represents an integer between min and max (inclusive).
     * Throws IllegalArgumentException if input is invalid.
     *
     * @param input the string input to validate
     * @param min minimum valid value
     * @param max maximum valid value
     * @return the parsed integer if valid
     * @throws IllegalArgumentException if input is not a number or out of range
     */
    public static int validateIntegerInput(String input, int min, int max) {
        int value;

        try {
            value = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Input is not a valid integer: " + input);
        }

        if (value < min || value > max) {
            throw new IllegalArgumentException("Input must be between " + min + " and " + max + ". You entered: " + value);
        }

        return value;
    }

    public static void runInputValidator(Scanner scanner) {
        try {
            System.out.print("Enter an integer between 1 and 100: ");
            String numberInput = scanner.nextLine();
            int validatedInt = validateIntegerInput(numberInput, 1, 100);
            System.out.println("Validated number: " + validatedInt);

        } catch (IllegalArgumentException e) {
            System.out.println("Validation error: " + e.getMessage());
        }
    }
}
