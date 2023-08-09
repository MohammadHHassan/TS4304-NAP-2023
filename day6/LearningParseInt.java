package day6;

import java.util.Scanner;		// Import Scanner API

public class LearningParseInt
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);	// Declare scanner to enable user's input
		
		System.out.print("Please enter a number: ");	// Prompt a message for the user to enter a number
		String a = scanner.nextLine();		// Store the input inside String a
		
		System.out.println("String a = " + a);		// Print out String a
		System.out.println("a+10 = " + (a+10));		// a+10 = 1010 because a is String type and cannot do arithmetic operation
		
		int b = Integer.parseInt(a);		// Convert String a into integer b
		System.out.println("b+10 = " + (b+10));		// b+10 = 20 because of the conversion into integer
		
		scanner.close();	// Close the scanner class
	}
}
