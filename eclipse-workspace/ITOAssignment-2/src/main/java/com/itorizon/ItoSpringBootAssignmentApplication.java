package com.itorizon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.itorizon.arrays.ArraysAssignment;
import com.itorizon.exception.ExceptionAssignment;
import com.itorizon.string.StringAssignment;

@SpringBootApplication
public class ItoSpringBootAssignmentApplication implements CommandLineRunner {

	@Autowired
	private ArraysAssignment arraysAssignment;

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

		int[] arr8 = { 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1 };

		int[] arr9 = { 1, -2, 3, -5, -8, -3, 2, 5, 4, -1 };

		int[] arr10 = { -4, 8, 6, -5, 6, -2, 1, 2, 3, -11 };

		int[] arr11 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int[] arr12 = { 55, 22, 27, 22, 85, 25, 66, 59 };

		int[] arr13 = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };

		String[] firstArray = { "Srinivas", "Shivling", "Neha", "Swamy", "Lakshmesh" };

		String[] secondArray = { "Swamy", "Srinivas", "Soumya", "Sunil", "Shree", "Karan", "Amith" };

		// key to test contains method
		int key = 55;

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

//		// Array Method resolutions
//		int[] sortedArray = ArraysAssignment.sort(arr12);
//		System.out.printf("Sorted Array : %s %n", Arrays.toString(sortedArray));
//
//		int sum = ArraysAssignment.sum(arr);
//		System.out.printf("\nArray Sum:  " + sum + "%n");
//
//		arraysAssignment.printGrid(rows, columns);
//
//		int avg = ArraysAssignment.average(arr);
//		System.out.printf("%nArray Average:  " + avg + "%n");
//
//		boolean result = ArraysAssignment.contains(arr, key);
//		System.out.printf("%n" + result + "%n%n");
//
//		int status = ArraysAssignment.indexOf(key);
//		System.out.println("Index of element " + key + " in the array: " + status + "\n");
//
//		int[] resultantString = ArraysAssignment.removeElement(arr, element);
//		System.out.println("Modified Array: " + Arrays.toString(resultantString));
//
//		int[] newArray = ArraysAssignment.copyArray(arr);
//		System.out.printf("%nSource Array : %s %n", Arrays.toString(arr));
//		System.out.printf("Copied Array : %s %n", Arrays.toString(newArray));
//
//		System.out.println("\nSource Array : " + Arrays.toString(arr13));
//		int[] insertedArray = ArraysAssignment.insert(arr13);
//		System.out.println("New Array: " + Arrays.toString(insertedArray));
//
//		int[] minMax = ArraysAssignment.minAndMax(arr);
//		System.out.println("\nMinimum and Maximum Values in Source Array: " + Arrays.toString(minMax) + "\n");
//
//		System.out.printf("Source Array : %s %n", Arrays.toString(arr));
//		int[] reverseArray = ArraysAssignment.reverseArray(arr);
//		System.out.printf("Reverse Array : %s %n", Arrays.toString(reverseArray));
//
//		ArraysAssignment.duplicateElements(arr);
//		System.out.println();
//
//		ArraysAssignment.stringDuplicates(stringArray);
//
//		System.out.println("\n" + "FirstArray : " + Arrays.toString(firstArray));
//		System.out.println("SecondArray : " + Arrays.toString(secondArray));
//		HashSet<String> commonElement = ArraysAssignment.stringArrayCommonElements(firstArray, secondArray);
//		System.out.println("Common element in both of the String Arrays : " + (commonElement));
//
//		ArraysAssignment.integerArrayCommonElements();
//
//		int[] resultantArray = ArraysAssignment.removeDuplicateElements(arr1);
//		System.out.println("\n Source Array: " + Arrays.toString(arr1));
//		System.out.println("Array afer removing Duplicates: " + Arrays.toString(resultantArray));
//
//		ArraysAssignment.secondLargestElement(arr1);
//
//		ArraysAssignment.secondSmallestElement(arr1);
//
//		ArraysAssignment.addTwoMatrices();
//
//		ArraysAssignment.toArrayList();
//
//		ArraysAssignment.arrayListToArray();
//
//		ArraysAssignment.pairSum(arr2, 15);
//
//		ArraysAssignment.arrayEqualityTest();
//
//		int missingNumber = ArraysAssignment.getMissingNo(arr3);
//		System.out.println("\nSource Array: " + Arrays.toString(arr3));
//		System.out.println("Missing Number in Array: " + missingNumber);
//
//		ArraysAssignment.commonElementsInThreeSortedArrays();
//
//		ArraysAssignment.pushZerosToEnd();
//
//		ArraysAssignment.oddEven();
//
//		ArraysAssignment.findDifference(arr1);
//
//		ArraysAssignment.findAverage(arr3);
//
//		String checkResult = ArraysAssignment.check(arr3);
//		System.out.println(checkResult);
//
//		boolean check = ArraysAssignment.sumThirty(arr5);
//		System.out.println("\n" + check);
//
//		boolean checkSpecificNumber = ArraysAssignment.checkSpecificNumber(arr1);
//		System.out.println("\n" + checkSpecificNumber);
//
//		int newLength = ArraysAssignment.removeDuplicates(arr6);
//		System.out.println("\nArray length before removing duplicates: " + arr6.length);
//		System.out.println("New Array length after removing duplicates: " + newLength);
//
//		ArraysAssignment.sumOfTwoElements(arr7, target);
//
//		ArraysAssignment.sumClosestToZero(arr4);
//
//		ArraysAssignment.firstAndSecondSmallest(arr1);
////
////		ArraysAssignment.segregateArray();
////
////		ArraysAssignment.arrangeArray();
////
////		ArraysAssignment.positiveElementsBefore();
////
////		ArraysAssignment.arrangeOddEven();
//
//		// String Method resolutions
//		System.out.println("\n\nString Assignment Method Resolutions");
//		System.out.println("-------------------------------------------");
//
//		StringAssignment.charactersCount();
//
//		StringAssignment.vowelsAndConsonantsCount();
//
//		StringAssignment.splitString();
//
//		StringAssignment.removeWhiteSpaces();
//
//		StringAssignment.caseConversion();
//
//		StringAssignment.replaceCharacter();
//
//		StringAssignment.maxAndMinCharacters();
//
//		StringAssignment.reverseString();
//
//		StringAssignment.duplicateCharacters();
//
//		StringAssignment.duplicateWords();
//
//		StringAssignment.frequencyOfCharacters();
//
//		StringAssignment.individualCharacter();
//
////		StringAssignment.chatToString();
//
//		StringAssignment.stringToChar();
//
//		StringAssignment.sortString();
//
//		// Exception Method resolutions
//		System.out.println("\n\nException Assignment Method Resolutions");
//		System.out.println("---------------------------------------------");
//
//		ExceptionAssignment.divide();

		// ExceptionAssignment.stackTrace();
	}
}
