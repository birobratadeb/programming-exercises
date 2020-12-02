package sdet_javaProg;

import java.util.Scanner;

public class Factorial {

/*	
	// Approach 1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for which to generate the factorial: ");
		int n = sc.nextInt();
		long fact=1;
		for(int i=1; i<=n; i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
*/
	// Approach 2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for which to generate the factorial: ");
		int n = sc.nextInt();
		long fact=1;
		for(int i=n; i>=1; i--) {
			fact=i*fact;
		}
		System.out.println(fact);
	}
}
