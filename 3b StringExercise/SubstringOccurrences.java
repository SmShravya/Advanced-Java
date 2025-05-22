/**
 * Write a Java Program for Counting how many times a substring appears in a main string
 * using user defined function countOccurrences()
 */

package StringExercise1;

import java.util.Scanner;

public class SubstringOccurrences {

    // Function to count occurrences of 'sub' in 'mainStr'
    public static int countOccurrences(String mainStr, String sub) {
        if (mainStr == null || sub == null || sub.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;

        while ((index = mainStr.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();  // Move past this occurrence
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String mainStr = scanner.nextLine();

        System.out.print("Enter substring to count: ");
        String sub = scanner.nextLine();

        int occurrences = countOccurrences(mainStr, sub);

        System.out.println("Occurrences: " + occurrences);

        scanner.close();
    }
}
