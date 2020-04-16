/***
 * Author: Noah Broyles
 * Email: broylend@mail.uc.edu
 * Course: Computer Programming 2, Spring 2020
 * Assignment #: 10
 * References: https://www.petrikainulainen.net/programming/testing/junit-5-tutorial-writing-assertions-with-junit-5-api/
 * 
 * Description: Run unit tests againts the Problem024 class provided.
 */

package junitTests;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.*;
import sort.insertion.*;

class UnitTests {

	@Test
	/***
	 * Test that the sort sorts numbers(including negatives) properly
	 */
	@DisplayName("Sorts negatives")
	void test01() {
		
		// Declare the test data
		int[] testData = {1, 2, -1, 100, -5, 300, -99, 212, 400, 1};
		int[] currentData = testData.clone();
		int[] solution = testData.clone();
		
		// Sort the test data with a sort we know works
		Arrays.sort(solution);
		
		// Sort with the new sort being tested
		InsertionSort.Sort(currentData);
		
		// Compare the sorted arrays
		assertArrayEquals(solution, currentData);
	}
	
	
	@Test 
	/***
	 * Test that the sort properly sorts an exactly backwards array
	 */
	@DisplayName("Can sort backwards array")
	void test02() {
		
		int test2Length = 100000;
		int[] testData = new int[test2Length];
		int j = 0;
		// Initialize the test data in descending order so it's 'jumbled'.
		for (int i = testData.length - 1; i >= 0; i--) {
			testData[j] = i;
			j++;
		}
		
		InsertionSort.Sort(testData);
		
		// Test that the first and last numbers in a sorted array of length 100000 are 0 and 99999
		assert(testData[0] == 0 && testData[test2Length - 1] == testData[test2Length-1]);
	}
	
	
	@Test
	/***
	 * Test that the sort does not unsort a presorted array
	 */
	@DisplayName("Works on presorted array")
	void test03() {
		
		int test3Length = 100000;
		int[] testData = new int[test3Length];
		
		// Initialize the test data in ascending order: it will be pre-sorted.
		for (int i = 0; i < testData.length; i++) {
			testData[i] = i;
		}
		
		int[] solution = testData.clone();
		
		InsertionSort.Sort(testData);
		
		assertArrayEquals(solution, testData);
	}
	
	// This is the test of my own
	@Test
	/***
	 * Test if sorting an already sorted array takes less time than sorting a backwards one
	 */
	@DisplayName("Sorting presorted array is time efficient")
	void test04() {
		int[] sorted = new int[1000];
		int[] backwards = new int[1000];
		for (int i = 0; i < sorted.length; i++) {
			sorted[i] = i;
		}
		int j = 0;
		for (int i = backwards.length - 1; i >= 0; i--) {
			backwards[j] = i;
			j++;
		}
		
		long start = System.nanoTime();
		InsertionSort.Sort(sorted);
		long sortedTime = System.nanoTime() - start;
		
		start = System.nanoTime();
		InsertionSort.Sort(backwards);
		long backwardsTime = System.nanoTime() - start;
		
		assert(backwardsTime > sortedTime);x`x
	}

}
