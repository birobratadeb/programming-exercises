package sdet_javaProg;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int a[]= {0,14,2,31,4,15,6,17,8,39,10};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be searched: ");
		int n = sc.nextInt();
		boolean flag = false;
		
		for(int i = 0; i<a.length; i++)
		{
			if(a[i]==n)
				{
					System.out.println("Element " +n+ " found in the array at position "+i);
					flag = true;
				}
		}	
		if(flag==false)
		{
			System.out.println("Element " +n+ " not found in the array");
		}
	}
}
