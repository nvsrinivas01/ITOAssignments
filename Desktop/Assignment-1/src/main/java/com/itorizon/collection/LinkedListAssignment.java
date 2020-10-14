package com.itorizon.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import org.springframework.stereotype.Component;

/**
 * 
 * @author Srinivas N V
 * @version 1.0.0
 * 
 */

@Component
public class LinkedListAssignment {
	/*
	 *
	 * This class contains necessary utility methods to perform various operations
	 * on LinkedList, and it also contains different LinkedList operations
	 * 
	 */

	/**
	 * 
	 * assignment method contains list of all the assignment question solutions
	 * 
	 */
	public static void assignment() {
		LinkedList<String> colors = new LinkedList<String>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Black");
		colors.add("White");
		colors.add("Pink");
		colors.add("Yellow");
		System.out.println("LinkedList of Colors: " + colors);
		// Write java programs showing following functionalities using a LinkedList
		// to append the specified element to the end of a linked list.
		colors.addLast("Grey");
		System.out.println("\nAfter adding element at Last: " + colors);

		// to iterate through all elements in a linked list.
		System.out.print("\nIterating through all elements in a LinkedList: ");
		for (Iterator iterator = colors.iterator(); iterator.hasNext();) {
			System.out.print(iterator.next() + "  ");
		}

		// to iterate through all elements in a linked list starting at the specified
		// position.
		System.out.print("\n\nIterating from specific elements in a LinkedList: ");
		for (Iterator iterator = colors.listIterator(1); iterator.hasNext();) {
			System.out.print(iterator.next() + "  ");
		}

		// to iterate a linked list in reverse order.
		System.out.print("\n\nIterating in reverse order from a LinkedList: ");
		for (Iterator iterator = colors.descendingIterator(); iterator.hasNext();) {
			System.out.print(iterator.next() + "  ");
		}

		// to insert the specified element at the specified position in the linked list.
		colors.add(3, "Brown");
		System.out.println("\n\nAfter adding element at Specific position: " + colors);

		// to insert the specified element at the front of a linked list.\
		colors.addFirst("Maroon");
		System.out.println("\nAfter adding element at First position: " + colors);

		// to insert the specified element at the end of a linked list.
		colors.addLast("Magenta");
		System.out.println("\nAfter adding element at Last position: " + colors);

		// to display the elements and their positions in a linked list.
		System.out.println("\nDisplaying the elements and their positions in a LinkedList");
		for (int i = 0; i < colors.size(); i++) {
			System.out.println("Element at index " + i + ": " + colors.get(i));
		}

		// to remove first and last element from a linked list.
		System.out.println("\nSource LinkedList: " + colors);
		colors.removeFirst();
		System.out.println("After Removing First Element: " + colors);
		colors.removeLast();
		System.out.println("After Removing Last Element: " + colors);

		// to remove all the elements from a linked list.
		LinkedList<String> names = new LinkedList<String>();
		names.add("Karan");
		names.add("Arjun");
		names.add("Ram");
		names.add("Laxman");
		names.add("Rahim");
		names.add("Antony");
		System.out.println("\nSource LinkedList: " + names);
		names.clear();
		System.out.println("After removing all the elements in LinkedList: " + names);

		// to join two linked lists.
		LinkedList<String> joinLinkedList = new LinkedList<String>();
		LinkedList<String> names1 = new LinkedList<String>();
		names1.add("Karan");
		names1.add("Arjun");
		names1.add("Ram");
		names1.add("Laxman");
		names1.add("Rahim");
		names1.add("Antony");
		joinLinkedList.addAll(colors);
		joinLinkedList.addAll(names1);
		System.out.println("\nJoined Two LinkedList Objects (colors and names1): " + joinLinkedList);

		// to clone an linked list to another linked list.
		LinkedList<String> cloneColors = (LinkedList<String>) colors.clone();
		System.out.println("\nSource LinkedList: " + colors);
		System.out.println("Cloned LinkedList: " + cloneColors);

		// to remove and return the first element of a linked list.
		System.out.println("\nSource LinkedList: " + colors);
		String firstElementString = colors.removeFirst();
		System.out.println("First Element removed from LinkedList: " + firstElementString);

		// to retrieve but does not remove, the first element of a linked list.
		System.out.println("\nSource LinkedList: " + colors);
		String peekFirstString = colors.peekFirst();
		System.out.println("First Element retrieved from LinkedList: " + peekFirstString);

		// to check if a particular element exists in a linked list.
		System.out.println("\nChecking for element 'Black' : " + colors.contains("Black"));

		// to convert a linked list to array list.
		System.out.println("\nSource LinkedList: " + colors);
		ArrayList<String> colorsArrayList = new ArrayList<String>(colors);
		System.out.println("Equivalent ArrayList of LinkedList 'colors': " + colorsArrayList);
	}

}
