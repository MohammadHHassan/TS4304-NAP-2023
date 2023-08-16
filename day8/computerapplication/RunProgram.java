package day8.computerapplication;

public class RunProgram
{
	public static void main(String[] args)
	{
		Desktop desktop1 = new Desktop("Windows 11");
		System.out.println("Desktop 1's OS is " + desktop1.operatingSystem);
		System.out.println("Desktop 1's power state is " + desktop1.powerState);
		desktop1.bootUp();
		System.out.println("Desktop 1's new power state is " + desktop1.powerState);
		
		Laptop laptop1 = new Laptop("Windows 10 Home", "RTX3080");
		laptop1.chargeBattery(5);
		System.out.println("\nLaptop 1's graphic card is " + laptop1.graphicCard);
		System.out.println("Battery = " + laptop1.getBatteryCapacity() + "%");
		laptop1.useBattery();
		System.out.println("New battery after usage = " + laptop1.getBatteryCapacity() + "%");
	}
}
