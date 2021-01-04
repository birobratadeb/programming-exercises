package sdet_javaProg;

public class CountCharacterOccurence {

	public static void main(String[] args) {
		
		String s= "Java programming Java oops";
		int InitialLength = s.length();		
		int LengthAfterRemoval = s.replaceAll("J", "").length();
		int count = InitialLength - LengthAfterRemoval;
		
		System.out.println("Number of occurences of a: "+count);	
	}
}

