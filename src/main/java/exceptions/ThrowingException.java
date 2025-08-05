package exceptions;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ThrowingException {
    public static double calculatePay(double hours, double payRate)
            throws NegativeInputException {

        if (hours > 40) {
            throw new IllegalArgumentException("hours must be less then or equal to 40");
        } else if (hours < 0 || payRate < 0) {
            throw new NegativeInputException();
        }

        return hours * payRate;
    }

    public static void rethrowException() throws IOException {
        File file = new File("nonexistant.txt");
        file.createNewFile();
    }

//    polymorphic throws
    public static void rethrowExceptions() throws Exception {
        File file = new File("nonexistant.txt");
        file.createNewFile();
        Scanner fileReader = new Scanner(file);
    }
}
