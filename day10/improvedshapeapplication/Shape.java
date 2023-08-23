package day10.improvedshapeapplication;

import java.text.DecimalFormat;

public abstract class Shape 	// Abstract class cannot create object from this
{
	DecimalFormat df = new DecimalFormat("#.##");	// Implement decimal format in 1 d.p
	
	String colour;				// Instance variable

	public Shape(String colour)	// Shape constructor with colour parameter
	{
		editColour(colour);		// Store colour parameter to colour instance variable
	}
	
	public void editColour(String colour)	// Method to edit colour
	{
		this.colour = colour;
	}
	
	public abstract double getArea();	// Declare abstract method to get the area
	public abstract double getPerimeter();	// Declare abstract method to get the perimeter
}
