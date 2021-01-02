// Java Program to find longest substring without repetition

package sdet_javaProg;

import java.util.HashSet;

public class LongestSubString {

	public static void main(String[] args) {
		String str = "abcde";
		System.out.println(Longest(str));
	}

	private static String Longest(String str) {
		
		HashSet<Character> set=new HashSet();
		String longestTillnow = "";
		String longestOverall = "";
		
		for(int i=0; i<str.length(); i++) {
			char c =str.charAt(i);    // This extracts each character from the string
			if(set.contains(c))
			{
				longestTillnow="";
				set.clear();
			}
			set.add(c);
			longestTillnow+=c;
			
			if(longestTillnow.length()>longestOverall.length())
			{
				longestOverall=longestTillnow;
			}			
		}
		return longestOverall;
	}
}



/* 
Logic:
1. Create a blank set to hold the string and work on it
2. 


*/


// https://www.youtube.com/watch?v=sqxer2ynS6U&list=PLF9tovyahfL020hGgLIsRMZY4bfSLCFUa&index=1&t=6s