package gr.ggeorgiadis.exceptionplayground;

import gr.ggeorgiadis.exceptionplayground.exceptions.ExpenseLimitExceededException;

import java.util.Scanner;

public class ExpenseLimitChecker {
    /**
     * Checks if an expense is within the allowed limit.
     *
     * @param expenseAmount the amount of the expense
     * @param limit the maximum allowed limit
     * @throws ExpenseLimitExceededException if the expense exceeds the limit
     */
    public static void checkExpense(double expenseAmount, double limit) throws ExpenseLimitExceededException {
        if (expenseAmount > limit) {
            throw new ExpenseLimitExceededException("Expense of " + expenseAmount + " exceeds the allowed limit of " + limit + ".");
        }
    }

    public static void runExpenseChecker(Scanner scanner) {
        try {
            System.out.print("Enter your expense amount: ");
            String input = scanner.nextLine();
            double amount = Double.parseDouble(input);

            double limit = 1000.0;
            checkExpense(amount, limit);
            System.out.println("Expense of " + amount + " is within the limit of " + limit + ".");

        } catch (NumberFormatException e) {
            System.out.println("Invalid input — please enter a valid number.");
        } catch (ExpenseLimitExceededException e) {
            System.out.println("Limit check failed: " + e.getMessage());
        }
    }
}
