/*
// Approach 1: Using static variables
package sdet_javaProg;

public class LargestOf3Nums {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b=20,c=30;
		
		if (a>b & a>c) {
			System.out.println("a is largest: "+a);
		}
		else if(b>a & b>c) {
			System.out.println("b is largest: "+b);
		}
		else {
			System.out.println("c is largest: "+c);
		}
	}

}
*/
// ---------------------------------------------------------------------------------------------------------
/*
// Approach 2: Taking user input
 
package sdet_javaProg;

import java.util.Scanner;

public class LargestOf3Nums {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st num: ");
		int a = sc.nextInt();

		System.out.println("Enter 2nd num: ");
		int b = sc.nextInt();
		
		System.out.println("Enter 3rd num: ");
		int c = sc.nextInt();
		
		if (a>b && a>c) {
			System.out.println("a is largest: "+a);
		}
		else if(b>a && b>c) {
			System.out.println("b is largest: "+b);
		}
		else {
			System.out.println("c is largest: "+c);
		}
	}
}
*/
//---------------------------------------------------------------------------------------------------------

//Approach 3: Using ternary operator

package sdet_javaProg;

import java.util.Scanner;

public class LargestOf3Nums {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st num: ");
		int a = sc.nextInt();

		System.out.println("Enter 2nd num: ");
		int b = sc.nextInt();
		
		System.out.println("Enter 3rd num: ");
		int c = sc.nextInt();
		
		int largest = a>b?a:b;     // Largest of a and b
		largest = c>largest?c:largest;   // Largest of c and largest1
		
		System.out.println(largest+ " is largest");
	}
}