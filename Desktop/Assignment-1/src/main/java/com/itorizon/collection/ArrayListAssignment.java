package com.itorizon.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 * 
 * @author Srinivas N V
 * @version 1.0.0
 * 
 */

@Component
public class ArrayListAssignment {
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
		// Write java programs showing following functionalities using an ArrayList.
		// to create a new array list containing student names, add some student
		// (string) and print out the collection.
		List<String> students = new ArrayList<String>();
		students.add("Sudhakar");
		students.add("Neha");
		students.add("Shiv");
		students.add("Shri");
		students.add("Swamy");

		System.out.print("ArrayList of Students: ");
		System.out.println(students);

		// to iterate through all elements in a array list.
		System.out.print("\nIterating through all elements in a Array List: ");
		for (Iterator iterator = students.iterator(); iterator.hasNext();) {
			System.out.print(iterator.next() + "  ");
		}

		// to insert an element into the array list at the first position.
		students.add(0, " Lakshmeesh");

		// to retrieve an element (at a specified index) from a given array list.
		students.get(2);

		// to update specific array element by given element.
		students.set(2, "Srinivas");

		// to remove the third element from a array list.
		students.remove(3);

		// to search an element in a array list.
		System.out.println((students.contains("Neha") ? "\n\nElement Found" : "\n\nElement Not Found"));

		// to sort a given array list.
		System.out.println("\nArrayList: " + students);
		Collections.sort(students);
		System.out.println("Sorted ArrayList: " + students);

		// to copy one array list into another.
		List<String> newStudents = new ArrayList<String>();
		for (String newStudent : students) {
			newStudents.add(newStudent);
		}
		System.out.println("\nCopy of Source ArrayList: " + newStudents);

		// to reverse elements in a array list.
		Collections.reverse(newStudents);
		System.out.println("\nReverse of  ArrayList: " + newStudents);

		// to join two array lists.
		ArrayList<String> joinStudents = new ArrayList<String>();
		joinStudents.addAll(students);
		joinStudents.addAll(newStudents);
		System.out.println("\nJoined Two ArrayList Objects (students and newStudents): " + joinStudents);

		// to clone an array list to another array list.
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Black");
		colors.add("White");
		colors.add("Pink");
		System.out.println("\nOriginal array list: " + colors);
		ArrayList<String> cloneColors = (ArrayList<String>) colors.clone();
		System.out.println("Cloned ArrayList: " + cloneColors);

		// to empty an array list.
		System.out.println("\nnewStudents AttayList: " + newStudents);
		newStudents.clear();
		System.out.println("After Emptying newStudents AttayList: " + newStudents);

		// to test an array list is empty or not.
		System.out.println("\nStudents List Empty Check: " + students.isEmpty());

	}

	// Write java programs showing following functionalities using a TreeMap
	// to create a TreeMap of <studentId(Integer), studentName(String)>. Add some
	// student reocrds with random student ids.
	// to get all keys from the given a Tree Map.
	// to delete all elements from a given Tree Map.
	// to sort keys in Tree Map by using comparator.
	// to get the first (lowest) key and the last (highest) key currently in a map.
	// to get a reverse order view of the keys contained in a given map.
	//

}
