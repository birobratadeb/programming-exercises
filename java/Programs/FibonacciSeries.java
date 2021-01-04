/*
// Approach 1

package sdet_javaProg;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=0, n2=1,sum=0;
		System.out.println(n1+ " " +n2);		
		for (int i=0; i<8;i++) {
			sum = n1+n2;
			System.out.println(" " +sum);
			n1=n2;
			n2=sum;
		}		
	}
}
*/

//----------------------------------------------------------------------------------------------------------------

//Approach 2

package sdet_javaProg;

import java.util.Scanner;

public class FibonacciSeries {
  public static void main(String[] args) {
      int num, a = 0,b=0, c =1;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the number of times");
      num = in.nextInt();
      System.out.println("Fibonacci Series of the number is:");
      for (int i=0; i<num; i++) {
          a = b;
          b = c;
          c = a+b;
          System.out.println(a + "");    //if you want to print on the same line, use print()
      }       
  }
} 


//https://www.softwaretestinghelp.com/java-coding-interview-programs/ --- Q #9) Write a Java Program for the Fibonacci series.