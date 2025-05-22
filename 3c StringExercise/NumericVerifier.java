/**
 * Write a Java Program for Verifying if a string contains only numeric characters
 * using user defined function isNumeric().
 */

package StringExercise2;

import java.util.Scanner;

public class NumericVerifier {

    // Function to check if the string contains only digits
    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        // Using regex to check if string contains only digits 0-9
        return str.matches("\\d+");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check if numeric: ");
        String input = scanner.nextLine();

        if (isNumeric(input)) {
            System.out.println("String contains only numeric characters.");
        } else {
            System.out.println("String contains non-numeric characters.");
        }

        scanner.close();
    }
}
