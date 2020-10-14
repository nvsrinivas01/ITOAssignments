package com.itorizon.collection;

import java.util.Set;
import java.util.TreeMap;

import org.springframework.stereotype.Component;

/**
 * 
 * @author Srinivas N V
 * @version 1.0.0
 * 
 */

@Component
public class TreeMapAssignment {
	/*
	 *
	 * This class contains necessary utility methods to perform various operations
	 * on ArrayList, and it also contains different ArrayList operations
	 * 
	 */

	/**
	 * 
	 * assignment method contains list of all the assignment question solutions
	 * 
	 */
	public static void assignment() {

		// Write java programs showing following functionalities using a TreeMap
		// to create a TreeMap of <studentId(Integer), studentName(String)>. Add some
		// student reocrds with random student ids.

		TreeMap<Integer, String> students = new TreeMap<Integer, String>();
		students.put(15, "Sudhakar");
		students.put(22, "Neha");
		students.put(9, "Shiv");
		students.put(35, "Shri");
		students.put(52, "Swamy");

		System.out.print("TreeMap of Students: ");
		System.out.println(students);

		// to get all keys from the given a Tree Map.
		System.out.print("\nAll Keys of TreeMap : ");
		Set<Integer> keys = students.keySet();
		for (Integer key : keys) {
			System.out.print(key + " ");
		}

		// to get the first (lowest) key and the last (highest) key currently in a map.
		System.out.println("\n\nTreeMap: " + students);
		System.out.println("Lowest Key: " + students.firstKey());
		System.out.println("Highest Key: " + students.lastKey());

		// to get a reverse order view of the keys contained in a given map.
		System.out.println("\nTreeMap : " + students);
		System.out.println("Reverse order view of the keys: " + students.descendingKeySet());

		// to delete all elements from a given Tree Map.
		System.out.println("\nTreeMap : " + students);
		students.clear();
		System.out.println("After deleting all elements from TreeMap : " + students);

		// to sort keys in Tree Map by using comparator.
		TreeMap<Integer, String> students1 = new TreeMap<Integer, String>(new SortKeyUsingComparator());
		students1.put(15, "Sudhakar");
		students1.put(22, "Neha");
		students1.put(9, "Shiv");
		students1.put(35, "Shri");
		students1.put(52, "Swamy");

		System.out.print("\nTreeMap of Students: ");
		System.out.println(students1);
	}

}
