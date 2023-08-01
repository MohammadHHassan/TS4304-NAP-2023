package day4;

import java.util.Scanner;		// Import Scanner API/library

public class LearningWhileWithScanner
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);	// Implement a Scanner class to accept user's input
		
		System.out.print("Please enter the number 5: ");	// Prompt a message for the user to enter the number 5
		int value = scanner.nextInt();		// Store the user's input in variable value (int)
		
		int count=0;		// Declare the variable count to count the user's wrong input
		
		while(value!=5)		// While condition value is not equal to 5
		{
			System.out.println("You have entered the wrong value.");
			System.out.print("Please try again: ");		// Ask the user to enter another value
			value = scanner.nextInt();		// Store the user's input in value
			count++;		// Increment count
		}
		
		System.out.println("You have entered the correct value.");
		System.out.println("Number of times you entered an incorrect value: " + count);
		
		scanner.close();
	}
}


