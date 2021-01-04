package sdet_javaProg;

import java.util.Scanner;

public class Palindrome {
    public static void main (String[] args) {
        String original, reverse = "";
        Scanner in = new Scanner(System.in);
        int length;
        System.out.println("Enter the number or String: ");
        original = in.nextLine();
        length = original.length();
        for (int i =length-1; i>=0; i--) {
            reverse = reverse + original.charAt(i);
        }
        System.out.println("Reverse is: " +reverse);
         
        if(original.equals(reverse)) 
            System.out.println("This is a Palindrome");
        else
            System.out.println("The is not a Palindrome");
         
    }
}

/*
https://www.softwaretestinghelp.com/java-coding-interview-programs/
Q #8) Write a Java Program to find whether a string or number is palindrome or not.
*/
