package org.nik.javacollections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	
	public static void  main(String[] args) {
		
		Map vehicles = new HashMap();
		
		// Add some vehicles
		vehicles.put("BMW", 5);
		vehicles.put("Mercedes", 3);
		vehicles.put("Audi", 4);
		vehicles.put("Ford", 10);
		
		
		System.out.println("Total Vehicles : " + vehicles.size());
		
		// Iterate over all vehicles , using the keySet method
		for(Object key : vehicles.keySet())
		{
			System.out.println(key.toString() + "-" + vehicles.get(key));
		}
		System.out.println();
		
		String searchKey = "Audi";
		if(vehicles.containsKey(searchKey))
		{
			System.out.println("Found total " + vehicles.get(searchKey) + " " + searchKey + " cars!\n");
		}
		
		// Clear All Values
		vehicles.clear();
		
		//Equals to zero
		System.out.println("After clear operation, size :" + vehicles.size());
		
		
		
	}
	
	
	
	

}
