// 3. Write a Java program for getting different colors through ArrayList interface
// and sort them using Collections.sort(ArrayListObj)

package ArrayList;

import java.util.*;

public class SortColors {
    public static void main(String[] args) {
        // Create an ArrayList and add color names
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");

        // Display original list
        System.out.println("Original List: " + colors);

        // Sort the ArrayList
        Collections.sort(colors);

        // Display sorted list
        System.out.println("Sorted List: " + colors);
    }
}
