package sdet_javaProg;

import java.util.Arrays;
import java.util.Collections;

/*
// Approach 1
public class SortingElements {

	public static void main(String[] args) {

		int a[] = {0,14,2,31,4,15,6,17,8,39,10};
		System.out.println("Array elements before sorting: " +Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("Array elements after sorting: " +Arrays.toString(a));
	}
}
*/
/*
//Approach 2
public class SortingElements {

	public static void main(String[] args) {

		int a[] = {0,14,2,31,4,15,6,17,8,39,10};
		System.out.println("Array elements before sorting: " +Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Array elements after sorting: " +Arrays.toString(a));
	}
}
*/


//Approach 3: Reverse sorted Array or in descending order
public class SortingElements {

	public static void main(String[] args) {

		Integer a[] = {0,14,2,31,4,15,6,17,8,39,10};
		System.out.println("Array elements before sorting: " +Arrays.toString(a));
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println("Array sorted in reversed order: " +Arrays.toString(a));
	}
}
