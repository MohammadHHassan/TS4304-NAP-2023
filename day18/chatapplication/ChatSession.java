package day18.chatapplication;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ChatSession implements Runnable	// Implements runnable to be able to run multiple sessions simultaneously
{
	private Socket client1, client2;		// Instance variable socket for client1 and client2
	private static int sessionNumber=0;		// Class variable to count the number of sessions created
	
	public ChatSession(Socket client1, Socket client2)		// Constructor for chat session
	{
		this.client1 = client1;				// Store client1 parameter variable to client1 instance variable
		this.client2 = client2;				// Store client2 parameter variable to client2 instance variable
	}

	@Override
	public void run()
	{
		try
		{
			DataInputStream fromClient2 = new DataInputStream(client1.getInputStream());	// Enable reading data from client 2
			DataOutputStream toClient2 = new DataOutputStream(client1.getOutputStream());	// Enable writing data to client 2
			
			DataInputStream fromClient1 = new DataInputStream(client2.getInputStream());	// Enable reading data from client 1
			DataOutputStream toClient1 = new DataOutputStream(client2.getOutputStream());	// Enable writing data to client 1
			
			String chatID1 = fromClient1.readUTF();		// Receive chat ID from client 1
			String chatID2 = fromClient2.readUTF();		// Receive chat ID from client 2
			
			System.out.println("\n" + chatID1 + " has been connected with " + chatID2);	// Display the clients who have been connected
			sessionNumber++;		// Increment to count the number of session
			System.out.println("Chat Session No. " + sessionNumber + " has started.\n");	// Display the session number
			
			toClient1.writeUTF(chatID2);		// Send chat ID 2 to client 1
			toClient2.writeUTF(chatID1);		// Send chat ID 1 to client 2
			
			while(true)			// Forever loop to enable reading and writing text between the clients
			{
				if(fromClient1.available()>0)		// If there is any incoming text from client 1
				{
					String msg1 = fromClient1.readUTF();	// Receive the text from client 1
					toClient2.writeUTF(msg1);		// Send the received text to client 2
				}
				
				if(fromClient2.available()>0)		// If there is any incoming text from client 2
				{
					String msg2 = fromClient2.readUTF();	// Receive the text from client 2
					toClient1.writeUTF(msg2);		// Send the received text to client 1
				}
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
}
