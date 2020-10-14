package com.itorizon.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.springframework.stereotype.Component;

/**
 * 
 * @author Srinivas N V
 * @version 1.0.0
 * 
 */

@Component
public class HashMapAssignment {
	/*
	 *
	 * This class contains necessary utility methods to perform various operations
	 * on TreeSet, and it also contains different TreeSet operations
	 * 
	 */

	/**
	 * 
	 * assignment method contains list of all the assignment question solutions
	 * 
	 */

	public static void assignment() {

		// Write java programs showing following functionalities using a HashMap
		// to create a HashMap of key as student id(Integer) and value as Student name
		// (String). Add some entries and print the hash map.

		HashMap<Integer, String> students = new HashMap<Integer, String>();
		students.put(1, "Sudhakar");
		students.put(2, "Neha");
		students.put(3, "Shiv");
		students.put(4, "Shri");
		students.put(5, "Swamy");

		System.out.print("HashMap of Students: ");
		System.out.println(students);

		// to iterate over all the entries in the HashMap.
		Set studentsSet = students.entrySet();
		System.out.print("\nIterating through all elements in a HashMap: ");
		for (Iterator iterator = studentsSet.iterator(); iterator.hasNext();) {
			System.out.print(iterator.next() + "  ");
		}

		// to get the specified value with the specified key in a HashMap.
		System.out.println("\n\nGetting  the specified value with the specified key (2): " + students.get(2));

		// to count the number of key-value (size) mappings in a map.
		System.out.println("\nSize of HashMap: " + students.size());

		// to copy all of the mappings from the specified map to another map.
		System.out.println("\nHashMap-1:  " + students);
		HashMap<Integer, String> students2 = new HashMap<Integer, String>();
		students2.put(6, "Soumya");
		students2.put(7, "Chandani");
		students2.put(8, "Manju");
		students2.put(9, "Vidya");
		students2.put(10, "Bipin");
		System.out.println("HashMap-2:  " + students2);
		students.putAll(students2);
		System.out.println("After Copying HashMap-2 elements to HashMap-1: " + students);

		// to remove all of the mappings from a map.
		System.out.println("\nSource HashMap:  " + students2);
		students2.clear();
		System.out.println("After removing all of the mappings from a HashMap: " + students2);

		// to test if a map contains a mapping for the specified key.
		System.out.println("\nSource HashMap:  " + students);
		System.out
				.println("Testing if HashMap contains a mapping for the specified key (3): " + students.containsKey(3));

		// to test if a map contains a mapping for the specified value.
		System.out.println("\nSource HashMap:  " + students);
		System.out.println("Testing if HashMap contains a mapping for the specified value (Shiv): "
				+ students.containsValue("Shiv"));

		// to get the value of a specified key in a map.
		System.out.println("\nSource HashMap:  " + students);
		System.out.println("Value of Specified Key (1): " + students.get(1));

		// to get a set view of the keys contained in this map.
		Set keySet = students.keySet();
		System.out.println("\nKey set values are: " + keySet);

		// to get a collection view of the values contained in this map.
		System.out.println("\nCollection view of the Values: " + students.values());
	}
}
