package sdet_javaProg;

import java.util.Scanner;

public class BinarySearch {
	
	// Preconditions:
	// Array must already be sorted or add the additional program to sort the array
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to be searched: ");
		int n = sc.nextInt();
		boolean flag = false;
		int l = 0;
		int h = arr.length-1;
		
		while (l<=h)
		{
			int mid = (l+h)/2;
			if (arr[mid]==n)
			{
				System.out.println("Element is found at index position "+mid);
				flag = true;
				break;
			}
			
			if (arr[mid]<n)
			{
				l=mid+1;
			}
			if (arr[mid]>n)
			{
				h=mid-1;
			}
		}
		if (flag==false) {
			System.out.println("Element is not found");
		}
	}
}





