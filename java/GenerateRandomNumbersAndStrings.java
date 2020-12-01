package sdet_javaProg;

import java.util.Random;
import java.util.Scanner;

public class GenerateRandomNumbersAndStrings {

	public static void main(String[] args) {
		//Approach 1: Using Random class
		/*
		//A. Generate random integers
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range to generate random integers");
		int a = sc.nextInt();		
		Random rand = new Random();
		int rand_int = rand.nextInt(a);
		System.out.println("Random numbers from 0 to "+(a-1) +" is "+rand_int);		
		*/
		
		/*
		//B. Generate random decimal nums
		Random rand = new Random();
		double rand_double = rand.nextDouble();
		System.out.println("Random decimal numbers from 0.0 to less than 1 is: " +rand_double);		
		*/
		
		/*
		//Approach 2: Using Math class. This method generates only decimal numbers
		System.out.println(Math.random());
		*/
		
		/*
		//Approach 3: Using Apache Commons Lang API
		String randNum = RandomStringUtils.randomNumeric(10);
		System.out.println(randNum);
		*/		
	}
}
