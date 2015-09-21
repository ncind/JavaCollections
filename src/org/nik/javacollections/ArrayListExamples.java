package org.nik.javacollections;

import java.util.*;

public class ArrayListExamples {
	
	public static void main(String[] args){
		
		// Creating an empty array list
		ArrayList<String> list = new ArrayList<String>();
		
		//Add items to Array List
		list.add("Item1");
		list.add("Item2");
		list.add(2, "Item3"); // This will add Item3 to the third position of the arrayList
		
		list.add("Item4");
		
		//Display the contents of the array list
		System.out.println("The arrayList contains the follwing elements" + list);
		
		//Checking the index of an item 
		int pos = list.indexOf("Item2");
		System.out.println("The index of Item2 is : " + pos);
		
		// Checking of the array list is empty
		boolean check = list.isEmpty();
		System.out.println("Checking if the arrayList is empty : " + check);
		
		// Getting the size of the arrayList 
		int size = list.size();
		System.out.println("The size of the list is : " + size);
		
		// Checking if an element is included to the list
		boolean element = list.contains("Item5");
		System.out.println("Checking if the array list contains the object Item5: " + element);
		
		//Getting the element in a specific position
		String item = list.get(0);
		System.out.println("The item is the index 0 is : " + item);
		
		//Retrieve elements from the arrayList
		
		//1st way : loop using index and size list
		System.out.println("Retrieving items with loop using index and size list");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Index" + i + " - Item: " + list.get(i));
		}
		
		//2nd way : using the foreach loop
		System.out.println("Retrieving items using the foreach loop");
		for (String str : list) {
			System.out.println("Item is : " + str);
		}
		
		// 3rd way is using the iterator
		System.out.println("Retrieving items using the iterator");
		for(Iterator<String> it = list.iterator(); it.hasNext();){
			
			System.out.println("Item is : " + it.next());
		}
		
		//Replacing an element
		list.set(1,  "NewItem");
		System.out.println("The arraylist after the replacement is : " + list);
		
		//removing the first occurance of the item "Item3"
		list.remove("Item3");
		System.out.println("The final contents of the array list are : " + list);
		
		//Converting ArrayList to Array
		String[] simpleArray = list.toArray(new String[list.size()]);
		System.out.println("The array created after the conversion of our arrayList is : " + Arrays.toString(simpleArray));;
	}
}
