package sdet_javaProg;

/*
// Approach 1
import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		   int c=0,a,temp;  
		   int n=153;//It is the number to check Armstrong  
		   temp=n;  
		   while(n>0)  
		   {  
		   a=n%10;  
		   n=n/10;  
		    c=c+(a*a*a);  
		    }  
		    if(temp==c)  
		    System.out.println("It is an armstrong number");   
		    else 
		        System.out.println("It is not an armstrong number"); 
	}

}

*/
// https://www.softwaretestinghelp.com/java-coding-interview-programs/
// Q #17) Write a Java Program to check Armstrong number.

//----------------------------------------------------------------------------------------------------------------------

//Approach 2

// https://www.geeksforgeeks.org/program-for-armstrong-numbers/
import java.util.Scanner;


//Java program to determine whether the number is Armstrong number or not 
public class Armstrong 
{ 
	 /* Function to calculate x raised to the power y */
	 int power(int x, long y) 
	 { 
	     if( y == 0) 
	         return 1; 
	     if (y%2 == 0) 
	         return power(x, y/2)*power(x, y/2); 
	     return x*power(x, y/2)*power(x, y/2); 
	 } 

	 /* Function to calculate order of the number */
	 int order(int x) 
	 { 
	     int n = 0; 
	     while (x != 0) 
	     { 
	         n++; 
	         x = x/10; 
	     } 
	     return n; 
	 } 

	 // Function to check whether the given number is Armstrong number or not 
	 boolean isArmstrong (int x) 
	 { 
	     // Calling order function 
	     int n = order(x); 
	     int temp=x, sum=0; 
	     while (temp!=0) 
	     { 
	         int r = temp%10; 
	         sum = sum + power(r,n); 
	         temp = temp/10; 
	     } 
	
	     // If satisfies Armstrong condition 
	     return (sum == x); 
	 } 

	 // Driver Program 
	 public static void main(String[] args) 
	 { 
	     Armstrong ob = new Armstrong(); 
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the number : ");
	     int x = sc.nextInt();
	     System.out.println(ob.isArmstrong(x)); 
	 } 
} 