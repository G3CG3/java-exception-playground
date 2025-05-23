package gr.ggeorgiadis.exceptionplayground;

import java.util.Scanner;

public class ExceptionPlaygroundApp {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            printMenu();
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1" -> DivisionCalculator.runDivisionCalculator(scanner);
                case "2" -> FileReaderChecker.runFileReaderChecker(scanner);
                case "3" -> InputValidator.runInputValidator(scanner);
                case "4" -> ExpenseLimitChecker.runExpenseChecker(scanner);
                case "0" -> {
                    System.out.println("Exiting. Goodbye!");
                    running = false;
                }
                default -> System.out.println("Invalid option. Please try again.");
            }

            System.out.println(); // Spacer
        }

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("=== Java Exception Playground ===");
        System.out.println("1. Division Calculator");
        System.out.println("2. File Reader Checker");
        System.out.println("3. Input Validator");
        System.out.println("4. Expense Limit Checker");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }

}
