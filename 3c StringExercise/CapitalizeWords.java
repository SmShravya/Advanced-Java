/**
 * Write a Java Program for Capitalizing the first letter of each word
 * using user defined function capitalizeWords().
 */

package StringExercise2;

import java.util.Scanner;

public class CapitalizeWords {

    // Function to capitalize the first letter of each word in a string
    public static String capitalizeWords(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        String[] words = str.split("\\s+");
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                capitalized.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) {
                    capitalized.append(word.substring(1).toLowerCase());
                }
                capitalized.append(" ");
            }
        }

        return capitalized.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String output = capitalizeWords(input);

        System.out.println("Capitalized: " + output);

        scanner.close();
    }
}
