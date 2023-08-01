package day4;

import java.util.Scanner;

public class LearningFor
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		String name = scanner.nextLine();
		
		for(int i=1 ; i<10 ; i++)		// For condition starts from 1, ends at 5, and incremented by 1 on each loop
		{
			System.out.println(i + ". " + name);
		}
		
		scanner.close();
	}
}
