package day18.chatapplication;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server
{
	public static void main(String[] args)
	{
		try
		{
			ServerSocket socketServer = new ServerSocket(9101);		// Declaration of server socket with port 9101
			System.out.println("Server started at " + new Date());	// Display the time and date when the server is started
			
			InetAddress IP = InetAddress.getLocalHost();		// To retrieve local IP address
			System.out.println("Server's IP Address: " + IP.getHostAddress());	// Display local IP address
			
			while(true)		// Forever loop to accept multiple clients' requests
			{
				Socket client1 = socketServer.accept();		// Accept socket request from client 1
				Socket client2 = socketServer.accept();		// Accept socket request from client 2
				
				ChatSession chatSession = new ChatSession(client1, client2);	// Use constructor to create the chat session
				
				new Thread(chatSession).start();		// Enable multiple chat sessions running simultaneously
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
