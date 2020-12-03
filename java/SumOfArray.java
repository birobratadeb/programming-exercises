package sdet_javaProg;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] intArray = new int[]{14,2,31,4,15,6,17,8,39,10};  
		 int sum = 0;
		 /*
		 // Approach 1
		 for (int i=0; i<intArray.length; i++ ) {
			 sum= sum+intArray[i];
		 }
		 System.out.println("Sum of digits in the array: "+sum);
		 */
		 
		 // Approach 2: Using Enhanced for loop or using foreach
		 for (int val:intArray) {
			 sum = sum+val;
		 }
		 System.out.println("Sum of digits in the array: "+sum);		 	 
	}

}
