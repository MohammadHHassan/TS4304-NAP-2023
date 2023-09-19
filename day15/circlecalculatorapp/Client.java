package day15.circlecalculatorapp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client
{
	public static void main(String[] args)
	{
		try
		{
			// Request socket to server using local host with Port Number 9101
			Socket socket = new Socket("localhost", 9101);
			
			// Enable reading data from server
			DataInputStream fromServer = new DataInputStream(socket.getInputStream());
			// Enable writing data to server
			DataOutputStream toServer = new DataOutputStream(socket.getOutputStream());
			
			// Enable user's input
			Scanner scanner = new Scanner(System.in);
			
			while(true)		// Forever loop
			{
				// Prompt a message for user to enter the radius value
				System.out.print("Please enter the radius value: ");
				// Store the radius value in variable radius
				double radius = scanner.nextDouble();
				
				// Sending radius value to server
				toServer.writeDouble(radius);
				
				// Reading area value from server
				double area = fromServer.readDouble();
				
				System.out.println("\nSent radius: " + radius);
				System.out.println("Received area: " + area);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
