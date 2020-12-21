package collectiondemos;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		// Ways to create an object of HashSet
		HashSet hs = new HashSet();  // default capacity is 16 and Load Factor = 0.75		
		/*
		HashSet hs = new HashSet(100); // here initial capacity is 100
		HashSet hs = new HashSet(100, (float)0.90); // here initial capacity is 100 and Load Factor = 0.90
		HashSet <Integer>hs = new HashSet<Integer>();  // Store similar objects in the HashSet. Here we use <Integer> wrapper class for integer objects only
		*/
		
		//Add objects or elements to HashSet
		hs.add(100);
		hs.add("welcome");
		hs.add(16.4);
		hs.add('A');
		hs.add(true);
		hs.add(null);
		
		System.out.println(hs);   // This will print in random order. Insertion order will not be preserved
		
		//Remove objects/ elements from HashSet
		hs.remove(16.4);    // removes value
		System.out.println("The HashSet after removing the object/ element is: \n"+hs);
		
		System.out.println(hs.contains("welcome"));
		System.out.println(hs.contains("xyz"));	
		
		System.out.println(hs.contains(hs.isEmpty()));
		
		//Way to read all the objects/ elements from the HashSet
		//Approach 1: Using for..each loop
		
		System.out.println("Reading all the data from the HashSet using for..each loop:");
		for(Object e:hs)    // The object type variable e here is an Object that can hold all types of data
		{
			System.out.println(e);
			
		}
		
		//Approach 2: Using iterator
		
		Iterator it = hs.iterator();
		
		System.out.println("Reading all the data from the HashSet using iterator:");
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}


/*
https://www.youtube.com/watch?v=IQyjt4dvgIY&list=PLUDwpEzHYYLu9-xrx5ykNH8wmN1C1qClk&index=6
Time stamp: 18:00 - 30:00
*/
