import java.net.*;
import java.io.*;

public class myserver
{
	public static void main(String args[]) throws IOException
	{
		ServerSocket ss = new ServerSocket(50710);
		System.out.println("Activated , Server is waitng for connection");
		Socket sc= ss.accept();
		System.out.println("\n Client connect ");
		System.out.println("\n Server closing");
		sc.close();
	}
}
