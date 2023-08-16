package day8.computerapplication;

public class Laptop extends Portable		// Laptop inherits from Portable
{
	String graphicCard;
	boolean sleeping;
	
	public Laptop(String operatingSystem, String graphicCard)
	{
		super(operatingSystem);
		this.graphicCard = graphicCard;		// Store the parameter variable graphicCard to instance variable graphicCard
		sleep();				// Sleep the object whenever it is created
	}
	
	public void sleep()
	{	
		sleeping = true;		// Laptop is asleep
	}
	
	public void wakeUp()
	{
		sleeping = false;		// Laptop is not asleep
	}
}
