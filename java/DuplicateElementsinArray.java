package sdet_javaProg;

import java.util.HashSet;

/*
 // Approach 1
public class DuplicateElementsinArray {

	public static void main(String[] args) {
		
		String arr[] = {"java", "python", "perl", "java"};
		boolean flag = false;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[j]==arr[i])
				{
					System.out.println("Duplicate exists for "+arr[j]);	
					flag = true;
				}
			}
		}
		if (flag==false)
		{
			System.out.println("No duplicate exists");	
		}
	}
}
*/

// Approach 2: Using Hashset
public class DuplicateElementsinArray {

	public static void main(String[] args) {
		
		String arr[] = {"java", "C", "C++", "python", "perl", "java"};
		HashSet <String>langs = new HashSet();
		boolean flag = false;
		
		for(String l:arr)
		{
			if(langs.add(l)==false)
			{
				System.out.println("Found Duplicate Element: " +l);
				flag = true;
			}
		}
		if(flag==false)
		{
			System.out.println("No Duplicate Element found");
		}
	}
}
