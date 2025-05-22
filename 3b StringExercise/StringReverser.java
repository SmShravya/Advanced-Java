/**
 * Write a Java Program for Reversing the characters in a string
 * using user defined function reverseString().
 */

package StringExercise1;

import java.util.Scanner;

public class StringReverser {

    // Function to reverse the characters of a string
    public static String reverseString(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        String reversed = reverseString(input);

        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }
}
