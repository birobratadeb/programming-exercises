// object or element name or value will be used interchangeably

// Common methods that can be used along with ArrayList

package collectiondemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {

		// Declare ArrayList. How to create ArrayList objects
		// ArrayList al = new ArrayList() // store heterogeneous data
		// ArrayList <Integer> al = new ArrayList<Integer>(); // store homogeneous data of Integer types. <Integer> is the wrapper class. Here this ArrayList will allow us to store only integers
		// ArrayList <String> al = new ArrayList<String>(); // store homogeneous data of String types. <String> is the wrapper class. Here this ArrayList will allow us to store only strings
		List al = new ArrayList(); // This creates ArrayList object. As ArrayList is derived from List Interface, so it can be implemented by ArrayList. al is the reference variable. In this declaration, it can contains heterogeneous data. Syntax explanation: <List Interface> reference variable al = .....  

		// Add new elements to the ArrayList. This can hold heterogeneous data because of the above way of declaration. add adds element at the end of the array list
		al.add(100);
		al.add("welcome");
		al.add(15.5);
		al.add('A');
		al.add(true);
		
		System.out.println(al);
		
		System.out.println("Number of elements in the array list: " +al.size());
		
		al.remove(1); // remove using the array list index. Insertion order will be preserved even after removal
		// al.remove("welcome"); // remove using the object or element name or value.  Insertion order will be preserved even after removal
		System.out.println("After removing element from array list: "+al);
		
		//Insert a new element using add(index, object). Here we insert an element anywhere with the array list
		al.add(2, "Python");
		System.out.println("After insertion: "+al);
		
		// Retrieve a specific element using element index
		System.out.println(al.get(2)); 
		
		// Change or replace element
		al.set(2, "C#");
		System.out.println("After replacing element: " +al);
		
		// Search
		System.out.println(al.contains("C#"));
		System.out.println(al.contains("C++"));
		
		//isEmpty()
		System.out.println(al.isEmpty());	
		
		//Read or retrieve multiple elements for an array list
		// Approach 1: Using for loop
		System.out.println("Reading elements using for loop.....");	
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i));	
		}
		
		// Approach 2: Using foreach loop
		System.out.println("Reading elements using for..each loop");	
		for(Object e:al)				// here Object e can hold all kinds of heterogeneous objects
		{
			System.out.println(e);	
		}
				
		// Approach 3: Using Iterator() method
		System.out.println("Reading elements/ objects/ data using Iterator method");	
		Iterator it = al.iterator();	// creating variable of iterator interface. Iterator is a parent I of collection I. array list al contains an iterator() method. iterator() method will read each and every element form the arraylist and store in the variable <it>
		while(it.hasNext())   			// this loop will check if we captured all the elements from the array list
		{
			System.out.println(it.next());
		}
	}
}

// https://www.youtube.com/watch?v=5pDkh_vCgdY&list=PLUDwpEzHYYLu9-xrx5ykNH8wmN1C1qClk&index=4
// Starting 17 mins

