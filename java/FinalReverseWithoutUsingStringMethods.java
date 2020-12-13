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




