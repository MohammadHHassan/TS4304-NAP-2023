package day5;

import java.util.Scanner;

public class LearningArrays2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		String [] months = {"January", "February", "March", "April", "May", "June",
							"July", "August", "September", "October", "November", "December"};
		
		System.out.print("Please enter your birth month value: ");
		int birthMonthValue = scanner.nextInt();
		
		if(birthMonthValue>=1 && birthMonthValue<=12)
		{
			System.out.println("Your birth month is " + months[birthMonthValue-1]);
		}
		else
		{
			System.out.println("Invalid value.");
		}
		
		scanner.close();
	}
}
