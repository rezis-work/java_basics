package decision_structure;

import java.util.Scanner;

public class gradeMessage_SwitchExpressions {
    public static void main(String[] args) {
        System.out.println("Enter your Letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message = switch (grade.toUpperCase()) {
            case "A" -> "Excellent Job!";
            case "B" -> {
               yield "Really impressive.";
            }
            case "C" -> "Not bad GG";
            case "D" -> "You need to improve";
            case "F" -> "SO bad why?";
            default -> "Wrong grade try again.";
        };

        System.out.println(message);


        scanner.close();
    }
}
