package org.nik.javacollections;

import java.util.*;

public class HashTableExample {
	
	public static void main(String[] args){
		
		Map vehicles = new Hashtable();
		
		// Add some vehicles
		vehicles.put("BMW", 5);
		vehicles.put("Mercedes", 3);
		vehicles.put("Audi", 4);
		vehicles.put("Ford", 10);
		
		System.out.println("Total vehicles: " + vehicles.size());
		
		// Iterate over all vehicles, using the keyset method
		for(Object key: vehicles.keySet())
		{
			System.out.println(key + "-" + vehicles.get(key));
		} 
		System.out.println();
		
		String searchKey = "Audi";
		if(vehicles.containsKey(searchKey))
		{
			System.out.println("Found total " + vehicles.get(searchKey) + " " + searchKey + " cars!\n");
		}
		
		// Clear all values
		vehicles.clear();
		
		// Equals to zero
		System.out.println("After clear operation, size : " + vehicles.size());
		
		// The next statements throw null pointer exception, if uncommented
		//vehicles.put("Nissan", null);
		//vehicles.put(null, 6);
	}

}
