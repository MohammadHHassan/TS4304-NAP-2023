package day8.computerapplication;

public class Portable extends Computer		// Portable inherits from Computer
{
	int batteryCapacity;			// Instance variable for Portable object
	
	public Portable(String operatingSystem)	// Portable constructor automatically generated
	{
		super(operatingSystem);
	}
	
	public int getBatteryCapacity()		// Method to get the capacity of the battery
	{
		return batteryCapacity;			// Return the battery capacity value
	}
	
	public void chargeBattery(int percentage)	// Method to charge the battery depending on the percentage
	{
		batteryCapacity += percentage;	// Increase the battery capacity with the percentage
		
		if(batteryCapacity>100)
		{
			batteryCapacity=100;		// Battery capacity stays 100% if exceeds 100
		}
	}
	
	public void useBattery()
	{
		batteryCapacity-=10;			// Decrease the battery capacity by 10%
		
		if(batteryCapacity<0)
		{
			batteryCapacity=0;			// Battery capacity stays at 0. No negative value
		}
	}
}
