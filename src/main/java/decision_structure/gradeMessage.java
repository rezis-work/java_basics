package decision_structure;

import java.util.Scanner;

public class gradeMessage {
    public static void main(String[] args) {
        System.out.println("Enter your Letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message;

        switch (grade.toUpperCase()) {
            case "A":
                message = "Excellent Job!";
                break;
            case "B":
                message = "Really impressive.";
                break;
            case "C":
                message = "Not bad GG";
                break;
            case "D":
                message = "You need to improve";
                break;
            case "F":
                message = "SO bad why?";
                break;
            default:
                message = "Wrong grade try again.";
                break;
        }

        System.out.println(message);


        scanner.close();
    }
}
