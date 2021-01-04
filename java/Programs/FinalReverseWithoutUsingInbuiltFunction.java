package sdet_javaProg;

public class FinalReverseWithoutUsingInbuiltFunction {
    public static void main(String[] args) {
        String str = "Birobrata Deb";
        char chars[] = str.toCharArray();  // converted to character array and printed in reverse order
        for(int i=chars.length-1; i>=0; i--) {
            System.out.print(chars[i]);
        }
    }
}

// https://www.softwaretestinghelp.com/java-coding-interview-programs/