/**
 * Write a Java Program for Shortening a string to a specified length
 * and adds an ellipsis using user defined function truncate().
 */

package StringExercise2;

import java.util.Scanner;

public class StringTruncator {

    // Function to truncate a string to maxLength and add "..." if truncated
    public static String truncate(String str, int maxLength) {
        if (str == null || maxLength <= 0) {
            return "";
        }
        if (str.length() <= maxLength) {
            return str;
        }
        if (maxLength <= 3) {
            // If maxLength too small, just return substring without ellipsis
            return str.substring(0, maxLength);
        }
        // Truncate and add ellipsis
        return str.substring(0, maxLength - 3) + "...";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string to truncate: ");
        String input = scanner.nextLine();

        System.out.print("Enter maximum length: ");
        int maxLength = scanner.nextInt();

        String truncated = truncate(input, maxLength);

        System.out.println("Truncated string: " + truncated);

        scanner.close();
    }
}
