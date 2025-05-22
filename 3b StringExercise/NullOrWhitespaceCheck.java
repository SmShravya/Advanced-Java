/**
 * Program to check if a given string is null or contains only whitespace
 * using user-defined function isNullOrEmpty()
 */
package StringExercise1;
import java.util.Scanner;

public class NullOrWhitespaceCheck {

    // User-defined function to check null or empty (only whitespace) string
    public static boolean isNullOrEmpty(String str) {
        return (str == null) || (str.trim().isEmpty());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        if (isNullOrEmpty(input)) {
            System.out.println("The string is either null or contains only whitespace.");
        } else {
            System.out.println("The string is NOT null and contains non-whitespace characters.");
        }

        scanner.close();
    }
}
