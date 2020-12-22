package collectiondemos;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		//LinkedHashSet <Integer>lset = new LinkedHashSet<Integer>(); // for homogeneous objects
		HashSet hset = new HashSet();
		hset.add(100);
		hset.add(200);
		hset.add(300);
		hset.add(400);
		hset.add(500);
		System.out.println("Insertion order is not preserved in HashSet: "+hset);
		
		LinkedHashSet lset = new LinkedHashSet();
		lset.add(100);
		lset.add(200);
		lset.add(300);
		lset.add(400);
		lset.add(500);
		System.out.println("Insertion order is preserved in LinkedHashSet: "+lset);		
	}
}



/*
https://www.youtube.com/watch?v=IQyjt4dvgIY&list=PLUDwpEzHYYLu9-xrx5ykNH8wmN1C1qClk&index=6
Time stamp: 4:35 - 9:00
*/
