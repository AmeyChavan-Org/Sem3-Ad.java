
import java.net.*;
import java.io.*;

public class myclient
{
	public static void main(String args[]) throws UnknownHostException,IOException
	{
		Socket sc= new Socket("localhost",50710);//targeting the local host of the system 

		System.out.println("InetAddress:- "+sc.getInetAddress());
		System.out.println("Port Address:-"+sc.getPort());
		System.out.println("Local Port:-"+sc.getLocalPort());

		sc.close();//closing the socket connection 
	}
}
