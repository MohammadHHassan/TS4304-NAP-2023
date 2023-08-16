package day8.computerapplication;

public class Computer
{
	String operatingSystem;		// Instance variable
	boolean powerState;			// Instance variable
	
	public Computer(String operatingSystem)			// Constructor for computer class with operatingSystem parameter variable
	{
		this.operatingSystem = operatingSystem;		// Storing from parameter variable to instance variable
		shutDown();				// Turn off power everytime a computer object is created
	}
	
	public void shutDown()
	{
		powerState = false;		// Power off
	}
	
	public void bootUp()
	{
		powerState = true;		// Power on
	}
}
