package sdet_javaProg;

/*
// Approach 1: Using Logic
 
public class ReverseEachWordinaString {

	public static void main(String[] args) {
		
		String s = "Welcome to Java";
		String[] words = s.split(" ");
		
		String reverseString = "";
		
		for(String w:words) 
		{
			String reverseword = "";
			for(int i=w.length()-1; i>=0; i--)
			{
				reverseword = reverseword + w.charAt(i);
			}
			reverseString = reverseString + reverseword + " "; 
		}
		System.out.println(reverseString);
	}
}
*/

//Approach 2: using built-in method
public class ReverseEachWordinaString {

	public static void main(String[] args) {
		
		String s = "Welcome to Java";
		String[] words = s.split("\\s");
		
		String reverseword = "";
		for(String w: words)
		{
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reverseword = reverseword + sb.toString() + " ";			
		}
		System.out.println(reverseword);
	}
}
