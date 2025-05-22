// 5. Write a Java program for getting different colors through ArrayList interface
// and delete nth element from the ArrayList object by using remove by index

package ArrayList;

import java.util.*;

public class DeleteNthColor {
    public static void main(String[] args) {
        // Create an ArrayList and add color names
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");     // index 0
        colors.add("Green");   // index 1
        colors.add("Blue");    // index 2
        colors.add("Yellow");  // index 3
        colors.add("Orange");  // index 4

        // Display original list
        System.out.println("Original List: " + colors);

        // Specify n (for example, delete 3rd element, i.e., index 2)
        int n = 3;

        // Remove the nth element if valid
        if (n > 0 && n <= colors.size()) {
            colors.remove(n - 1);  // Convert to 0-based index
            System.out.println("List after deleting " + n + "rd element: " + colors);
        } else {
            System.out.println("Invalid position: " + n);
        }
    }
}
