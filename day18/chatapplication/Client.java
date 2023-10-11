package day18.chatapplication;

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
			Socket socket = new Socket("localhost", 9101);	// Requesting socket to server with IP address and port number
			
			DataInputStream fromServer = new DataInputStream(socket.getInputStream());	// Enable reading data from server
			DataOutputStream toServer = new DataOutputStream(socket.getOutputStream());	// Enable writing data to server
			
			Scanner scanner = new Scanner(System.in);		// Enable user's input
			
			System.out.print("Please enter your chat ID: ");
			String chatID = scanner.nextLine();				// Store the user's chat ID
			toServer.writeUTF(chatID);						// Send the chat ID to server
			
			System.out.println("You are connected with " + fromServer.readUTF());	// Display the name of other client
			
			new Thread(new Runnable()
			{
				@Override
				public void run()
				{
					while(true)		// Forever loop to accept multiple messages simultaneously
					{
						try
						{
							if(fromServer.available()>0)		// If there is any incoming text from other client
							{
								String receivedMsg = fromServer.readUTF();	// Read the text from the server
								System.out.println(">>> " + receivedMsg);	// Display the received text
							}
						}
						catch (IOException e)
						{
							e.printStackTrace();
						}
					}
				}				
			}).start();
			
			while(true)		// Forever loop to enable writing text anytime
			{
				String msg = scanner.nextLine();		// Store user's text
				toServer.writeUTF(msg);					// Send the msg to server
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
