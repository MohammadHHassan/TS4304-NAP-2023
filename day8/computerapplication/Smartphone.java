package day8.computerapplication;

public class Smartphone extends Portable		// Smartphone inherits from Portable
{
	double cameraMegapixel;			// Instance variable for smartphone object
	boolean display;				// Instance variable for smartphone object
	
	public Smartphone(String operatingSystem, double cameraMegapixel)	// Constructor for smartphone object using 2 parameters
	{
		super(operatingSystem);
		this.cameraMegapixel = cameraMegapixel;		// Store the data from parameter variable to instance variable
		switchOffDisplay();			// Switch off display whenever smartphone object is created
	}
	
	public void switchOnDisplay()
	{
		display = true;				// Switch on smartphone display
	}
	
	public void switchOffDisplay()
	{
		display = false;			// Switch off smartphone display
	}
}
