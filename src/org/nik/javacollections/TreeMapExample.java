package org.nik.javacollections;

import java.util.*;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap vehicles = new TreeMap();

		// Add some vehicles

		vehicles.put("BMW", 5);
		vehicles.put("Mercedes", 3);
		vehicles.put("Audi", 4);
		vehicles.put("Ford", 10);
		
		System.out.println("Total vehicles : " + vehicles.size());

		// Iterate over all vehicles, using the keyset method
		for(Object key : vehicles.keySet())
		{
			System.out.println(key + " - " + vehicles.get(key));
		}
		System.out.println();
		
		
		System.out.println("Highest key : " + vehicles.lastKey());
		System.out.println("Lowest key : " + vehicles.firstKey());
		
		System.out.println("\n Printing all values");
		for(Object val : vehicles.values())
		{
			System.out.println(val);
		}
		System.out.println();
		
		// Clears all values
		vehicles.clear();
		
		// Equals to zero
		System.out.println("After clear operation , size : " + vehicles.size());
		
	}
}
