package collectiondemos;

import java.util.HashSet;

public class HashSetDemo3 {

	public static void main(String[] args) {
		
		// Finding Union, Intersection and difference of two sets
		
		HashSet <Integer> set1 = new HashSet<Integer>();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		System.out.println("Elements present inside HashSet 1: " +set1);
				
		HashSet <Integer> set2 = new HashSet<Integer>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		
		System.out.println("Elements present inside HashSet 2: " +set2);
		
		//Union will preserve all unique elements after adding two sets and remove the duplicate elements
		
		set1.addAll(set2);  // Here all the elements in set2 will be added to set1		
		System.out.println("HashSet after Union of set1 and set2: " +set1);
		
		//Intersection: Common elements between two sets
		
		//set1.retainAll(set2);  // This declaration means that except the elements in set2, rest will be retained				
		//System.out.println("Intersection elements: " +set1);
		
		//Difference		
		//set1.removeAll(set2);  // This will remove all set2 elements from set1				
		//System.out.println("Difference elements: " +set1);
		
		//subset		
		System.out.println("Is set2 a subset of set1: "+set1.containsAll(set2));  // If elements in set2 are available in set1 			
		
	}
}


/*
https://www.youtube.com/watch?v=IQyjt4dvgIY&list=PLUDwpEzHYYLu9-xrx5ykNH8wmN1C1qClk&index=6
Time stamp: 37:00 - 49:00
*/
