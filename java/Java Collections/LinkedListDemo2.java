package collectiondemos;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedList l = new LinkedList();
		
		//Sorting is possible only if the linkedlist has same kind of data or homogeneous data/ objects
		l.add("X");
		l.add("Y");
		l.add("Z");
		l.add("A");
		l.add("B");
		l.add("C");	
		
		LinkedList new_l = new LinkedList();
		new_l.addAll(l);  // Copy elements from linkedlist l to new_l
		System.out.println(new_l);
		
		new_l.removeAll(l);   // This will remove all the elements from new_l that are copied from l
		System.out.println("new_l after removal of all elements that are copied from linkedlist l: "+new_l);
		
		// sort()  using Collections.sort(collection)
		System.out.println("Before sorting: "+l);
		
		Collections.sort(l);
		System.out.println("After sorting: " +l);		
		
		// Reverse Order
		Collections.sort(l,Collections.reverseOrder());
		System.out.println("Reverse Order: "+l);
		
		//Shuffling
		Collections.shuffle(l);
		System.out.println("After Shuffling: "+l);
	}
}



/*
 https://www.youtube.com/watch?v=1Eyartworbk&list=PLUDwpEzHYYLu9-xrx5ykNH8wmN1C1qClk&index=5
 Time stamp: 49:00 - 1:00:00
*/

