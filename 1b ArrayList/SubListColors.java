// 4. Write a Java program for getting different colors through ArrayList interface
// and extract the elements 1st and 2nd from the ArrayList object by using subList()

package ArrayList;

import java.util.*;

public class SubListColors {
    public static void main(String[] args) {
        // Create an ArrayList and add color names
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");     // index 0
        colors.add("Green");   // index 1
        colors.add("Blue");    // index 2
        colors.add("Yellow");  // index 3

        // Display the original list
        System.out.println("Original List: " + colors);

        // Extract 1st and 2nd elements using subList (i.e., index 0 to 2)
        List<String> extractedColors = colors.subList(0, 2);

        // Display the extracted sublist
        System.out.println("Extracted Elements (1st and 2nd): " + extractedColors);
    }
}
