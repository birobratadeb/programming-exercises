package collectiondemos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//HashMap m = new HashMap();    // Decln 1
		HashMap <Integer,String> m = new HashMap<Integer,String>();  // Decln 2: As per this declaration, only integers allowed as Keys and Values as Strings

		m.put(101, "John");
		m.put(102, "David");
		m.put(103, "Scott");
		m.put(104, "Mary");
		m.put(105, "Tye");
		m.put(103, "X");   					// Duplicate key and it is not allowed
		m.put(106, "Tye");  				// Duplicate Value is allowed
		
		System.out.println(m);
		
		System.out.println(m.get(105));
		
		m.remove(106);    // Removes pair from the hashmap
		System.out.println("The new HashMap after removal of Key value pair is: " +m);
		
		System.out.println("Key present in the HashMap? "+m.containsKey(101));
		System.out.println("Key present in the HashMap? "+m.containsKey(106));
		
		System.out.println("Value present in the HashMap? "+m.containsValue("Mary"));
		System.out.println("Value present in the HashMap? "+m.containsValue("Y"));
		
		System.out.println("HashMap is empty: "+m.isEmpty());
		
		// Retrieve only keys from the HashSet as a set collection
		System.out.println("Returning all the keys from the HashSet as a set object: \n"+m.keySet());
		
		System.out.println("Returning all the values from the HashSet as a collection object: \n"+m.values());
		
		System.out.println("Returning all entries as a set object: \n"+m.entrySet());
		
		/*
		// Approach 1: This is with Decln 1 
		for(Object i:m.keySet())
		{
			System.out.println(i);
		}
		*/
		
		/*
		// Approach 2: This is with Decln 2		
		for(int i:m.keySet())
		{
			System.out.println(i);
		}
		*/
				
		for(Object i:m.values())
		{
			System.out.println(i);
		}
		
		for(Object i:m.keySet())
		{
			System.out.println(i+"         "+m.get(i));
		}
		
		//Entry Interface methods
		//*****************************
		System.out.println("Returning all the entries from the HashMap");
		for(Map.Entry entry:m.entrySet())
		{
			System.out.println(entry.getKey()+"        "+entry.getValue());
		}		
		
		System.out.println("Returning all the entries in the form of Set Collection usig iterartor");
		Set s=m.entrySet();
		
		Iterator itr=s.iterator();
		
			while(itr.hasNext())
			{
				Map.Entry entry=(Entry) itr.next();
				System.out.println(entry.getKey()+"       "+entry.getValue());		
			}		
	}
}

/*
https://www.youtube.com/watch?v=4MeC_tO20Sk&list=PLUDwpEzHYYLu9-xrx5ykNH8wmN1C1qClk&index=9
Time stamp: 30:00 - 1:06:00
*/