// 8. Write a Java program to insert the specified element at the end of a linked list 
// (using l_listobj.offerLast("Pink"))

package LinkedList;

import java.util.*;

public class InsertAtEndLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList and add some colors
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Original LinkedList: " + colors);

        // Insert "Pink" at the end using offerLast()
        colors.offerLast("Pink");

        System.out.println("LinkedList after adding 'Pink' at the end: " + colors);
    }
}
