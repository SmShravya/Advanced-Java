/*Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
Collections.swap(l_list, 0, 2)) */
 

package LinkedList;
import java.util.Collections;
import java.util.LinkedList;

public class SwapLinkedListElements {
    public static void main(String[] args) {
        // Create a linked list and add some elements
        LinkedList<String> l_list = new LinkedList<>();
        l_list.add("Apple");   // index 0
        l_list.add("Banana");  // index 1
        l_list.add("Cherry");  // index 2
        l_list.add("Date");    // index 3

        System.out.println("Original LinkedList: " + l_list);

        // Swap the first and third elements (index 0 and index 2)
        Collections.swap(l_list, 0, 2);

        System.out.println("LinkedList after swapping first and third elements: " + l_list);
    }
}
