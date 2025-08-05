package exceptions;

public class NegativeInputException extends Exception {

    public NegativeInputException() {
        this("Input must be greater then or equal to 0");
    }

    public NegativeInputException(String message) {
        super(message);
    }

}
