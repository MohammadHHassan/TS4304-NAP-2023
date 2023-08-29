package day11.shape2d3dapplication;

import java.text.DecimalFormat;	// Import Decimal Format API

public abstract class Shape		// Abstract Shape class
{
	String colour;				// Shape attribute declaration

	public Shape(String colour)	// Shape constructor
	{
		this.colour = colour;	// Store the data from parameter var to instance var
	}
		
	DecimalFormat df = new DecimalFormat("#.##");	// Declare decimal format in 2 d.p
}
