// 6. Write a Java program to iterate through all elements in a linked list 
// starting at the specified position (2nd) using iterator 
// (Hint: Iterator iteratorobj = listobj.listIterator(1))

package LinkedList;

import java.util.*;

public class LinkedListIteratorDemo {
    public static void main(String[] args) {
        // Create a LinkedList and add elements
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");     // index 0
        colors.add("Green");   // index 1
        colors.add("Blue");    // index 2
        colors.add("Yellow");  // index 3
        colors.add("Orange");  // index 4

        // Display the list
        System.out.println("Original LinkedList: " + colors);

        // Create an iterator starting at the 2nd element (index 1)
        Iterator<String> iterator = colors.listIterator(1);

        System.out.println("Iterating from 2nd element (index 1):");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
