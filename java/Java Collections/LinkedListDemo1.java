package collectiondemos;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		
		//How to create a LinkedList Object or Declare Linked List
		LinkedList l = new LinkedList(); // l is the ref variable and will let store hetregeneous data. 
		// LinkedList <Integer> l = new LinkedList<Integer>(); // This will restrict the list to homegeneous data by defining the type. This will let store numbers only. <Integer> and <String> are called the wrapper class
		// LinkedList <String> l = new LinkedList<String>(); // This will let store Strings only
		
		//Add some elements or objects at the end of the LinkedList
		l.add(100);
		l.add("welcome");
		l.add(15.5);
		l.add('A');
		l.add(true);
		l.add(null);
		
		System.out.println(l);
		
		//Find how many nodes or objects or elements are present in the LinkedList or find the size
		System.out.println(l.size());
		
		//Remove objects from the linkedlist by passing index
		l.remove(3);
		System.out.println("After removing, new list: " +l);

		// Inserting/ adding a new element/ object/ value at the middle of the linkedlist
		l.add(3, "Java");
		System.out.println("After inserting element, new list: " +l);				
				
		// Retreving object/ value from the linkedlist
		System.out.println(l.get(3));
		
		// Change or Replace the value in the linkedlist with a new value
		System.out.println(l.set(5, "X"));
		System.out.println("After changing the value: " +l);
		
		// Fetch or check if an element is present in the LinkedList
		System.out.println(l.contains("Java"));	
		System.out.println(l.contains("Python"));	
		
		// Check if the LinkedList has some values or not
		System.out.println(l.contains(l.isEmpty()));
		
		// Retrieve/ extract all the data/ objects from the LinkedList
		
		// Approach 1: Reading elements from the LinkedList using for loop
		System.out.println("Reading all the elements from the LinkedList using for loop: ");
		for(int i=0; i<l.size(); i++)
		{
			System.out.println(l.get(i));  // This will get all the elements from the LinkedList
		}
				
		// Approach 2: Reading elements from the LinkedList using enhanced/ for... each loop
		System.out.println("Reading elements from the LinkedList using enhanced/ for... each loop: ");
		for(Object e:l)   // Here we use Object e when Linkedlist hold heteregeneous data. Other wise specify the data type is the linkedlist is homogeneous
		{
			System.out.println(e);  // This will get all the elements from the LinkedList
		}
			
		// Approach 3: iterator method
		System.out.println("Reading all the elements from the LinkedList using iterator method: ");
		Iterator it = l.iterator();   // Creating iterator object and its ref variable is l
		while(it.hasNext())
		{
			System.out.println(it.next());
		}				
	}
}
