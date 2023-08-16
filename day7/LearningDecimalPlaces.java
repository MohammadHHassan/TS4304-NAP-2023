package day7;		// Name of package

import java.text.DecimalFormat;			// Library for decimal format

public class LearningDecimalPlaces		// Name of class
{
	public static void main(String[] args)		// Main method
	{
		double pi = 3.14159;
		
		System.out.println("Pi = " + pi);
		System.out.printf("Pi in 2 d.p = %.2f\n", pi);		// Print out pi in 2 d.p using printf
		
		DecimalFormat a = new DecimalFormat("#.#");			// Declaration of Decimal Format in 1 d.p
		DecimalFormat b = new DecimalFormat("#.##");
		
		System.out.println("Pi in 1 d.p = " + a.format(pi));
		System.out.println("2.555555 in 1 d.p = " + a.format(2.555555));
		
		System.out.println("Math.PI in 2 d.p = " + b.format(Math.PI));
	}
}
