package collectiondemos;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		
		String arr[] = {"Dog", "Cat", "Elephant"};
		for(String value:arr)
		{
			System.out.println(value);		  // This wil l print all elements from the array arr
		}
		
		//Convert the array arr to arraylist
		ArrayList al = new ArrayList(Arrays.asList(arr));  // Arrays is the class here
		System.out.println("Printing all the elemnts in the form of array list: \n" +al);	
	}
}


//https://www.youtube.com/watch?v=5pDkh_vCgdY&list=PLUDwpEzHYYLu9-xrx5ykNH8wmN1C1qClk&index=4
//Starting 53 mins