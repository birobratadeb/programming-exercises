package collectiondemos;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashtableDemo {

	public static void main(String[] args) {
		
		// Different ways to create Hashtable Object
		
		//Hashtable t = new Hashtable(); //create empty HashTable object. When creating this default constructor, the default capacity is 11. Load factor is 0.75
		//Hashtable t = new Hashtable(initial capacity); // This will create Hashtable object with a specified capacity
		//Hashtable t = new Hashtable(initial capacity, fill ratio/ load factor);
		Hashtable <Integer, String> t = new Hashtable<Integer, String>();
		
		// Adding data to Hashtable. null not allowed as keys or values
		t.put(101,"John");
		t.put(102,"David");
		t.put(103,"Smith");
		//t.put(null,"X");     // NullPointerException
		//t.put(104,null);     // NullPointerException
		
		System.out.println("Hashtable: "+t);
		
		System.out.println("The value associated with the key is: "+t.get(103));
		
		t.remove(103);
		System.out.println("The new Hashtable after removal of the dataset: "+t);
		
		System.out.println("Key present in the Hashtable: "+t.containsKey(102));
		System.out.println("Key present in the Hashtable: "+t.containsKey(105));
		
		System.out.println("Value present in the Hashtable: "+t.containsValue("David"));
		System.out.println("Value present in the Hashtable: "+t.containsValue("Y"));
		
		System.out.println("Hashtable is empty: "+t.isEmpty());
		
		System.out.println("All the keys in the Hashtable: "+t.keySet());
		System.out.println("All the values in the Hashtable: "+t.values());
		
		System.out.println("Printing the Hashtable dataset: ");
		
		//Approach 1
		
		for(int k:t.keySet())
		{
			System.out.println(k+"        "+t.get(k));
		}
		
		//Entry specific methods...
		/*
		//Approach 2
		System.out.println("Printing the entry set from the Hashtable using entry method: ");
		for(Map.Entry entry:t.entrySet())
		{
			System.out.println(entry.getKey()+"     "+entry.getValue());
		}
		*/
		//Approach 3
		System.out.println("Printing the entry set from the Hashtable using iterator method: ");
		Set s=t.entrySet();
		Iterator itr=s.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry entry=(Entry) itr.next();
			System.out.println(entry.getKey()+"     "+entry.getValue());
		}		
	}
}


/*
https://www.youtube.com/watch?v=2kqdHI0tPw4&list=PLUDwpEzHYYLu9-xrx5ykNH8wmN1C1qClk&index=10
Time stamp: 10:00 - end/37:00
*/