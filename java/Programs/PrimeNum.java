/*
// Approach 1

package sdet_javaProg;


import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
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
*/

//------------------------------------------------------------------------------------------------------------------------------------

// Approach 2
package sdet_javaProg;

import java.util.Scanner;

public class PrimeNum {
 
    public static void main(String[] args) {
        int temp, num;
        boolean isPrime = true;
        System.out.println("Enter the number: ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        in.close();
        for (int i = 2; i<= num/2; i++) {
            temp = num%i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) 
            System.out.println(num + " is a prime number");
            else
                System.out.println(num + " number is not a prime");                     
    } 
}



/*
https://www.softwaretestinghelp.com/java-coding-interview-programs/
Q. #7) Write a Java Program to find whether a number is prime or not.
*/
