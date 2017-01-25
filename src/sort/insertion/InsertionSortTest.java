/***********************************************************
 * Insertion Sort Test main()                              *
 * Bill Nicholson                                          *
 * nicholdw@ucmail.uc.edu                                  *
 * We use this as a GitHub example in IT2045C              *
 * *********************************************************/
package sort.insertion;

public class InsertionSortTest {
	public static void main(String[] args) {
		// Test #1
		int[] testData = {1,2,-1,100,-5,300,-99,212,400,1};
		InsertionSort.Sort(testData);
		System.out.println("Test #1: ");
		for (int i = 0; i < testData.length; i++) {
			System.out.print(testData[i] + " ");
		}
		System.out.println();
		
		// Test #2
		System.out.println("Test #2: ");
		int test2Length = 100000;
		testData = new int[test2Length];
		int j = 0;
		// Initialize the test data in descending order so it's 'jumbled'.
		for (int i = testData.length - 1; i >= 0; i--) {
			testData[j] = i;
			j++;
		}
		// Sort in ascending order
		long startTime = System.currentTimeMillis();
		InsertionSort.Sort(testData);
		long endTime = System.currentTimeMillis();
		System.out.println("first = " + testData[0] + ", last = " + testData[test2Length-1]);
		System.out.println("Total execution time of test #2 in seconds " + ((double)(endTime - startTime))/1000 );

		// Test #3
		System.out.println("Test #3: ");
		int test3Length = 100000;
		testData = new int[test3Length];
		// Initialize the test data in ascending order: it will be pre-sorted.
		for (int i = 0; i < testData.length; i++) {
			testData[i] = i;
		}
		// Sort in ascending order
		startTime = System.currentTimeMillis();
		InsertionSort.Sort(testData);
		endTime = System.currentTimeMillis();
		System.out.println("first = " + testData[0] + ", last = " + testData[test2Length-1]);
		System.out.println("Total execution time of test #3 in seconds " + ((double)(endTime - startTime))/1000 );
		
	}
}
 