package sdet_javaProg;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String s = "The quick brown fox jumps over the lazy dog";
		System.out.println("Before removing the white spaces: "+s);
		s= s.replaceAll("\\s", "");
		System.out.println("After removing the white spaces: "+s);
	}
}
