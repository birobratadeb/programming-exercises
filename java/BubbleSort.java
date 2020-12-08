package sdet_javaProg;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// int a[]= {4,2,1,5,3};
		int a[]= {0,14,2,31,4,15,6,17,8,39,10};
		
		System.out.println("Array before sorting: " +Arrays.toString(a));
		
		for (int i=0; i<a.length-1; i++ )   // loop for number of passes
		{
			for(int j=0; j<a.length-1; j++)		// Iterations in each pass
			{
				if(a[j]>a[j+1])
				{
					int temp= a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println("Array after sorting: " +Arrays.toString(a));
	}
}