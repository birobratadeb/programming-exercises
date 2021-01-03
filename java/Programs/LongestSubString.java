import java.util.HashSet;

public class LongestSubString {

	public static void main(String[] args) {
		String str= "abcdabc";
		System.out.println(Longest(str));
		
	}
	
	private static String Longest(String str) {
		HashSet<Character> set = new HashSet();
		String longestOverall = "";
		String longestTillNow = "";
		
		for(int i=0; i<str.length(); i++)
		{
			char c = str.charAt(i);
			if(set.contains(c))
			{
				longestTillNow = "";
				set.clear();
			}
			set.add(c);			
			longestTillNow+=c;
		
			if(longestTillNow.length()>longestOverall.length())
			{
				longestOverall=longestTillNow;
			}		
		}
	return longestOverall;
	}
}


/*
https://www.youtube.com/watch?v=sqxer2ynS6U&list=PLF9tovyahfL020hGgLIsRMZY4bfSLCFUa&index=1
*/