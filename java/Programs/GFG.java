package sdet_javaProg;

import java.io.*; 

class GFG
{
	
    static int countNonEmptySubstr(String str) 
    { 
        int n = str.length(); 
        return n * (n + 1) / 2; 
    } 
      
 public static void main(String args[])
 {
  String str="abbc";
  System.out.println("All substring of abbc are:");
   for (int i = 0; i < str.length(); i++) {
   for (int j = i+1; j <= str.length(); j++) {
         System.out.println(str.substring(i,j));
  
   }

  }
  System.out.println("number of substrings: " +countNonEmptySubstr(str));

 }
}
