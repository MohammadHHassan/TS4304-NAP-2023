package day16.spherecalcmulticlientapp;

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
			Socket socket = new Socket("localhost", 9101);	// Requesting socket to server
			
			DataInputStream fromServer = new DataInputStream(socket.getInputStream());	// Enable reading data from server
			DataOutputStream toServer = new DataOutputStream(socket.getOutputStream());	// Enable writing data to server
			
			Scanner scanner = new Scanner(System.in);
			
			while(true)		// Forever loop for sphere calculator app
			{
				System.out.print("Please enter the radius value: ");
				double radius = scanner.nextDouble();
				
				toServer.writeDouble(radius);		// Send the radius value to server
				
				double volume = fromServer.readDouble();	// Received value of volume from server
				
				System.out.println("\nSent radius: " + radius);
				System.out.println("Received volume: " + volume);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
}
