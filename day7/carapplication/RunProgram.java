package day7.carapplication;

public class RunProgram
{
	public static void main(String[] args)
	{
		Wheels wheel1 = new Wheels();		// Instantiate wheel1 object
		wheel1.brand = "Bridgestone";
		wheel1.size = 20;
		
		Wheels wheel2 = new Wheels();
		wheel2.brand = "LingLong";
		wheel2.size = 16;
		
		Car car1 = new Car();		// Instantiate car1 object
		car1.brand = "Mitsubishi";
		car1.model = "Lancer Evo 9";
		car1.colour = "Red";
		car1.numberOfDoors = 5;
		car1.engineSize = 2.5;
		car1.wheels = wheel2;
		
		System.out.println(car1);
		
		Car car2 = new Car();		// Instantiate car2 object
		car2.brand = "Toyota";
		car2.model = "Kijang";
		car2.colour = "White";
		car2.numberOfDoors = 2;
		car2.engineSize = 4.0;
		car2.wheels = wheel1;
		
		System.out.println(car2);
		
		System.out.println("\nCurrent speed of car 1 = " + car1.currentSpeed + " km/h");
		car1.pressAccelerator();
		car1.pressAccelerator();
		System.out.println("Speed of car 1 after accelerating = " + car1.currentSpeed + " km/h");
		car1.pressBrake();
		car1.pressBrake();
		car1.pressBrake();
		car1.pressBrake();
		car1.pressBrake();
		System.out.println("Speed of car 1 after braking = " + car1.currentSpeed + " km/h");
		
		System.out.println("Car 1 Wheels = " + car1.wheels);
		System.out.println("Car 2 Wheels = " + car2.wheels);
	}
}
