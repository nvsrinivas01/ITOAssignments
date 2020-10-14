package com.itorizon.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import org.springframework.stereotype.Component;

/**
 * 
 * @author Srinivas N V
 * @version 1.0.0
 * 
 */
@Component
public class ArraysAssignment {

	/*
	 *
	 * This class contains necessary utility methods to perform various operations
	 * on Arrays, and it also contains different Array operations
	 * 
	 */

	// 1. Write a Java program to sort a numeric array and a string array.
	/**
	 * 
	 * sort method sorts the array elements
	 * 
	 * @param arr is source array
	 */
	public static void sort(int[] arr) {
		System.out.printf("User Array : %s %n", Arrays.toString(arr));
		/**
		 * 
		 * Sorting Array using sort method, This method Sorts the Array with Default
		 * Natural Sorting Order (Ascending).
		 * 
		 * @param arr the Array to be sorted
		 * 
		 */
		Arrays.sort(arr);
		System.out.printf("Sorted Array : %s %n", Arrays.toString(arr));
	}

	// 2. Write a Java program to sum values of an array.
	public static void sum(int[] arr) {
		if (arr.length <= 0) {
			System.out.println("Array should contain atleast 2 elements to Sort ");
		}
		// Initializing local variable sum to 0 (zero)
		int sum = 0;
		for (int i : arr) {
			sum += i; // adding all Array elements
		}
		System.out.printf("\nArray Sum:  " + sum + "%n");
	}

	// 3. Write a Java program to print the following grid.
	// Expected Output :
	// - - - - - - - - -
	// - - - - - - - - -
	// - - - - - - - - -
	// - - - - - - - - -
	// - - - - - - - - -
	// - - - - - - - - -
	public void printGrid(int rows, int columns) {
		int[][] gridArray = new int[rows][columns];
		for (int i = 0; i < gridArray.length; i++) {
			for (int j = 0; j < gridArray.length; j++) {
				System.out.printf("- ", gridArray[i][j]);
			}
			System.out.println();
		}
	}

	// 4. Write a Java program to calculate the average value of array elements.
	/**
	 * 
	 * average method returns the average of array elements
	 * 
	 * @param arr is the array for which average is to be calculated
	 * 
	 */
	public static void average(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr.length == 0) {
				System.out.println("Average of Empty Array cannot be found");
				break;
			} else if (arr.length == 1) {
				System.out.println("Array Average: " + arr[i]);
				break;
			} else {
				sum += arr[i];
			}
		}
		if (arr.length > 1) {
			// Calculating Array average
			int avg = sum / arr.length;
			System.out.printf("%nArray Average:  " + avg + "%n");
		}

	}

	// 5. Write a Java program to test if an array contains a specific value.
	/**
	 * 
	 * contains method returns true if the target element is present in the array,
	 * else it returns false
	 * 
	 * @param arr     is array in which target element is searched
	 * @param element is the target element
	 * 
	 */
	public static boolean contains(int[] arr, int element) {
		for (int i : arr) {
			if (arr.length < 0) {
				System.out.println("Empty Array ");
				break;
			} else if (i == element) {
				return true;
			}
		}
		return false;
	}

	// 6. Write a Java program to find the index of an array element.
	/**
	 * 
	 * indexOf method returns the index of the target element if its present in the
	 * array, else it returns -1
	 * 
	 * @param arr     is array in which target element index is searched
	 * @param element is the target element
	 * 
	 */
	public static int indexOf(int[] arr, int element) {
		for (int i = 0; i < arr.length; i++) {
			if (arr.length == 0) {
				System.out.println("Empty Array ");
				break;
			} else if (arr[i] == element) {
				return i;
			}
		}
		return -1;
	}

	// 7. Write a Java program to remove a specific element from an array.
	/**
	 * 
	 * removeElement method removes specific element from the array
	 * 
	 * @param arr     is array in which element should be removed
	 * @param element is the specific element which should be removed from the array
	 * 
	 */
	public static String removeElement(int[] arr, int element) {
		if (arr.length == 0) {
			return "Element cannot be removed from an Empty array";
		}
		int[] modifiedArray = new int[arr.length - 1];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != element) {
				modifiedArray[j] = arr[i];
				j += 1;
			}
		}
		System.out.printf("Source Array : %s %n", Arrays.toString(arr));
		return Arrays.toString(modifiedArray);
	}

	// 8. Write a Java program to copy an array by iterating the array.
	/**
	 * 
	 * copyArray method copies the elements of the array to a new array
	 * 
	 * @param arr is the array which should be copied to new array
	 */
	public static void copyArray(int[] arr) {
		System.out.printf("%nSource Array : %s %n", Arrays.toString(arr));
		int[] newArray = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr.length == 0) {
				System.out.printf("Copied Array : %s %n%n", Arrays.toString(newArray));
				break;
			}
			newArray[i] = arr[i];
		}
		System.out.printf("Copied Array : %s %n", Arrays.toString(newArray));
	}

	// 9. Write a Java program to insert an element (specific position) into an
	// array.
	/**
	 * 
	 * insert method inserts an element (specific position) into an array.
	 * 
	 * 
	 */
	public static void insert() {
		int[] arr = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		// Inserting an element in 3rd position of the array (index->2, value->5)
		int IndexPosition = 2;
		int newValue = 5;
		System.out.println("\nSource Array : " + Arrays.toString(arr));
		for (int i = arr.length - 1; i > IndexPosition; i--) {
			arr[i] = arr[i - 1];
		}
		arr[IndexPosition] = newValue;
		System.out.println("New Array: " + Arrays.toString(arr));
	}

	// 10. Write a Java program to find the maximum and minimum value of an array.

	/**
	 * 
	 * minAndMax method is used to find maximum and minimum values in an array
	 * 
	 * @param arr is the array in which the min and max values are found
	 * 
	 */
	public static String minAndMax(int[] arr) {
		if (arr.length == 0) {
			return "\nEmpty array cannot find MIN and MAX value";
		} else {
			// initializing min and max variable
			int min = arr[0];
			int max = arr[0];
			int[] minMax = new int[2];
			for (int i = 0; i < arr.length; i++) {
				if (min > arr[i]) {
					min = arr[i];
				} else if (max < arr[i]) {
					max = arr[i];
				}
			}
			minMax[0] = min;
			minMax[1] = max;
			return "\nMinimum and Maximum Values in Source Array: " + Arrays.toString(minMax) + "\n";
		}
	}

	// 11. Write a Java program to reverse an array of integer values.
	/**
	 * 
	 * reverseArray method helps reverse the method
	 * 
	 * @param arr is the array to be reversed
	 * 
	 */
	public static void reverseArray(int[] arr) {
		int[] reverseArray = new int[arr.length];
		int j = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr.length == 0) {
				System.out.println("Empty array cannot be reversed");
				break;
			}
			reverseArray[j] = arr[i];
			j += 1;
		}
		System.out.printf("Source Array : %s %n", Arrays.toString(arr));
		System.out.printf("Reverse Array : %s %n", Arrays.toString(reverseArray));
	}

	// 12. Write a Java program to find the duplicate values of an array of integer
	// values.
	/**
	 * 
	 * dublicateElements methods identifies duplicates present in source array
	 * 
	 * @param arr is source array
	 * 
	 */
	public static void duplicateElements(int[] arr) {
		System.out.printf("%nSource Array : %s %n", Arrays.toString(arr));
		System.out.print("Duplicate Elements: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr.length == 0) {
					System.out.println("Empty array, no duplicates found");
				} else if (arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
				}
			}
		}
		System.out.println();
	}

	// 13. Write a Java program to find the duplicate values of an array of string
	// values.
	/**
	 * 
	 * stringDuplicates method helps in identifying duplicates in String Array
	 * 
	 * @param stringArray in which duplicates are identified
	 */
	public static void stringDuplicates(String[] stringArray) {
		if (stringArray.length == 0) {
			System.out.println("Empty Array, no Duplicate Element found");
		} else {
			System.out.println("Source Array: " + Arrays.toString(stringArray));
			for (int i = 0; i < stringArray.length - 1; i++) {
				for (int j = i + 1; j < stringArray.length; j++) {
					if ((stringArray[i].equals(stringArray[j])) && (i != j)) {
						System.out.println("Duplicate String : " + stringArray[j]);
					}
				}
			}
		}
	}

	// 14. Write a Java program to find the common elements between two arrays
	// (string values).
	/**
	 * 
	 * stringArrayCommonElements method identifies the common elements in two String
	 * Arrays
	 * 
	 */
	public static void stringArrayCommonElements() {

		String[] firstArray = { "Srinivas", "Shivling", "Neha", "Swamy", "Lakshmesh" };
		String[] secondArray = { "Swamy", "Srinivas", "Soumya", "Sunil", "Shree", "Karan", "Amith" };

		System.out.println("\n" + "FirstArray : " + Arrays.toString(firstArray));
		System.out.println("SecondArray : " + Arrays.toString(secondArray));

		HashSet<String> commonElement = new HashSet<String>();
		for (int i = 0; i < firstArray.length; i++) {
			for (int j = 0; j < secondArray.length; j++) {
				if (firstArray[i].equals(secondArray[j])) {
					commonElement.add(firstArray[i]);
				}
			}
		}
		System.out.println("Common element in both of the String Arrays : " + (commonElement));
	}

	// 15. Write a Java program to find the common elements between two arrays of
	// integers.
	/**
	 * 
	 * integerArrayCommonElements method identifies the common elements in two
	 * Integer Arrays
	 * 
	 */
	public static void integerArrayCommonElements() {

		int[] firstArray = { 1, 2, 5, 5, 8, 9, 7, 10 };
		int[] secondArray = { 1, 0, 6, 15, 6, 4, 7, 0 };

		System.out.println("\n" + "FirstArray : " + Arrays.toString(firstArray));
		System.out.println("SecondArray : " + Arrays.toString(secondArray));

		HashSet<Integer> commonElement = new HashSet<Integer>();

		for (int i = 0; i < firstArray.length; i++) {
			for (int j = 0; j < secondArray.length; j++) {
				if (firstArray[i] == (secondArray[j])) {
					commonElement.add(firstArray[i]);
				}
			}
		}
		System.out.println("Common element in both of the Integer Arrays : " + (commonElement));
	}

	// 16. Write a Java program to remove duplicate elements from an array.
	/**
	 * removeDuplicateElements removes duplicate elements from the source array
	 * 
	 * @param arr is the array from which duplicates are to be removed
	 * 
	 * @return array after removing duplicates
	 */
	public static int[] removeDuplicateElements(int[] arr) {
		int n = arr.length;
		if (n == 0 || n == 1) {
			return arr;
		}
		Arrays.sort(arr);
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];
		// Changing original array
		int[] arr1 = new int[j];
		for (int i = 0; i < j; i++) {
			arr1[i] = temp[i];
		}
		return arr1;
	}

	// 17. Write a Java program to find the second largest element in an array.
	/**
	 * secondLargestElement method identifies second largest element in the source
	 * array
	 * 
	 * @param arr is the array from which second largest element is identified
	 * 
	 */
	public static void secondLargestElement(int[] arr) {
		System.out.println("\nSource Array: " + Arrays.toString(arr));
		int[] res = ArraysAssignment.removeDuplicateElements(arr);
		System.out.println(" Second largest element in an array: " + res[res.length - 2]);
	}

	// 18. Write a Java program to find the second smallest element in an array.

	/**
	 * secondSmallestElement method identifies second smallest element in the source
	 * array
	 * 
	 * @param arr is the array from which second smallest element is identified
	 * 
	 */
	public static void secondSmallestElement(int[] arr) {
		System.out.println("\nSource Array: " + Arrays.toString(arr));
		int[] res = ArraysAssignment.removeDuplicateElements(arr);
		System.out.println(" Second smallest element in an array: " + res[1]);
	}

	// 19. Write a Java program to add two matrices of the same size.
	/**
	 * 
	 * addTwoMatrices is used to add two different matrices
	 * 
	 */
	public static void addTwoMatrices() {
		int rows = 2, columns = 3;
		int[][] firstMatrix = { { 9, 8, 4 }, { 5, 9, 4 } };
		int[][] secondMatrix = { { -4, 2, 3 }, { 3, 6, 3 } };

		// Adding Two matrices
		int[][] sum = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
			}
		}

		// Displaying the result
		System.out.println("\nSum of two matrices is: ");
		for (int[] row : sum) {
			for (int column : row) {
				System.out.print(column + "    ");
			}
			System.out.println();
		}
	}

	// 20. Write a Java program to convert an array to ArrayList.
	/**
	 * toArrayList method converts Array object to equivalent ArrayList object
	 * 
	 */
	public static void toArrayList() {

		String[] arr = new String[] { "JAVA", "Python", "PHP", "Perl", "C#", "C++" };
		System.out.println("\nArray: " + Arrays.toString(arr));
		// using Arrays.asList
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
		System.out.println("Arrays's equivalent ArrayList: " + list);
	}

	// 21. Write a Java program to convert an ArrayList to an array.
	/**
	 * arrayListToArray method converts ArrayList object to equivalent Array object
	 * 
	 */
	public static void arrayListToArray() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Orange");
		list.add("Banana");
		System.out.println("\nArrayList: " + list);
		String[] arr = new String[list.size()];
		list.toArray(arr);
		System.out.println("ArrayList's equivalent Array: " + Arrays.toString(arr));
	}

	// 22. Write a Java program to find all pairs of elements in an array whose sum
	// is equal to a specified number.
	/**
	 * pairSum finds all pairs of elements in an array whose sum is equal to a
	 * specified number.
	 * 
	 * @param arr             is the source array
	 * @param specifiedNumber is the the sum of pairs
	 */
	public static void pairSum(int[] arr, int specifiedNumber) {
		System.out.println("\nSource Array: " + Arrays.toString(arr));
		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] + arr[j]) == specifiedNumber) {

					System.out.println("Pair " + (k) + ": " + arr[i] + ", " + arr[j]);
					k++;
				}
			}
		}
	}

	// 23. Write a Java program to test the equality of two arrays.
	/**
	 * 
	 * arrayEqualityTest method checks for equality for two arrays
	 * 
	 */
	public static void arrayEqualityTest() {
		int arr1[] = { 1, 2, 3 };
		int arr2[] = { 1, 2, 3 };
		if (Arrays.equals(arr1, arr2)) {
			System.out.println("\nArrays are Same");
		} else {
			System.out.println("\nArrays are Not same");
		}
	}

	// 24. Write a Java program to find a missing number in an array.
	/**
	 * 
	 * getMissingNo method returns missing number in the array
	 * 
	 * @param arr3 is array in which missing number is identified
	 * 
	 * @return missing number
	 */
	public static int getMissingNo(int arr3[]) {
		int total;
		total = (arr3.length + 1) * (arr3.length + 2) / 2;
		for (int i = 0; i < arr3.length; i++) {
			total -= arr3[i];
		}
		return total;
	}

	// 25. Write a Java program to find common elements from three sorted (in
	// non-decreasing order) arrays.
	/**
	 * 
	 * This method returns common elements from three sorted
	 * 
	 */
	public static void commonElementsInThreeSortedArrays() {
		ArrayList<Integer> commonElements = new ArrayList<Integer>();
		int arrayOne[] = { 2, 4, 8 };
		int arrayTwo[] = { 2, 3, 4, 8, 10, 16 };
		int arrayThree[] = { 4, 8, 14, 40 };
		int x = 0, y = 0, z = 0;
		while (x < arrayOne.length && y < arrayTwo.length && z < arrayThree.length) {
			if (arrayOne[x] == arrayTwo[y] && arrayTwo[y] == arrayThree[z]) {
				commonElements.add(arrayOne[x]);
				x++;
				y++;
				z++;
			} else if (arrayOne[x] < arrayTwo[y]) {
				x++;
			} else if (arrayTwo[y] < arrayThree[z]) {
				y++;
			} else {
				z++;
			}
		}
		System.out.print("\nCommon elements from three sorted (in non-decreasing order ) arrays: " + commonElements);
	}

	// 26. Write a Java program to move all 0's to the end of an array. Maintain the
	// relative order of the other (non-zero) array elements.
	/**
	 * 
	 * This method move all 0's to the end of an array.
	 * 
	 */
	public static void pushZerosToEnd() {
		int[] arr = { 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9 };
		System.out.println("\n\nSource Array: " + Arrays.toString(arr));
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}
		while (count < arr.length) {
			arr[count++] = 0;
		}

		System.out.println("Array after pushing zeros to the back: " + Arrays.toString(arr));

	}

	// 27. Write a Java program to find the number of even and odd integers in a
	// given array of integers.
	/**
	 * 
	 * oddEven method finds the number of even and odd integers in a given array of
	 * integers
	 * 
	 */
	public static void oddEven() {
		int arr[] = { 1, 2, 5, 6, 3, 2 };
		int even = 0;
		int odd = 0;
		for (int element : arr) {

			// Used Ternary operator
			int result = (element % 2 == 0) ? even++ : odd++;
		}
		System.out.println("\nSource Array: " + Arrays.toString(arr));
		System.out.println("Even Numbers in Array: " + even);
		System.out.println("Odd Numbers in Array: " + odd);
	}

	// 28. Write a Java program to get the difference between the largest and
	// smallest values in an array of integers. The length of the array must be 1
	// and above.
	/**
	 * 
	 * findDifference method finds difference between the largest and smallest
	 * values in an array of integers. The length of the array must be 1 and above.
	 * 
	 * @param arr is the array in which difference is identified
	 * 
	 */
	public static void findDifference(int[] arr) {
		System.out.println("\nSource Array: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Difference between the largest and smallest values: " + (arr[arr.length - 1] - arr[0]));
	}

	// 29. Write a Java program to compute the average value of an array of integers
	// except the largest and smallest values.
	/**
	 * 
	 * findAverage method computes the average value of an array of integers except
	 * the largest and smallest values.
	 * 
	 * @param arr is the array in which average is identified
	 */
	public static void findAverage(int[] arr) {
		System.out.println("\nSource Array: " + Arrays.toString(arr));
		Arrays.sort(arr);
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((i != 0) && (i != arr.length - 1)) {
				sum += arr[i];
			}
		}
		int average = (sum) / (arr.length - 2);
		System.out.println("Average between the largest and smallest values: " + average);
	}

	// 30. Write a Java program to check if an array of integers without 0 and -1.
	/**
	 * check method checks if an array of integers without 0 and -1
	 * 
	 * @param arr is source array in which the given condition is checked
	 * @return result string
	 */
	public static String check(int[] arr) {
		int zeroCount = 0;
		int minusOneCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				zeroCount++;
			} else if (arr[i] == -1) {
				minusOneCount++;
			}
		}
		if ((zeroCount > 0) && (minusOneCount > 0)) {
			return "\nArray with 0 and -1";
		} else {
			return "\nArray without 0 and -1";
		}
	}

	// 31. Write a Java program to check if the sum of all the 10's in the array is
	// exactly 30 Return false if the condition does not satisfy, otherwise true.
	/**
	 * 
	 * sumThirty returns boolean, if the sum of all the 10's in the array is exactly
	 * 30 it returns true if condition satisfies or it returns false
	 * 
	 * @param arr is source array in which condition is checked
	 * @return boolean after checking the condition
	 * 
	 */
	public static boolean sumThirty(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 10) {
				count++;
			}
		}
		// returning ternary operator boolean value
		return (count == 3) ? true : false;
	}

	// 32. Write a Java program to check if an array of integers contains two
	// specified elements 65 and 77.
	/**
	 * 
	 * sumThirty returns boolean, if the sum of all the 10's in the array is exactly
	 * 30 it returns true if condition satisfies or it returns false
	 * 
	 * @param arr is source array in which condition is checked
	 * @return boolean after checking the condition
	 * 
	 */
	public static boolean checkSpecificNumber(int[] arr) {
		int sixtyFive = 0;
		int seventySeven = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 65) {
				sixtyFive++;
			} else if (arr[i] == 77) {
				seventySeven++;
			}
		}
		// returning ternary operator boolean value
		return ((sixtyFive > 0) && (seventySeven > 0)) ? true : false;
	}

	// 33. Write a Java program to remove the duplicate elements of a given array
	// and return the new length of the array. // Sample array: [20, 20, 30, 40, 50,
	// 50, 50] After removing the duplicate elements the program should return 4 as
	// the new length of the array.

	/**
	 * removeDuplicates removes duplicate elements from the source array
	 * 
	 * @param arr is the array from which duplicates are to be removed
	 * 
	 * @return new length of the array after removing duplicates
	 */
	public static int removeDuplicates(int[] arr) {
		int n = arr.length;
		if (n == 0 || n == 1) {
			return n;
		}
		Arrays.sort(arr);
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];
		// Changing original array
		int[] arr1 = new int[j];
		for (int i = 0; i < j; i++) {
			arr1[i] = temp[i];
		}

		return j;
	}

	// 34. Write a Java program to find the sum of the two elements of a given array
	// which is equal to a given integer.
	// Sample array: [1,2,4,5,6] Target value: 6.
	/**
	 * sumOfTwoElements method finds the sum of the two elements of a given array
	 * which is equal to a given integer.
	 * 
	 * @param arr    is the source array
	 * @param target is the target to which elements should sum up
	 */
	public static void sumOfTwoElements(int[] arr, int target) {
		System.out.println("\nSource Array: " + Arrays.toString(arr) + ", Target Element: " + target);
		for (int i = 0; i < arr.length - 1; i++) {
			if ((arr[i] + arr[i + 1]) == 6) {
				System.out.println("Array Elements " + arr[i] + " and " + arr[i + 1] + " sum to " + target);
			}
		}
	}

	// 35. Write a Java program to find the two elements from a given array of
	// positive and negative numbers such that their sum is closest to zero.
	/**
	 * sumClosestToZero method finds the two elements from a given array of positive
	 * and negative numbers whose sum is closest to zero.
	 * 
	 * @param arr is the source array
	 */
	public static void sumClosestToZero(int[] arr) {
		int minimum1 = 0;
		int minimun2 = 1;
		int sum;
		int minimum;
		minimum = Math.abs(arr[0] + arr[1]);
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				sum = Math.abs(arr[i] + arr[j]);
				if (sum < minimum) {
					minimum1 = i;
					minimun2 = j;
					minimum = sum;
				}
			}
		}
		System.out.println("\nPositive and Negative numbers whose sum is closest to Zero are " + arr[minimum1] + " and "
				+ arr[minimun2]);

	}

	// 36. Write a Java program to find smallest and second smallest elements of a
	// given array.
	/**
	 * firstAndSecondSmallest method finds the smallest and second smallest elements
	 * of a given array.
	 * 
	 * @param arr is the source array
	 */
	public static void firstAndSecondSmallest(int[] arr) {
		System.out.println("\nSource Array: " + Arrays.toString(arr));
		int[] res = ArraysAssignment.removeDuplicateElements(arr);
		System.out.println("Smallest and Second smallest element in an array: " + res[0] + " and " + res[1]);
	}

	// 37. Write a Java program to segregate all 0s on left side and all 1s on right
	// side of a given array of 0s and 1s.
	/**
	 * 
	 * segregateArray is the method that segregates all 0s on left side and all 1s
	 * on right side of a given array of 0s and 1s.
	 * 
	 */
	public static void segregateArray() {
		int[] arr = { 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1 };
		System.out.println("\nSource Array: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Segregated Array: " + Arrays.toString(arr));
	}

	// 38. Write a Java program to arrange the elements of a given array of integers
	// where all negative integers appear before all the positive integers.
	/**
	 * 
	 * arrangeArray is the method arrange all the elements of a given array of
	 * integers where all negative integers appear before all the positive integers.
	 * 
	 */
	public static void arrangeArray() {
		int[] arr = { 1, -2, 3, -5, -8, -3, 2, 5, 4, -1 };
		System.out.println("\nSource Array: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Arranged Array: " + Arrays.toString(arr));
	}

	// 39. Write a Java program to arrange the elements of a given array of integers
	// where all positive integers appear before all the negative integers.
	/**
	 * 
	 * positiveElementsBefore method arranges the elements of a given array of
	 * integers where all positive integers appear before all the negative integers.
	 * 
	 */
	public static void positiveElementsBefore() {
		int arr[] = { -4, 8, 6, -5, 6, -2, 1, 2, 3, -11 };
		System.out.println("\nOriginal array : " + Arrays.toString(arr));
		int j, temp, arr_size;
		arr_size = arr.length;
		for (int i = 0; i < arr_size; i++) {
			j = i;
			// Shifting positive numbers left, negative numbers right
			while ((j > 0) && (arr[j] > 0) && (arr[j - 1] < 0)) {
				temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
				j--;
			}
		}
		System.out.println("New array : " + Arrays.toString(arr));
	}

	// 40. Write a Java program to separate even and odd numbers of a given array of
	// integers. Put all even numbers first, and then odd numbers.
	/**
	 * 
	 * arrangeOddEven separates even and odd numbers of a given array of integers.
	 * Put all even numbers first, and then odd numbers.
	 * 
	 */
	public static void arrangeOddEven() {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("\nSource Array" + Arrays.toString(arr));
		int[] tempArray = new int[arr.length];
		int j = 0;
		for (int i = 0; i < tempArray.length; i++) {
			if ((arr[i] % 2) == 0) {
				tempArray[j] = arr[i];
				j++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] % 2) != 0) {
				tempArray[j] = arr[i];
				j++;
			}
		}
		for (int i = 0; i < tempArray.length; i++) {
			arr[i] = tempArray[i];
		}
		System.out.println("Even and Odd Arranged Array" + Arrays.toString(arr));
	}
}
