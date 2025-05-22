// 4. Write a Java program to display elements and their positions in a linked list 
// (using l_listobj.get(p))

package LinkedList;

import java.util.*;

public class DisplayElementsWithPositions {
    public static void main(String[] args) {
        // Create a LinkedList and add some colors
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Display elements and their positions
        System.out.println("Elements and their positions in the linked list:");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Position " + i + ": " + colors.get(i));
        }
    }
}
