package collectiondemos;

import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		l.add("dog");
		l.add("dog");
		l.add("cat");
		l.add("horse");

		System.out.println("Elements present in the linkedlist after addition: "+l);	
		
		// Specific methods available in the LinkedList and used for implementing stacks and queue
		
		// Add a new element as a first node in the LinkedList
		l.addFirst("Tiger");
		
		// Add a new element as a last node in the LinkedList
		l.addLast("Elephant");
		System.out.println("LinkedList after adding first and last element: "+l);	
		
		System.out.println("Extract the first element from the LinkedList: "+l.getFirst());
				
		System.out.println("Extract the last element from the LinkedList: "+l.getLast());
		
		l.removeFirst();
		l.removeLast();
		
		System.out.println("After removing First and Last element from the LinkedList: "+l);
		
	}
}

/*
https://www.youtube.com/watch?v=1Eyartworbk&list=PLUDwpEzHYYLu9-xrx5ykNH8wmN1C1qClk&index=5
Time stamp: 1:00:00 - 1:07:00
*/

