/*Include the following elements into the LinkedHashMap called programminglanguages and print all
of them.
("Java", 1995);("Python", 1991);(“JavaScript", 1995);("C++", 1985); */

package SetInterface;

import java.util.*;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Integer> programminglanguages = new LinkedHashMap<>();
		programminglanguages.put("Java", 1995);
		programminglanguages.put("Python", 1991);
		programminglanguages.put("JavaScript", 1995);
		programminglanguages.put("C++", 1985);
		System.out.println(programminglanguages);
	}

}