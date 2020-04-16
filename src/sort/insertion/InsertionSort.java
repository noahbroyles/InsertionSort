/***********************************************************
 * Insertion Sort                                          *
 * Bill Nicholson                                          *
 * nicholdw@ucmail.uc.edu                                  *
 * p-code https://en.wikipedia.org/wiki/Insertion_sort     *
 * Life is good
 * PopTarts
 * *********************************************************/

package sort.insertion;

public class InsertionSort {

	public static void Sort(int[] data) {
		for (int i = 1; i < data.length; i++) {
			int j;
			j = i;
			while (j > 0  && data[j-1] > data[j]) {
				int tmp = data[j];
				data[j] = data[j-1];
				data[j-1] = tmp;
				j--;
			}
		}
	}

}
