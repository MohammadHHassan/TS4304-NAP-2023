package day5;		// Name of the package

import java.time.LocalDate;		// Import LocalDate API (Application Programming Interface)
import java.util.Scanner;		// Import Scanner API

public class Example2		// Name of the class
{
	public static void main(String[] args)		// Main method
	{
		Scanner scanner = new Scanner(System.in);		// Declaration of Scanner class
		LocalDate now = LocalDate.now();		// Declaration of LocalDate class
		
		System.out.print("Please enter your birth year: ");		// Prompt a message for the user to enter their birth year
		int birthYear = scanner.nextInt();		// Store the user's input in birthYear
		
		System.out.println("You are " + (now.getYear()-birthYear) + " years old this year.");
		
		scanner.close();
	}
}
