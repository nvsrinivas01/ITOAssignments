package com.itorizon;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.itorizon.arrays.ArraysAssignment;
import com.itorizon.collections.ArrayListAssignment;
import com.itorizon.collections.HashMapAssignment;
import com.itorizon.collections.HashSetAssignment;
import com.itorizon.collections.LinkedListAssignment;
import com.itorizon.collections.TreeMapAssignment;
import com.itorizon.collections.TreeSetAssignment;
import com.itorizon.string.StringAssignment;

@SpringBootTest
class ItoSpringBootAssignmentApplicationTests {
	/*
	 * 
	 * method to test sort method of ArrayAssignment Class
	 * 
	 */
	@Test
	void sortTest() {
		int[] arr = { 55, 22, 27, 22, 85, 25, 66, 59 };
		assertArrayEquals(arr, ArraysAssignment.sort(arr));
	}

	/*
	 * 
	 * method to test sum method of ArrayAssignment Class
	 * 
	 */
	@Test
	void sumTest() {
		int[] arr = { 55, 22, 27, 22, 85, 25, 66, 59 };
		assertEquals(361, ArraysAssignment.sum(arr));
	}

	/*
	 * 
	 * method to test average method of ArrayAssignment Class
	 * 
	 */
	@Test
	void averageTest() {
		int[] arr = { 55, 22, 27, 22, 85, 25, 66, 59 };
		assertEquals(45, ArraysAssignment.average(arr));

	}

	/*
	 * 
	 * method to test the contains method of ArrayAssignment Class
	 * 
	 */
	@Test
	void containsTest() {
		int element = 66;
		int[] arr1 = { 55, 22, 27, 22, 85, 25, 59 };
		int[] arr2 = { 55, 22, 27, 22, 85, 66, 25, 59 };
		assertEquals(false, ArraysAssignment.contains(arr1, element));
		assertEquals(true, ArraysAssignment.contains(arr2, element));
	}

	/*
	 * 
	 * method to test the indexOf method of ArrayAssignment Class
	 * 
	 */
	@Test
	void indexOfTest() {
		int key = 55;
		int key1 = 99;
		assertEquals(0, ArraysAssignment.indexOf(key));
		assertEquals(-1, ArraysAssignment.indexOf(key1));

	}

	/*
	 * 
	 * method to test the removeElement method of ArrayAssignment Class
	 * 
	 */
	@Test
	void removeElementTest() {
		int[] arr = { 55, 22, 27, 22, 85, 25, 66, 59 };
		int element = 66;
		int[] expected = { 55, 22, 27, 22, 85, 25, 59 };
		int[] actual = ArraysAssignment.removeElement(arr, element);
		assertArrayEquals(expected, actual);
	}

	/*
	 * 
	 * method to test the copyArray method of ArrayAssignment Class
	 * 
	 */
	@Test
	void copyArrayTest() {
		int[] arr = { 55, 22, 27, 22, 85, 25, 66, 59 };
		int[] expected = { 55, 22, 27, 22, 85, 25, 66, 59 };
		int[] actual = ArraysAssignment.copyArray(arr);
		assertArrayEquals(expected, actual);
	}

	/*
	 * 
	 * method to test insert method of ArrayAssignment Class
	 * 
	 */
	@Test
	void insertTest() {
		int[] arr = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		int[] expected = { 25, 14, 5, 56, 15, 36, 56, 77, 18, 29 };
		int[] actual = ArraysAssignment.insert(arr);
		assertArrayEquals(expected, actual);
	}

	/*
	 * 
	 * method to test the minAndMax method of ArrayAssignment Class
	 * 
	 */
	@Test
	void minAndMaxTest() {
		int[] arr = { 55, 22, 27, 22, 85, 25, 66, 59 };
		int[] expected = { 22, 85 };
		int[] actual = ArraysAssignment.minAndMax(arr);
		assertArrayEquals(expected, actual);
	}

	/*
	 * 
	 * method to test reverseArray method of ArrayAssignment Class
	 * 
	 */
	@Test
	void reverseArrayTest() {
		int[] arr = { 55, 22, 27, 22, 85, 25, 66, 59 };
		int[] expected = { 59, 66, 25, 85, 22, 27, 22, 55 };
		int[] actual = ArraysAssignment.reverseArray(arr);
		assertArrayEquals(expected, actual);

	}

	/*
	 * 
	 * method to test method tests the stringArrayCommonElements method of
	 * ArrayAssignment Class
	 * 
	 */
	@Test
	void stringArrayCommonElementsTest() {
		String[] firstArray = { "Srinivas", "Shivling", "Neha", "Swamy", "Lakshmesh" };
		String[] secondArray = { "Swamy", "Srinivas", "Soumya", "Sunil", "Shree", "Karan", "Amith" };
		HashSet<String> actual = ArraysAssignment.stringArrayCommonElements(firstArray, secondArray);
		HashSet<String> expected = new HashSet<String>();
		expected.add("Swamy");
		expected.add("Srinivas");
		assertArrayEquals(expected.toArray(), actual.toArray());
	}

	/*
	 * method to tests the difference between the largest and smallest values in an
	 * array of integers. The length of the array must be 1 and above.
	 */
	@Test
	public void testFindDifference() {
		int[] arr = { 1, 1, 5, 2, 3, 2, 65, 4, 9, 77, 8 };
		assertEquals(76, ArraysAssignment.findDifference(arr));
	}

	/*
	 * method to tests compute the average value of an array of integers except the
	 * largest and smallest values.
	 */
	@Test
	public void testFindAverage() {
		int[] arr3 = { 1, 3, 4, 5, 6 };
		assertEquals(4, ArraysAssignment.findAverage(arr3));
	}

	/*
	 * method to tests if an array of integers without 0 and -1.
	 */
	@Test
	public void testCheck() {
		int[] arr3 = { 1, 3, 4, 5, 6 };
		assertSame("Array without 0 and -1", ArraysAssignment.check(arr3));
	}

	/*
	 * method to tests if the sum of all the 10's in the array is exactly 30 Return
	 * false if the condition does not satisfy, otherwise true.
	 */
	@Test
	public void testSumThirty() {
		int[] arr5 = { 10, 7, 10, 10, 11, 5, -1 };
		assertTrue(ArraysAssignment.sumThirty(arr5));
	}

	/*
	 * method to tests if an array of integers contains two specified elements 65
	 * and 77.
	 */
	@Test
	public void testCheckSpecificNumber() {
		int[] arr1 = { 1, 1, 5, 2, 3, 2, 65, 4, 9, 77, 8 };
		assertTrue(ArraysAssignment.checkSpecificNumber(arr1));
	}

	/*
	 * method to tests remove the duplicate elements of a given array and return the
	 * new length of the array. // Sample array: [20, 20, 30, 40, 50, 50, 50] After
	 * removing the duplicate elements the program should return 4 as the new length
	 * of the array.
	 */
	@Test
	public void testRemoveDuplicates() {
		int[] arr6 = { 20, 20, 30, 40, 50, 50, 50 };
		assertEquals(4, ArraysAssignment.removeDuplicates(arr6));
	}

	/*
	 * method to tests the sum of the two elements of a given array which is equal
	 * to a given integer. Sample array: [1,2,4,5,6] Target value: 6.
	 */
	@Test
	public void testSumOfTwoElements() {
		int[] arr7 = { 1, 2, 4, 5, 6 };
		int target = 6;
		assertEquals(2, ArraysAssignment.sumOfTwoElements(arr7, target));
	}

	/*
	 * method to tests smallest and second smallest elements of a given array.
	 */
	@Test
	public void testFirstAndSecondSmallest() {
		int[] arr1 = { 1, 1, 5, 2, 3, 2, 65, 4, 9, 77, 8 };
		int[] exp_array = { 1, 2 };
		assertEquals(Arrays.toString(exp_array), Arrays.toString(ArraysAssignment.firstAndSecondSmallest(arr1)));
	}

	/*
	 * method to tests segregate all 0s on left side and all 1s on right side of a
	 * given array of 0s and 1s.
	 */
	@Test
	public void testSegregateArray() {
		int[] arr8 = { 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1 };
		int[] expected_array = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1 };
		assertArrayEquals(expected_array, ArraysAssignment.segregateArray(arr8));
	}

	/*
	 * method to tests elements of a given array of integers where all negative
	 * integers appear before all the positive integers.
	 */
	@Test
	public void testArrangeArray() {
		int[] arr9 = { 1, -2, 3, -5, -8, -3, 2, 5, 4, -1 };
		int[] exp_array = { -8, -5, -3, -2, -1, 1, 2, 3, 4, 5 };
		assertArrayEquals(exp_array, ArraysAssignment.arrangeArray(arr9));
	}

	/*
	 * method to tests the elements of a given array of integers where all positive
	 * integers appear before all the negative integers.
	 */
	@Test
	public void testPositiveElementsBefore() {
		int[] arr10 = { -4, 8, 6, -5, 6, -2, 1, 2, 3, -11 };
		int[] exp_array = { 8, 6, 6, 1, 2, 3, -4, -5, -2, -11 };
		assertArrayEquals(exp_array, ArraysAssignment.positiveElementsBefore(arr10));
	}

	/*
	 * method to tests even and odd numbers of a given array of integers. Put all
	 * even numbers first, and then odd numbers.
	 */
	@Test
	public void testArrangeOddEven() {
		int[] arr11 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] exp_array = { 2, 4, 6, 8, 1, 3, 5, 7, 9 };
		assertArrayEquals(exp_array, ArraysAssignment.arrangeOddEven(arr11));
	}

	/*
	 * method to tests common elements between two arrays of integers.
	 */
	public void integerArrayCommonElementsTest() {
		Object[] exp_arr = { 1, 7 };
		assertArrayEquals(exp_arr, ArraysAssignment.integerArrayCommonElements());
	}

	/*
	 * method to tests remove duplicate elements from an array.
	 */
	@Test
	void removeDuplicateElementsTest() {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 8, 9, 65, 77 };
		assertArrayEquals(arr, ArraysAssignment.removeDuplicateElements(arr));
	}

	/*
	 * method to tests second largest element in an array.
	 */
	@Test
	void secondLargestElementTest() {
		int[] arr1 = { 1, 1, 5, 2, 3, 2, 65, 4, 9, 77, 8 };
		assertEquals(65, ArraysAssignment.secondLargestElement(arr1));
	}

	/*
	 * method to tests second smallest element in an array.
	 */
	@Test
	void secondSmallestElementTest() {
		int[] arr1 = { 1, 1, 5, 2, 3, 2, 65, 4, 9, 77, 8 };
		assertEquals(2, ArraysAssignment.secondSmallestElement(arr1));
	}

	/*
	 * method to tests which convert an array to ArrayList.
	 */
	@Test
	void toArrayListTest() {
		String[] exp_array = { "JAVA", "Python", "PHP", "Perl", "C#", "C++" };
		assertArrayEquals(exp_array, ArraysAssignment.toArrayList().toArray());
	}

	/*
	 * method to tests which convert an ArrayList to an array.
	 */
	@Test
	void arrayListToArrayTest() {
		String[] exp_arr = { "Apple", "Orange", "Banana" };
		assertArrayEquals(exp_arr, ArraysAssignment.arrayListToArray());
	}

	/*
	 * method to tests pairs of elements in an array whose sum is equal to a
	 * specified number.
	 */
	@Test
	public void pairSumTest() {
		int[] arr2 = { 2, 7, 4, -5, 11, 5, 20 };
		assertEquals(2, ArraysAssignment.pairSum(arr2, 15));

	}

	/*
	 * method to tests t the equality of two arrays.
	 */
	@Test
	public void arrayEqualityTest() {
		assertTrue(ArraysAssignment.arrayEqualityTest());
	}

	/*
	 * method to tests missing number in an array.
	 */
	@Test
	void getMissingNotTest() {
		int[] arr3 = { 1, 2, 4, 5, 6 };
		assertEquals(3, ArraysAssignment.getMissingNo(arr3));
	}

	/*
	 * method to tests common elements from three sorted (in non-decreasing order)
	 * arrays.
	 */
	@Test
	void commonElementsInThreeSortedArraysTest() {
		Object[] exp_arr = { 4, 8 };
		assertArrayEquals(exp_arr, ArraysAssignment.commonElementsInThreeSortedArrays());
	}

	/*
	 * method to tests move all 0's to the end of an array. Maintain the relative
	 * order of the other (non-zero) array elements.
	 */
	@Test
	void pushZerosToEndTest() {
		int[] arr = { 1, 9, 8, 4, 2, 7, 6, 9, 0, 0, 0, 0 };
		assertArrayEquals(arr, ArraysAssignment.pushZerosToEnd());
	}

	// *********************************************************************************************************************
	// StringAssignment methods Test cases

	/*
	 * 
	 * method to tests charactersCount method of StringAssignment Class
	 * 
	 */
	@Test
	void charactersCountTest() {
		int expected = 19;
		int actual = StringAssignment.charactersCount();
		assertEquals(expected, actual);

	}

	/*
	 * 
	 * method to tests vowelsAndConsonantsCount method of StringAssignment Class
	 * 
	 */
	@Test
	void vowelsAndConsonantsCountTest() {
		int[] expected = { 5, 14 };
		int[] actual = StringAssignment.vowelsAndConsonantsCount();
		assertArrayEquals(expected, actual);

	}

	/*
	 * 
	 * method to tests splitString method of StringAssignment Class
	 * 
	 */
	@Test
	void splitStringTest() {
		boolean expected = false;
		boolean actual = StringAssignment.splitString();
		assertEquals(expected, actual);

	}

	/*
	 * 
	 * method to tests the removeWhiteSpaces method of StringAssignment Class
	 * 
	 */
	@Test
	void removeWhiteSpacesTest() {
		String expected = "Removewhitespaces";
		String actual = StringAssignment.removeWhiteSpaces();
		assertEquals(expected, actual);

	}

	/*
	 * 
	 * method to tests caseConversion method of StringAssignment Class
	 * 
	 */
	@Test
	void caseConversionTest() {
		String expected = "aBHIMANYU";
		String actual = StringAssignment.caseConversion();
		assertEquals(expected, actual);

	}

	/*
	 * 
	 * method to tests the replaceCharacter method of StringAssignment Class
	 * 
	 */
	@Test
	void replaceCharacterTest() {
		String expected = "Once-in-a-blue-moon";
		String actual = StringAssignment.replaceCharacter();
		assertEquals(expected, actual);

	}

	/*
	 * 
	 * method to tests the maxAndMinCharacters method of StringAssignment Class
	 * 
	 */
	@Test
	void maxAndMinCharactersTest() {
		char[] expected = { 'a', 'e' };
		char[] actual = StringAssignment.maxAndMinCharacters();
		assertArrayEquals(expected, actual);

	}

	/*
	 * method to tests which separate the Individual Characters from a String
	 */
	@Test
	public void testIndividualCharacter() {
		String exp_string = "S  r  i  n  i  v  a  s  ";
		assertEquals(exp_string, StringAssignment.individualCharacter());
	}

	/*
	 * method to tests which Convert char to String
	 */
	@Test
	public void testCharToString() {
		String exp_res = "a";
		assertEquals(exp_res, StringAssignment.charToString());
	}

	/*
	 * method to tests which Convert String to char
	 */
	@Test
	public void testStringToChar() {
		String[] result = { "S", "w", "a", "m", "y" };
		assertEquals(Arrays.toString(result), StringAssignment.stringToChar());
	}

	/*
	 * method to tests sort strings in alphabetical order
	 */
	@Test
	public void testSortString() {
		String exp_res = "aiinrssv";
		assertEquals(exp_res, StringAssignment.sortString());
	}

	/*
	 * method to tests find Reverse of the string
	 */
	@Test
	public void testReverseString() {
		String exp_res = "YMAWS";
		assertEquals(exp_res, StringAssignment.reverseString());
	}

	/*
	 * method to tests duplicate characters in a string
	 */
	@Test
	void duplicateCharactersTest() {
		char c = 'A';
		assertEquals(c, StringAssignment.duplicateCharacters());
	}

	// ****************************************************************************************************************

	// CollectionAssignment test methods
	/*
	 * HashMap Test cases
	 * 
	 */
	private HashMap<Integer, String> students;
	private TreeMap<Integer, String> students2;
	private HashMapAssignment hashMapAssignment;
	private TreeMapAssignment treeMapAssignment;

	/*
	 * 
	 * Initializing values to the HashMap before each test
	 * 
	 */
	@BeforeEach
	void setUp() {
		students = new HashMap<Integer, String>();
		students.put(1, "Swamy");
		students.put(2, "Srinivas");
		students.put(3, "Shivling");
		students.put(4, "Sudhakar");
		students.put(5, "Neha");

	}

	/*
	 * 
	 * getValueTest method tests the getValue method of HashMapAssignment Class
	 * 
	 */
	@Test
	void getValueTest() {
		assertEquals("Srinivas", HashMapAssignment.getValue(students, 2));
	}

	/*
	 * 
	 * getSizeTest method tests the getSize method of HashMapAssignment Class
	 * 
	 */
	@Test
	void getSizeTest() {
		assertEquals(5, HashMapAssignment.getSize(students));
	}

	/*
	 * 
	 * createCopyTest method tests the createCopy method of HashMapAssignment Class
	 * 
	 */
	@Test
	void createCopyTest() {
		assertEquals(5, HashMapAssignment.getSize(students));
	}

	/*
	 * 
	 * removeAllTest method tests the removeAll method of HashMapAssignment Class
	 * 
	 */
	@Test
	void removeAllTest() {
		assertTrue(HashMapAssignment.removeAll(students).isEmpty());
	}

	/*
	 * 
	 * checkKeyMappingTest method tests the checkKeyMapping method of
	 * HashMapAssignment Class
	 * 
	 */
	@Test
	void checkKeyMappingTest() {
		assertTrue(HashMapAssignment.checkKeyMapping(students, 2));
		assertFalse(HashMapAssignment.checkKeyMapping(students, 7));
	}

	/*
	 * 
	 * checkValueMappingTest method tests the checkValueMapping method of
	 * HashMapAssignment Class
	 * 
	 */
	@Test
	void checkValueMappingTest() {
		assertTrue(HashMapAssignment.checkValueMapping(students, "Srinivas"));
		assertFalse(HashMapAssignment.checkValueMapping(students, "Sunil"));
	}

	/*
	 * 
	 * getValueForKeyTest method tests the getValueForKey method of
	 * HashMapAssignment Class
	 * 
	 */
	@Test
	void getValueForKeyTest() {
		assertEquals("Sudhakar", HashMapAssignment.getValueForKey(students, 4));
	}

	/*
	 * 
	 * getSetViewTest method tests the getSetView method of HashMapAssignment Class
	 * 
	 */
	@Test
	void getSetViewTest() {
		Set<Integer> keySet = new HashSet<Integer>();
		keySet.add(1);
		keySet.add(2);
		keySet.add(3);
		keySet.add(4);
		keySet.add(5);
		assertTrue(keySet.equals(HashMapAssignment.getSetView(students)));
	}

	/*
	 * 
	 * getCollectionViewTest method tests the getCollectionView method of
	 * HashMapAssignment Class
	 * 
	 */
	@Test
	void getCollectionViewTest() {
		Collection<String> values = new ArrayList<String>();
		values.add("Swamy");
		values.add("Srinivas");
		values.add("Shivling");
		values.add("Sudhakar");
		values.add("Neha");
		assertArrayEquals(values.toArray(), HashMapAssignment.getCollectionView(students).toArray());
	}

	/*
	 * TreeMap Test cases
	 * 
	 */
	@BeforeEach
	void treeMapSetUp() {
		students2 = new TreeMap<Integer, String>();
		students2.put(6, "Swamy");
		students2.put(7, "Srinivas");
		students2.put(8, "Shivling");
		students2.put(9, "Sudhakar");
		students2.put(10, "Neha");
	}

	/*
	 * 
	 * method to tests the createTreeMap method of TreeMapAssignment Class
	 * 
	 */
	@Test
	void createTreeMapTest() {
		assertFalse(TreeMapAssignment.createTreeMap().isEmpty());
	}

	/*
	 * 
	 * getAllKeysTest method tests the getAllKeys method of TreeMapAssignment Class
	 * 
	 */
	@Test
	void getAllKeysTest() {
		Set<Integer> keySet = TreeMapAssignment.getAllKeys(students2);
		assertEquals(5, keySet.size());
	}

	/*
	 * 
	 * deleteAllElementsTest method tests the deleteAllElements method of
	 * TreeMapAssignment Class
	 * 
	 */
	@Test
	void deleteAllElementsTest() {
		assertTrue(TreeMapAssignment.deleteAllElements(students2).isEmpty());
	}

	/*
	 * 
	 * getFirstKeyTest method tests the getFirstKey method of TreeMapAssignment
	 * Class
	 * 
	 */
	@Test
	void getFirstKeyTest() {
		assertEquals(6, TreeMapAssignment.getFirstKey(students2));
	}

	/*
	 * 
	 * getLastKeyTest method tests the getLastKey method of TreeMapAssignment Class
	 * 
	 */
	@Test
	void getLastKeyTest() {
		assertEquals(10, TreeMapAssignment.getLastKey(students2));
	}

	/*
	 * 
	 * method to tests the reverseOrderKeyView method of TreeMapAssignment Class
	 * 
	 */
	@Test
	void reverseOrderKeyViewTest() {
		Set<Integer> sortedKeys = new HashSet<Integer>();
		sortedKeys.add(10);
		sortedKeys.add(9);
		sortedKeys.add(8);
		sortedKeys.add(7);
		sortedKeys.add(6);
		assertTrue(sortedKeys.equals(TreeMapAssignment.reverseOrderKeyView(students2)));
	}

	/*
	 * 
	 * sortKeysTest method tests the sortKeys method of TreeMapAssignment Class
	 * 
	 */
	@Test
	void sortKeysTest() {
		Set<Integer> sortedKeys = new HashSet<Integer>();
		sortedKeys.add(6);
		sortedKeys.add(7);
		sortedKeys.add(8);
		sortedKeys.add(9);
		sortedKeys.add(10);
		assertTrue(sortedKeys.equals(TreeMapAssignment.sortKeys(students2)));
	}

	private ArrayList<String> studentNames;

	private HashSet<String> studentNames2;

	@BeforeEach
	void arrayListSetUp() {
		studentNames = new ArrayList<String>();
		studentNames.add("Krishna");
		studentNames.add("Arjuna");
		studentNames.add("Bheema");
		studentNames.add("Rama");
		studentNames.add("Karna");
		studentNames2 = new HashSet<String>();
		studentNames2.add("Krishna");
		studentNames2.add("Karna");
		studentNames2.add("Arjuna");
		studentNames2.add("Bheema");
		studentNames2.add("Nakula");
	}

	/*
	 * Testing to insert an element into the array list at the first position.
	 */
	@Test
	public void tesInsertElementAtFirst() {
		String name = "Abhimanyu";
		ArrayList<String> arrayList = ArrayListAssignment.insertElementAtFirst(studentNames, name);
		assertSame(name, arrayList.get(0));
	}

	/*
	 * Testing to retrieve an element (at a specified index) from a given array
	 * list.
	 */
	@Test
	public void testRetriveElement() {
		String name = ArrayListAssignment.retriveElement(studentNames, 2);
		assertEquals(name, "Bheema");
	}

	/*
	 * Testing to update specific array element by given element.
	 */
	@Test
	public void testUpdateElement() {
		String name = "Nakula";
		ArrayList<String> arrayList = ArrayListAssignment.updateElement(studentNames, 2, name);
		assertSame(name, arrayList.get(2));
		assertNotSame(name, arrayList.get(3));
	}

	/*
	 * Testing to remove the third element from a array list.
	 */
	@Test
	public void testRemoveElementFromThirdPosition() {
		ArrayList<String> arrayList = ArrayListAssignment.removeElementFromThirdPosition(studentNames);
		assertNotSame("Rama", arrayList.get(3));
	}

	/*
	 * Testing to search an element in a array list.
	 */
	@Test
	public void testSearchElement() {
		String name = "Karna";
		boolean result = ArrayListAssignment.searchElement(studentNames, name);
		assertTrue(result);
	}

	/*
	 * Testing to sort a given array list.
	 */
	@Test
	public void testSortArrayList() {
		ArrayList<String> arrayList = ArrayListAssignment.sortArrayList(studentNames);
		Collections.sort(studentNames);
		assertArrayEquals(studentNames.toArray(), arrayList.toArray());
	}

	/*
	 * Testing an array list is empty or not.
	 */
	@Test
	public void testEmptyCheck() {
		assertFalse(ArrayListAssignment.emptyCheck(studentNames));
	}

	/*
	 * Testing to clone an array list to another array list
	 */
	@Test
	public void testCloneArrayList() {
		assertArrayEquals(studentNames.toArray(), ArrayListAssignment.cloneArrayList(studentNames).toArray());
	}

	/*
	 * Testing to join two array lists
	 */
	@Test
	public void testJoinArrayLists() {
		ArrayList<String> studentSurnames = new ArrayList();
		studentSurnames.add("Maharathi");
		ArrayList<String> arrayList = ArrayListAssignment.joinArrayLists(studentNames, studentSurnames);
		assertEquals("Maharathi", arrayList.get(5));
	}

	/*
	 * Test to reverse elements in a array list.
	 */
	@Test
	public void testReverseArrayList() {
		Collections.reverse(studentNames);
		ArrayList<String> arrayList = ArrayListAssignment.reverseArrayList(studentNames);
		assertArrayEquals(studentNames.toArray(), arrayList.toArray());
	}

	/*
	 * Test to copy one array list into another
	 */
	@Test
	public void testCopyArrayList() {
		ArrayList<String> arrayList = ArrayListAssignment.copyArrayList(studentNames);
		assertArrayEquals(studentNames.toArray(), arrayList.toArray());
	}

	/**
	 * Testing HashSet programs
	 */

	/*
	 * Test to append the specified element to the end of a hash set.
	 */
	@Test
	public void testAddElement() {
		String name = "Rama";
		HashSet<String> hashSet = HashSetAssignment.addElement(studentNames2, name);
		assertTrue(hashSet.contains("Rama"));
	}

	/*
	 * Test to get the number of elements in a hash set.
	 */
	@Test
	public void testGetSize() {
		assertEquals(5, HashSetAssignment.getSize(studentNames2));
	}

	/*
	 * Test to empty an hash set.
	 */
	@Test
	public void testClearSet() {
		HashSet<String> hashSet = HashSetAssignment.clearSet(studentNames2);
		assertTrue(hashSet.isEmpty());
	}

	/*
	 * Test to convert a hash set to an array
	 */
	@Test
	public void testSetToArray() {
		Object[] arr = HashSetAssignment.SetToArray(studentNames2);
		assertArrayEquals(studentNames2.toArray(), arr);
	}

	/*
	 * Test to compare two hash set.
	 */
	@Test
	public void testCompareHashSet() {
		HashSet<String> hashSet = new HashSet<String>();
		assertFalse(HashSetAssignment.compareHashSet(studentNames2, hashSet));
	}

	/*
	 * Test to compare two sets and retain elements which are same on both sets.
	 */
	@Test
	public void testGetEqualElements() {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Sahadeva");
		hs.add("Dharmaraya");
		HashSet<String> hashSet2 = HashSetAssignment.getEqualElements(studentNames2, hs);
		assertNotEquals(2, hashSet2.size());
		assertFalse(hashSet2.contains("Sahadeva"));
	}

	/**
	 * Testing LinkedList programs
	 */
	private LinkedList<String> studentNames3;

	@BeforeEach
	void linkedListSetUp() {
		studentNames3 = new LinkedList<String>();
		studentNames3.add("Tom");
		studentNames3.add("Kim");
		studentNames3.add("Jim");
		studentNames3.add("Sim");
		studentNames3.add("Bom");
	}

	/*
	 * to append the specified element to the end of a linked list.
	 */

	@Test
	void appendAtLastTest() {
		LinkedList<String> linkedList = LinkedListAssignment.appendAtLast(studentNames3, "Vim");
		assertEquals("Vim", linkedList.getLast());
	}

	/*
	 * to insert the specified element at the front of a linked list.
	 */
	@Test
	void insertAtFrontTest() {
		assertEquals("Vim", LinkedListAssignment.insertAtFront(studentNames3, "Vim").getFirst());
	}

	/*
	 * to insert the specified element at the end of a linked list.
	 */
	@Test
	void insertAtEndTest() {

		assertEquals("Vim", LinkedListAssignment.insertAtEnd(studentNames3, "Vim").getLast());
	}

	/*
	 * to remove first and last element from a linked list.
	 */
	@Test
	void removeFirstElementTest() {

		assertEquals("Tom", LinkedListAssignment.removeFirstElement(studentNames3));
	}

	@Test
	void removeLastElementTest() {

		assertEquals("Bom", LinkedListAssignment.removeLastElement(studentNames3));
	}

	@Test
	void joinLinkedListTest() {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Vim");
		assertTrue(LinkedListAssignment.joinLinkedList(studentNames3, linkedList).contains("Vim"));
	}

	/*
	 * to clone an linked list to another linked list.
	 */
	@Test
	void cloneLinkedListTest() {
		assertArrayEquals(studentNames3.toArray(), LinkedListAssignment.cloneLinkedList(studentNames3).toArray());
	}

	/**
	 * Testing TreeSet programs
	 */
	private TreeSet<Integer> numbers;

	@BeforeEach
	void treeSetSetUp() {
		numbers = new TreeSet<Integer>();
		numbers.add(11);
		numbers.add(22);
		numbers.add(33);
		numbers.add(44);
	}

	/*
	 * add all the elements of a specified tree set to another tree set.
	 */
	@Test
	void addToAnotherTest() {
		assertArrayEquals(numbers.toArray(), TreeSetAssignment.addToAnother(numbers).toArray());
	}

	/*
	 * to get the first elements in a tree set.
	 */
	@Test
	void getFirstElementTest() {
		assertEquals(11, TreeSetAssignment.getFirstElement(numbers));
	}

	/*
	 * to get the last elements in a tree set.
	 */
	@Test
	void getLastElementTest() {
		assertEquals(44, TreeSetAssignment.getLastElement(numbers));
	}

	/*
	 * get the number of elements in a tree set.
	 */
	@Test
	void treeSetGetSizeTest() {
		assertEquals(4, TreeSetAssignment.getSize(numbers));
	}

	/*
	 * to find the numbers less than 7 in a tree set.
	 */
	@Test
	void getNumberLessThanSpecifiedTest() {
		assertTrue(TreeSetAssignment.getNumberLessThanSpecified(numbers).isEmpty());
	}

	/*
	 * to get the element in a tree set which is greater than or equal to the given
	 * element.
	 */
	@Test
	void getClosestGreaterTest() {
		int expected = TreeSetAssignment.getClosestGreater(numbers, 30);
		assertEquals(33, expected);
	}

	/*
	 * retrieve and remove the first element of a tree set.
	 */
	@Test
	void retriveFirstTest() {
		assertEquals(11, TreeSetAssignment.retriveFirst(numbers));
	}

	@Test
	void retriveLastTest() {
		assertEquals(44, TreeSetAssignment.retriveLast(numbers));
	}

	/*
	 * to remove a given element from a tree set.
	 */
	@Test
	void treeSetRemoveElementTest() {
		assertEquals(true, TreeSetAssignment.removeElement(numbers, 44));
		assertEquals(false, TreeSetAssignment.removeElement(numbers, 78));
	}

}
