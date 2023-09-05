package day13.datastructures;

import java.util.ArrayList;
import java.util.Scanner;

public class GuessingApplication
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);		// Declaration of Scanner class to enable user's input
		ArrayList<Integer> guessedNumber = new ArrayList<Integer>();	// Declaration of Array List to store guessed number from the user
		
		int randomNumber = 1 + (int)(Math.random()*((10-1)+1));		// Generating random number between 1 and 10 (inclusive)
		System.out.println("A random number between 1 to 10 has been generated.\n");
		
		while(true)		// Forever loop
		{
			System.out.print("Cuba teka: ");	// Prompt a message for the user to enter their guess
			int guess = scanner.nextInt();		// Store the user's input in guess variable
			
			if(guess == randomNumber)			// If the user entered the correct number
			{
				System.out.println("Lurus!");	// Print out Lurus!
				break;							// Break out from the forever loop
			}
			else
			{
				for(int i=0 ; i<guessedNumber.size() ; i++)		// Check each element inside the array list
				{
					if(guessedNumber.get(i) == guess)	// If the number has already been guessed before
					{
						System.out.println("Sudah Teka\n");
						break;					// Break out from for loop
					}
				}
				guessedNumber.add(guess);		// Adding the wrong guessed number into the array list
				System.out.println("Salah teka. Sila cuba lagi.\n");
			}
		}
		scanner.close();
	}
}
