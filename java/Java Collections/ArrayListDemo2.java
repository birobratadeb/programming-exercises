package collectiondemos;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();  // Created an empty ArrayList variable <al>. Here al is representing collection containing multiple group of elements or objects 
		
		// Added homogeneous data so that sort, shuffle elements is possible. 
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		
		//Add the above elements or collection into another ArrayList. Use al.addAll(c) to add multiple elements or objects at a time 	
		ArrayList al_duplicate = new ArrayList();
		al_duplicate.addAll(al);         // al is the collection
		System.out.println(al_duplicate);		
		
		//Use al.removeAll(c) to remove all elements or objects at a time
		al_duplicate.removeAll(al);
		System.out.println("After Removing: "+al_duplicate);		
		
		//Sort an ArrayList using method available in Collections class
		System.out.println("Elements in the array list: "+al);
		Collections.sort(al);
		System.out.println("Elements in the array list after sorting: "+al);
		
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("Elements in the array list after sorting in reverse order: "+al);
		
		//Shuffling using Colectins.shuffle()
		
		Collections.shuffle(al);
		System.out.println("Elements in the array list after shuffling: "+al);
	}
}

//https://www.youtube.com/watch?v=5pDkh_vCgdY&list=PLUDwpEzHYYLu9-xrx5ykNH8wmN1C1qClk&index=4
// Starting 42 mins
