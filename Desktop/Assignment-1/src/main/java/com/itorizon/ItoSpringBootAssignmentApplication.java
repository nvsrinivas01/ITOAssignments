package com.itorizon;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.itorizon.arrays.ArraysAssignment;
import com.itorizon.collection.ArrayListAssignment;
import com.itorizon.collection.HashMapAssignment;
import com.itorizon.collection.HashSetAssignment;
import com.itorizon.collection.LinkedListAssignment;
import com.itorizon.collection.SortKeyUsingComparator;
import com.itorizon.collection.TreeMapAssignment;
import com.itorizon.collection.TreeSetAssignment;
import com.itorizon.exception.ExceptionAssignment;
import com.itorizon.string.StringAssignment;

@SpringBootApplication
public class ItoSpringBootAssignmentApplication implements CommandLineRunner {

	@Autowired
	private ArraysAssignment arraysAssignment;

	@Autowired
	private ArrayListAssignment arrayListAssignment;

	@Autowired
	private LinkedListAssignment linkedListAssignment;

	@Autowired
	private TreeSetAssignment treeSetAssignment;

	@Autowired
	private HashMapAssignment hashSetAssignment;

	@Autowired
	private TreeMapAssignment treeMapAssignment;

	@Autowired
	private SortKeyUsingComparator sortKeyUsingCOmparator;

	@Autowired
	private StringAssignment stringAssignment;

	@Autowired
	private ExceptionAssignment exceptionAssignment;

	public static void main(String[] args) {
		SpringApplication.run(ItoSpringBootAssignmentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Arrays to test methods
		System.out.println("\n\nArray Assignment Method Resolutions");
		System.out.println("-------------------------------------------");
		int[] arr = { 55, 22, 27, 22, 85, 25, 66, 59 };

		int[] arr1 = { 1, 1, 5, 2, 3, 2, 65, 4, 9, 77, 8 };

		int[] arr2 = { 2, 7, 4, -5, 11, 5, 20 };

		int[] arr3 = { 1, 2, 4, 5, 6 };

		int[] arr4 = { 2, 7, 4, 0, 11, 5, -1 };

		int[] arr5 = { 10, 7, 10, 10, 11, 5, -1 };

		int[] arr6 = { 20, 20, 30, 40, 50, 50, 50 };

		int[] arr7 = { 1, 2, 4, 5, 6 };


		// key to test contains method
		int key = 85;

		// rows to test printGrid method
		int rows = 6;

		// columns to test printGrid method
		int columns = 9;

		// to test removeElement method
		int element = 66;

		// to test sumOfTwoElements method
		int target = 6;

		// String Array for Test Purpose
		String[] stringArray = { "bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu" };

		// Array Method resolutions
		ArraysAssignment.sort(arr);

		ArraysAssignment.sum(arr);

		arraysAssignment.printGrid(rows, columns);

		ArraysAssignment.average(arr);

		boolean result = ArraysAssignment.contains(arr, key);
		System.out.printf("%n" + result + "%n%n");

		int status = ArraysAssignment.indexOf(arr, key);
		System.out.println("Index of element " + element + " in the array: " + status + "\n");

		String resultantString = ArraysAssignment.removeElement(arr, element);
		System.out.println("Modifies Array: " + resultantString);

		ArraysAssignment.copyArray(arr);

		ArraysAssignment.insert();

		String minMax = ArraysAssignment.minAndMax(arr);
		System.out.println(minMax);

		ArraysAssignment.reverseArray(arr);

		ArraysAssignment.duplicateElements(arr);
		System.out.println();

		ArraysAssignment.stringDuplicates(stringArray);

		ArraysAssignment.stringArrayCommonElements();

		ArraysAssignment.integerArrayCommonElements();

		int[] resultantArray = ArraysAssignment.removeDuplicateElements(arr1);
		System.out.println("\n Source Array: " + Arrays.toString(arr1));
		System.out.println("Array afer removing Duplicates: " + Arrays.toString(resultantArray));

		ArraysAssignment.secondLargestElement(arr1);

		ArraysAssignment.secondSmallestElement(arr1);

		ArraysAssignment.addTwoMatrices();

		ArraysAssignment.toArrayList();

		ArraysAssignment.arrayListToArray();

		ArraysAssignment.pairSum(arr2, 15);

		ArraysAssignment.arrayEqualityTest();

		int missingNumber = ArraysAssignment.getMissingNo(arr3);
		System.out.println("\nSource Array: " + Arrays.toString(arr3));
		System.out.println("Missing Number in Array: " + missingNumber);

		ArraysAssignment.commonElementsInThreeSortedArrays();

		ArraysAssignment.pushZerosToEnd();

		ArraysAssignment.oddEven();

		ArraysAssignment.findDifference(arr1);

		ArraysAssignment.findAverage(arr3);

		String checkResult = ArraysAssignment.check(arr3);
		System.out.println(checkResult);

		boolean check = ArraysAssignment.sumThirty(arr5);
		System.out.println("\n" + check);

		boolean checkSpecificNumber = ArraysAssignment.checkSpecificNumber(arr1);
		System.out.println("\n" + checkSpecificNumber);

		int newLength = ArraysAssignment.removeDuplicates(arr6);
		System.out.println("\nArray length before removing duplicates: " + arr6.length);
		System.out.println("New Array length after removing duplicates: " + newLength);

		ArraysAssignment.sumOfTwoElements(arr7, target);

		ArraysAssignment.sumClosestToZero(arr4);

		ArraysAssignment.firstAndSecondSmallest(arr1);

		ArraysAssignment.segregateArray();

		ArraysAssignment.arrangeArray();

		ArraysAssignment.positiveElementsBefore();

		ArraysAssignment.arrangeOddEven();

		// Collection Method resolutions
		System.out.println("\n\nCollection Assignment Method Resolutions");
		System.out.println("------------------------------------------------");

		// ArrayList Assignment
		System.out.println("ArrayList Assignment");
		System.out.println("-----------------------");
		ArrayListAssignment.assignment();

		// LinkedList Assignment
		System.out.println("\n\nLinkedList Assignment");
		System.out.println("------------------------");
		LinkedListAssignment.assignment();

		// HashSetAssignment
		System.out.println("\n\nHashSet Assignment");
		System.out.println("------------------------");
		HashSetAssignment.assignment();

		// TreeSetAssignment
		System.out.println("\n\nTreeSet Assignment");
		System.out.println("------------------------");
		TreeSetAssignment.assignment();

		// HashMapAssignment
		System.out.println("\n\nHashMap Assignment");
		System.out.println("------------------------");
		HashMapAssignment.assignment();

		// TreeMapAssignment
		System.out.println("\n\nTreeMap Assignment");
		System.out.println("------------------------");
		TreeMapAssignment.assignment();

		// String Method resolutions
		System.out.println("\n\nString Assignment Method Resolutions");
		System.out.println("-------------------------------------------");

		StringAssignment.charactersCount();

		StringAssignment.vowelsAndConsonantsCount();

		StringAssignment.splitString();

		StringAssignment.removeWhiteSpaces();

		StringAssignment.caseConversion();

		StringAssignment.replaceCharacter();

		StringAssignment.maxAndMinCharacters();

		StringAssignment.reverseString();

		StringAssignment.duplicateCharacters();

		StringAssignment.duplicateWords();

		StringAssignment.frequencyOfCharacters();

		StringAssignment.individualCharacter();

		StringAssignment.chatToString();

		StringAssignment.stringToChar();

		StringAssignment.sortString();

		// Exception Method resolutions
		System.out.println("\n\nException Assignment Method Resolutions");
		System.out.println("---------------------------------------------");

		ExceptionAssignment.divide();

		ExceptionAssignment.stackTrace();
	}
}
