package ListOperationsDemo;

import java.util.*;

public class ListOperations {
    public static void main(String[] args) {
        // Initial Lists
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        // Common elements
        List<String> initialFruits = Arrays.asList("Apple", "Banana", "Orange");
        List<String> moreFruits = Arrays.asList("Mango", "Grapes");

        // 1. Adding elements
        arrayList.addAll(initialFruits);
        linkedList.addAll(initialFruits);

        // 2. Adding element at specific index
        arrayList.add(1, "Pineapple");
        linkedList.add(1, "Pineapple");

        // 3. Adding multiple elements
        arrayList.addAll(moreFruits);
        linkedList.addAll(moreFruits);

        // 4. Accessing elements
        System.out.println("ArrayList Element at index 2: " + arrayList.get(2));
        System.out.println("LinkedList Element at index 2: " + linkedList.get(2));

        // 5. Updating elements
        arrayList.set(0, "Strawberry");
        linkedList.set(0, "Strawberry");

        // 6. Removing elements
        arrayList.remove("Banana");
        linkedList.remove("Banana");

        // 7. Searching elements
        System.out.println("ArrayList contains Mango: " + arrayList.contains("Mango"));
        System.out.println("LinkedList contains Mango: " + linkedList.contains("Mango"));

        // 8. List size
        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("LinkedList size: " + linkedList.size());

        // 9. Iterating over list using for-each
        System.out.println("\nIterating ArrayList using for-each:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        System.out.println("\nIterating LinkedList using for-each:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        // 10. Using Iterator
        System.out.println("\nIterating ArrayList using Iterator:");
        Iterator<String> arrayIterator = arrayList.iterator();
        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }

        System.out.println("\nIterating LinkedList using Iterator:");
        Iterator<String> linkedIterator = linkedList.iterator();
        while (linkedIterator.hasNext()) {
            System.out.println(linkedIterator.next());
        }

        // 11. Sorting
        Collections.sort(arrayList);
        Collections.sort(linkedList);
        System.out.println("\nSorted ArrayList: " + arrayList);
        System.out.println("Sorted LinkedList: " + linkedList);

        // 12. Sublist
        List<String> arraySublist = arrayList.subList(1, 3); // index 1 to 2
        List<String> linkedSublist = linkedList.subList(1, 3);
        System.out.println("\nArrayList Sublist (1-3): " + arraySublist);
        System.out.println("LinkedList Sublist (1-3): " + linkedSublist);

        // 13. Clearing the list
        arrayList.clear();
        linkedList.clear();
        System.out.println("\nArrayList after clearing: " + arrayList);
        System.out.println("LinkedList after clearing: " + linkedList);
    }
}
