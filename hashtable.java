import java.util.*;
import java.io.*;

class hashtable
{
	public static void main(String args[]) throws IOException
  	{
    		String name;
    		double per;
    		int ch;

    		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    		Hashtable<String, Double> hs = new Hashtable<String, Double>();
    		do
    		{
      			System.out.print("\n\n1.Add Student\n2.Display Details\n3.Search\n4.Exit\nEnter your choice: ");
      			ch=Integer.parseInt(br.readLine());
      		    	switch(ch)
      		    	{
			    	case 1:	
			    		System.out.print("\nEnter student name: ");
					while(true){			    		
						name=br.readLine();
						if(!hs.containsKey(name))
						{						
						if(name.matches("[a-zA-Z]*"))
							break;
						else
							System.out.println("Enter valid name");
						}
						else
							System.out.println("Student name already exists !! re-enter name :");
						}
			    		System.out.print("Enter percentage of student: ");
			    		while(true)
					{
						per=Double.parseDouble(br.readLine());
						if(per>=0 && per<=100)
	                               		{
							break;
						}
						else
						{
							System.out.println("percentage cannot be negative or more than 100 \nEnter valid percentage: ");
						}
					}
					hs.put(name,per);
			    		break;
                
			    	case 2:
			    		Enumeration keys=hs.keys();
			    		Enumeration values=hs.elements();
			    		System.out.print("\nName\tPercentage");
			    		while(keys.hasMoreElements() && values.hasMoreElements())
			    		{
		  	    			System.out.println("\n"+keys.nextElement()+"\t"+values.nextElement());
			    		}
			    		break;
                    
			    	case 3:
			    		System.out.print("\nEnter name of the student to be searched(IT is case sensitive): ");
			    		name=br.readLine();
			    		System.out.print("\nName\tPercentage");
			    		boolean true1=hs.containsKey(name);
			    		if(true1)
			    		{
		  	    			System.out.println("\n"+name+"\t"+hs.get(name));
			    		}
			    		else
			    			System.out.print("\nStudent detail not found");
			    		break;
                    
			    	case 4: 
                    			System.exit(0);			    		
                    			break;
                    		default:
	                                System.out.println("Please enter valid choice...");
		                        break;
			}
		}while(ch<5);
  	}
}
