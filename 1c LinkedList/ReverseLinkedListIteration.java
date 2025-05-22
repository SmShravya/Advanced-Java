// 7. Write a Java program to iterate a linked list in reverse order 
//(using objlist.descendingIterator())

package LinkedList;

import java.util.*;

public class ReverseLinkedListIteration {
    public static void main(String[] args) {
        // Create a LinkedList and add elements
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        System.out.println("Original LinkedList: " + colors);

        // Get the descending iterator for reverse iteration
        Iterator<String> descIterator = colors.descendingIterator();

        System.out.println("Iterating LinkedList in reverse order:");
        while (descIterator.hasNext()) {
            System.out.println(descIterator.next());
        }
    }
}
