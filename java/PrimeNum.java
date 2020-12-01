package sdet_javaProg;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num = sc.nextInt();
		int count = 0;
		if(num>1) {
			for(int i=1; i<=num; i++) 
			{
				if (num%i==0)
					count++;
			}
			if (count>2) {
				System.out.println("This is not a Prime number: ");
			}
			else {
				System.out.println("This is a Prime number: ");
			}
		}
		else {
			System.out.println("This is not a Prime number: ");
		}
	}
}
