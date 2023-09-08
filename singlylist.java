import java.util.*;
import java.io.*;

class singlylist
{
   	public static void main(String[] args) throws IOException
   	{
        	LinkedHashSet<Integer> l1 = new LinkedHashSet<Integer>();
        	LinkedHashSet<Integer> l2 = new LinkedHashSet<Integer>();
        
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        	int l1Len,l2Len;
        	System.out.println("Enter no elements to add in list 1");
		while(true)
			{
			 l1Len = Integer.parseInt(br.readLine());
			if(l1Len>0)
				break;
			else
				System.out.println("Enter valid no:");
        	}        	
			
        	System.out.println("Enter elements for list 1");
        	for(int i = 0;i < l1Len;i++)
        	{
        		l1.add(Integer.parseInt(br.readLine()));
        	}

        	System.out.println("Enter no elements to add in list 2");
        	while(true){
			  l2Len = Integer.parseInt(br.readLine());
			if(l1Len>0)
				break;
			else
				System.out.println("Enter valid no:");
        	} 

        	System.out.println("Enter elements for list 2");
       		for(int i = 0;i < l2Len;i++)
        	{
            		l2.add(Integer.parseInt(br.readLine()));
        	}

        	int ch = 0;
        	do 
        	{
            		System.out.println("\n1. Lists in reverse order.\n2. Intersection of List\n3. Add"+
            " element at starting in list1\n4. Remove last element from list2\n5. Exit\n");
            		System.out.println("\nEnter operation to perform : ");
            		ch = Integer.parseInt(br.readLine());
            		switch (ch) 
            		{
                		case 1:
                    			List<Integer> templ1 = new ArrayList<Integer>(l1);
                    			List<Integer> templ2 = new ArrayList<Integer>(l2);
                    			Collections.reverse(templ1);
                    			Collections.reverse(templ2);
                    			System.out.println("\nList 1 ==> "+l1+"\nList 2 ==> "+l2);
                    			System.out.println("Reversed List 1 ==> "+templ1+"\nReversed List 2 ==> "+templ2);
                			break;
                	
                		case 2:
                			HashSet<Integer> inter = new HashSet<Integer>();
                    			HashSet<Integer> inter2 = new HashSet<Integer>(); 
                    			inter2 = (HashSet<Integer>) l2.clone();
                    			inter = (HashSet<Integer>) l1.clone();
                    			inter.retainAll(inter2);
                    			System.out.println("\nIntersection of both list ==> "+inter);
                			break;
                	
                		case 3:
                    			System.out.println("\nEnter number to add in list 1 : ");
                    			int tempNo = Integer.parseInt(br.readLine());
                    			System.out.println("\nList 1 Before adding element ==> "+l1);
                    			LinkedList<Integer> temprl1 = new LinkedList<Integer>(l1);
                    			temprl1.addFirst(tempNo);
                    			l1 = new LinkedHashSet<Integer>(temprl1);
                    			System.out.println("\nList 1 After adding element ==> "+l1);
                			break;
                	
                		case 4:
                    			System.out.println("\nList 2 before removing last element ==> "+l2);
                    			LinkedList<Integer> temprl2 = new LinkedList<Integer>(l2);
                    			temprl2.removeLast();
                    			l2 = new LinkedHashSet<Integer>(temprl2);
                    			System.out.println("\nList 2 After removing element ==> "+l2);
                			break;
                	
                		case 5:
                			break;
                	
  	 	        	default:
                			break;
            		}	
        	}while (ch < 5 && ch > 0);
    	}
}
