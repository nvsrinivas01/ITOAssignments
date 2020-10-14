package com.itorizon.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
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
public class HashSetAssignment {

	/*
	 *
	 * This class contains necessary utility methods to perform various operations
	 * on HashSet, and it also contains different HashSet operations
	 * 
	 */

	/**
	 * 
	 * assignment method contains list of all the assignment question solutions
	 * 
	 */
	public static void assignment() {

		// Write java programs showing following functionalities using a HashSet
		// to add student names in a hash set.

		Set<String> students = new HashSet<String>();
		students.add("Sudhakar");
		students.add("Neha");
		students.add("Shiv");
		students.add("Shri");
		students.add("Swamy");
		System.out.print("HashSet of Students: ");
		System.out.println(students);

		// to append the specified element to the end of a hash set.
		System.out.println("\nSourceHashSet: " + students);
		students.add("Karan");
		System.out.println("After adding element at the end of HashSet: " + students);

		// to iterate through all elements in a hash list.
		System.out.print("\nIterating through the HashSet: ");
		for (Iterator iterator = students.iterator(); iterator.hasNext();) {
			System.out.print(iterator.next() + "  ");
		}

		// to get the number of elements in a hash set.
		System.out.println("\n\nNumber of Elements present in HashSet: " + students.size());

		// to convert a hash set to an array.
		Object[] studentArray = students.toArray();
		System.out.println("\nEquivalent Array of HashSet: " + Arrays.toString(studentArray));

		// to convert a hash set to a List/ArrayList.
		ArrayList<String> studentsArrayList = new ArrayList<String>(students);
		System.out.println("\nEquivalent ArrayList of HashSet: " + studentsArrayList);

		// to compare two hash set.
		Set<String> students2 = new HashSet<String>();
		students2.add("Sudhakar");
		students2.add("Neha");
		students2.add("Shiv");
		students2.add("Shri");
		students2.add("Swamy");
		System.out.println("\nComparing Two HashSet Objects");
		System.out.println("HashSet-1: " + students);
		System.out.println("HashSet-2: " + students2);
		System.out.println("Result: " + (students.equals(students2) ? true : false));

		// to compare two sets and retain elements which are same on both sets.
		System.out.println("\nComparing Two HashSet objects and retaining common elements in 'students' HashSet");
		students.retainAll(students2);
		System.out.println("Retained 'students' HashSet" + students);

		// to remove all of the elements from a hash set.
		System.out.println("\nSource HashSet: " + students);
		students.removeAll(students);
		System.out.println("After Removing all of the elements from Source HashSet: " + students);

		// to empty an hash set.
		System.out.println("\nSource HashSet: " + students2);
		students2.clear();
		System.out.println("After Removing all of the elements from Source HashSet: " + students2);

	}
}
