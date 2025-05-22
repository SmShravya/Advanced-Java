// 2. Write a Java program for getting different colors through ArrayList interface
// and remove the 2nd element and color "Blue" from the ArrayList

package ArrayList;

import java.util.*;

public class RemoveColors {
    public static void main(String[] args) {
        // Create an ArrayList and add colors
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("Original List: " + colors);

        // Remove the 2nd element (index 1)
        colors.remove(1);  // Removes "Green"

        // Remove color "Blue"
        colors.remove("Blue");

        // Print the updated list
        System.out.println("Updated List after removals: " + colors);
    }
}
