package gr.ggeorgiadis.exceptionplayground.exceptions;

public class ExpenseLimitExceededException extends Exception {
    public ExpenseLimitExceededException(String message) {
        super(message);
    }
}
