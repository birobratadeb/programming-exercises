package collectiondemos;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		
		HashSet<Integer> evenNumber = new HashSet<Integer>();  // Here hs is an object of HashSet
		
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		
		System.out.println("HashSet: "+evenNumber);
		
		HashSet<Integer> numbers = new HashSet<Integer> ();
		
		numbers.addAll(evenNumber);
		numbers.add(10);
		
		System.out.println("new HashSet: "+numbers);
		
		numbers.removeAll(evenNumber);
		
		System.out.println("new HashSet after removing group of elements: "+numbers);
	}
}


/*
https://www.youtube.com/watch?v=IQyjt4dvgIY&list=PLUDwpEzHYYLu9-xrx5ykNH8wmN1C1qClk&index=6
Time stamp: 30:00 - 37:00
*/