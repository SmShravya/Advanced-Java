// 1. Write a java program for getting different colors through ArrayList interface and search whether
// the color "Red" is available or not
// (Hint : Use ArrayListObj.contains())

package ArrayList;

import java.util.*;

public class ColorSearch {
    public static void main(String[] args) {

        List<String> ls = new ArrayList<>();
        ls.add("Orange");
        ls.add("Green");  // corrected spelling
        ls.add("Pink");
        ls.add("Red");    // capitalized "Red" to match search term

        System.out.println(ls);

        // Check if "Red" is in the list
        if (ls.contains("Red")) {
            System.out.println("Contains Red");
        } else {
            System.out.println("Does NOT contain Red");
        }
    }
}
