package com.itorizon.collection;

import java.util.Iterator;
import java.util.TreeSet;

import org.springframework.stereotype.Component;

/**
 * 
 * @author Srinivas N V
 * @version 1.0.0
 * 
 */

@Component
public class TreeSetAssignment {
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

		// Write java programs showing following functionalities using a TreeSet
		// to create a new tree set, add some random numbers (Integer) and print out the
		// tree set.
		TreeSet<Integer> randomNumbers = new TreeSet<Integer>();
		randomNumbers.add(1);
		randomNumbers.add(5);
		randomNumbers.add(6);
		randomNumbers.add(3);
		randomNumbers.add(9);
		randomNumbers.add(7);
		System.out.println("TreeSet of Random Numbers: " + randomNumbers);

		// to iterate through all elements in a tree set.
		System.out.print("\nIterating through the TreeSet: ");
		for (Iterator iterator = randomNumbers.iterator(); iterator.hasNext();) {
			System.out.print(iterator.next() + "  ");
		}

		// to add all the elements of a specified tree set to another tree set.
		System.out.println("\n\nTreeSet - 1: " + randomNumbers);
		TreeSet<Integer> randomNumbers2 = new TreeSet<Integer>();
		randomNumbers2.add(15);
		randomNumbers2.add(12);
		randomNumbers2.add(13);
		randomNumbers2.add(19);
		randomNumbers2.add(17);
		randomNumbers2.add(18);
		System.out.println("TreeSet - 2: " + randomNumbers2);
		randomNumbers.addAll(randomNumbers2);
		System.out.println("After Adding all the elements from TreeSet-2 to TreeSet-1: " + randomNumbers);

		// to create a reverse order view of the elements contained in a given tree set.
		System.out.println("\nTreeSet: " + randomNumbers);
		System.out.print("Reverse Order View: ");
		for (Iterator iterator = randomNumbers.descendingIterator(); iterator.hasNext();) {
			System.out.print(iterator.next() + "  ");
		}

		// to get the first and last elements in a tree set.
		System.out.println("\n\nTreeSet: " + randomNumbers);
		System.out.println("First Element: " + randomNumbers.first());
		System.out.println("Last Element: " + randomNumbers.last());

		// to get the number of elements in a tree set.
		System.out.println("No of Elements in the TreeSet: " + randomNumbers.size());

		// to find the numbers less than 7 in a tree set.
		TreeSet<Integer> treeheadset = new TreeSet<Integer>();
		treeheadset = (TreeSet) randomNumbers.headSet(7);
		System.out.print("\nNumbers Less than 7 in TreeSet: " + treeheadset);

		// to get the element in a tree set which is greater than or equal to the given
		// element.
		System.out.println("\n\nTreeSet: " + randomNumbers);
		System.out.println("Greater than or equal to 15 : " + randomNumbers.ceiling(15));
		System.out.println("Greater than or equal to 16 : " + randomNumbers.ceiling(16));

		// to retrieve and remove the first element of a tree set.
		System.out.println("\nTree set: " + randomNumbers);
		System.out.println("Removes the first element: " + randomNumbers.pollFirst());
		System.out.println("After Removing First ELement in Tree set: " + randomNumbers);

		// to retrieve and remove the last element of a tree set.
		System.out.println("\nTree set: " + randomNumbers);
		System.out.println("Removes the Last element: " + randomNumbers.pollLast());
		System.out.println("After Removing Last ELement in Tree set: " + randomNumbers);

		// to remove a given element from a tree set.
		System.out.println("\nTree set: " + randomNumbers);
		System.out.println("Removes the Specific element: " + randomNumbers.remove(12));
		System.out.println("After Removing Specific Element in Tree set: " + randomNumbers);

	}

}
