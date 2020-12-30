package sdet_javaProg;

import java.util.Arrays;

public class CheckArrayEquals {

/*
//Approach 1: Using inbuilt method	
	public static void main(String[] args) {
		int a[]= {0,14,2,31,4,15,6,17,8,39,10};
		int b[]= {0,14,2,31,4,15,6,17,8,39,10};
		if(Arrays.equals(a, b))
		{
			System.out.println("The arrays are equal");		
		}
		else 
		{
			System.out.println("The arrays are not equal");		
		}
	}
*/
/*
//Approach 1.1: Using inbuilt method	
		public static void main(String[] args) {
			int a[]= {0,14,2,31,4,15,6,17,8,39,10};
			int b[]= {0,14,2,31,4,15,6,17,8,39,10};
			boolean status = Arrays.equals(a, b);
			if(status==true)
			{
				System.out.println("The arrays are equal");		
			}
			else 
			{
				System.out.println("The arrays are not equal");		
			}
		}
*/
//Approach 2: Using inbuilt method	
			public static void main(String[] args) {
				int a[]= {0,14,2,31,4,15,6,17,8,39,10};
				int b[]= {0,14,2,31,4,15,6,17,8,39,10};
				boolean status = true;
				if (a.length==b.length) 
				{
					for(int i=0; i<a.length; i++) 
					{
						if(a[i] != b[i]) 
						{
							status = false;
						}
					}
				}
				else 
				{
					status = false;
				}
				
				if (status==true) 
				{
					System.out.println("The arrays are equal");
				}
				else 
				{
					System.out.println("The arrays are not equal");
				}
	}
}
