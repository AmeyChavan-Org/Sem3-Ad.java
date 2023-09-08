import java.io.*;
import java.util.*;

class sortedset
{
	public static void main(String[] args) throws IOException
	{
		int n;
		SortedSet<String> ss = new TreeSet<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter number of color's to add : ");
		while(true){
			 n = Integer.parseInt(br.readLine());

			if(n>=0)
				break;
			else
				System.out.println("Enter valid no:");
        	}
	        for(int i = 0;i<n;i++)
	        {
	        	System.out.println("Enter color : ");
            		ss.add(br.readLine().toLowerCase().trim());
        	}
        
        	Iterator<String> itr = ss.iterator();
        	System.out.println("\nAll the Unique Colors: ");
        	while (itr.hasNext())
        	{
            		System.out.println(itr.next());
        	}
    	}
}
