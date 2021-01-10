/*
 package sdet_javaProg;
 

public class FinalReverseWithoutUsingStringMethods {

	public static void main(String[] args) {
		String str = "Automation";
		StringBuilder str2 = new StringBuilder();
		str2.append(str);
		str2 = str2.reverse();
        System.out.println(str2);		
	}
}

// https://www.softwaretestinghelp.com/java-coding-interview-programs/


*/


//I wrote it with details
package sdet_javaProg;

public class FinalReverseWithoutUsingStringMethods {

public static void main(String[] args) {

	String str = "Automation";    // Here, we are initializing a string variable str and making use of the string builder class.
	StringBuilder str1= new StringBuilder(); // The object of the string builder class str1
	System.out.println("str1 Before append: " +str1);
	str1.append(str);   // will be further used to append the value stored in the string variable str.
	System.out.println("str1 after append: " +str1);
	str1.reverse(); // Thereafter, we are using the inbuilt function of the string builder (reverse()) and storing the new reversed string in str2
	System.out.println("str1 after reverse: " +str1); // Finally, we are printing str2.
}

}


