package collectiondemos;

import java.util.Iterator;
import java.util.LinkedList;

public class QueueDemo2 {

	public static void main(String[] args) {
		
		LinkedList q = new LinkedList();
		
		//Adding elements
		
		q.add("A");
		q.add("B");
		q.add("C");
		q.offer(100); // Allows heterogeneous data elements in LinkedList
		q.offer("C"); // Duplicates allowed
		
		System.out.println(q);   // Output: [A, B, C, 100]   <Insertion order preserved and Duplicates allowed>
		
		// Get or return head or header elements from queue
		//System.out.println(q.element()); // This will return NoSuchElementException if Queue is empty
		//System.out.println(q.peek());  // This will return null if Queue is empty
		
		//Return and remove element from queue
		//System.out.println("Removed the element: "+q.remove());   // This will return NoSuchElementException if Queue is empty
		//System.out.println("Queue after removal of the element: "+q);
		
		System.out.println("Removed the element: "+q.poll()); // This will return null if Queue is empty
		System.out.println("Queue after removal of the element: "+q);
		
		//Read all elements in the Queue
		
		/*
		// Approach 1
		Iterator itr = q.iterator();
		System.out.println("Elements in the queue using iterator method: ");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		// Approach 2
		
		System.out.println("Elements in the queue using for..each loop: ");
		for(Object ele:q)
		{
			System.out.println(ele);
		}		
		*/	
	}
}


/*
https://www.youtube.com/watch?v=l5TB6Jj-yTU&list=PLUDwpEzHYYLu9-xrx5ykNH8wmN1C1qClk&index=8
Time stamp: 34:00 - 37:00
*/



