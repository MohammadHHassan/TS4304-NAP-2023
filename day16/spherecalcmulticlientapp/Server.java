package day16.spherecalcmulticlientapp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server
{
	public static void main(String[] args)
	{
		try
		{
			ServerSocket socketServer = new ServerSocket(9101);	// Creating server socket with port number 9101
			System.out.println("Server started at " + new Date());
			
			while(true)		// Forever loop to accept multiple clients
			{
				Socket socket = socketServer.accept();	// Accept socket request from client
				System.out.println("\nClient has been connected.");
				
				// Implement thread to accept inputs and to give outputs from and to multiple clients at the same time
				new Thread(new Runnable()
				{
					@Override
					public void run()
					{
						try
						{
							DataInputStream fromClient = new DataInputStream(socket.getInputStream());	// Enable reading data from client
							DataOutputStream toClient = new DataOutputStream(socket.getOutputStream());	// Enable writing data to client
							
							while(true)		// Forever loop for sphere calculator app
							{
								double radius = fromClient.readDouble();	// Receive the radius value from client
								
								double volume = (4.0/3.0)*Math.PI*Math.pow(radius, 3);	// Calculate volume of sphere using the received radius value
								
								toClient.writeDouble(volume);	// Send value of volume to client
								
								System.out.println("\nReceived radius: " + radius);
								System.out.println("Sent volume: " + volume);
							}
						}
						catch (IOException e)
						{
							e.printStackTrace();
						}
						
					}
				}).start();
			}
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
}
