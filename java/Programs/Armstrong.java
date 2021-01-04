package sdet_javaProg;

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

// https://www.softwaretestinghelp.com/java-coding-interview-programs/
// Q #17) Write a Java Program to check Armstrong number.

