package day13.datastructures;

import java.util.ArrayList;

public class LearningArrayList
{
	public static void main(String[] args)
	{
		ArrayList<String> nameList = new ArrayList<String>();	// Declaration of ArrayList with String type
		
		nameList.add("Manchester");		// Adding Manchester inside nameList
		nameList.add("United");			// Adding United inside nameList
		nameList.add("Kalah");			// Adding Kalah inside nameList
		nameList.add("Hahaha");
		
		for(String a : nameList)
		{
			System.out.print(a + " ");	// Printing out the elements in nameList
		}
		
		nameList.add(3, "lawan");		// Adding lawan to array number 3
		nameList.add(4, "Arsenal");		// Adding Arsenal to array number 4
		
		System.out.println();			// Print out new line
		
		for(String b : nameList)
		{
			System.out.print(b + " ");
		}
		
		nameList.remove(5);				// Remove element number 5 (Hahaha) in nameList
		nameList.remove(2);				// Remove element number 2 (Kalah) in nameList
		nameList.remove(2);				// Remove element number 2 (lawan) in nameList
		nameList.remove(2);				// Remove element number 2 (Arsenal) in nameList
		nameList.add("Strong");
		System.out.println();
		
		for(String c : nameList)
		{
			System.out.print(c + " ");
		}
		
		System.out.println("\nnameList[2] = " + nameList.get(2));
		System.out.println("Size of Array List: " + nameList.size());
	}
}
