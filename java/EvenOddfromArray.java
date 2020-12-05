package sdet_javaProg;

public class EvenOddfromArray {

/*
//Approach 1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {0,14,2,31,4,15,6,17,8,39,10};
		for(int i=0;i<a.length; i++) 
		{
			if (a[i]%2==0)
				System.out.println("The even number is: "+a[i]);		 	 
			else
				System.out.println("The odd number is: "+a[i]);		
		}
	}
}
*/
	
/*
//Approach 2
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int a[]= {0,14,2,31,4,15,6,17,8,39,10};
			System.out.println("The even numbers in the array are: ");		 	 
			for(int i=0;i<a.length; i++) 
			{
				if (a[i]%2==0)
					System.out.println(a[i]);
			}
			System.out.println("The odd numbers in the array are: ");		 	 
			for(int i=0;i<a.length; i++) 
			{
				if (a[i]%2!=0)
					System.out.println(a[i]);
			}
	}
}
*/


//Approach 3: Using Enhanced for loop
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int a[]= {0,14,2,31,4,15,6,17,8,39,10};
			System.out.println("The Even numbers in the array are: ");		 	 
			for (int val:a) {
				if (val%2==0)
					System.out.println(val);		
			}
			System.out.println("The Odd numbers in the array are: ");		 	 
			for (int val:a) {
				if (val%2!=0)
					System.out.println(val);		
			}
	}
}


