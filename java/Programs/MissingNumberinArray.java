package sdet_javaProg;

import java.util.Scanner;

public class MissingNumberinArray {

	public static void main(String[] args) {
		// Conditions:
		// No duplicates, must be sorted, values must be in range
		// Can find only one missing number
		int a[]= {1,2,4,5};
		int sum1 = 0, sum2 = 0;
		for(int i=0; i<a.length; i++)
		{
			sum1 = sum1 + a[i];
		}
		System.out.println("Sum of the elements in the Array: " +sum1 );
		
		for (int i=1; i<=5; i++)
		{
			sum2= sum2+i;
		}
		System.out.println("Sum of the range: " +sum2 );
		System.out.println("Missing number in the array: " +(sum2-sum1));		
	}
}
