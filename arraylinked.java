import java.util.*;
import java.io.*;

class arraylinked
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ds = 0;
        ArrayList<String> al = new ArrayList<String>();
        LinkedList<String> ll = new LinkedList<String>();
        do 
        {
            System.out.println("\n1. ArrayList\n2. LinkedList\n3. Exit\nSelect Data Structure for operation:");
            ds = Integer.parseInt(br.readLine());
            switch (ds) {
                case 1: 
                    int arrCh=0;
                    do 
                    {
                        System.out.println("\n1. Add\n2. Remove\n3. Display\n4. Exit\nSelect operation:");
                        arrCh = Integer.parseInt(br.readLine());
                        switch (arrCh)
                        {
                            case 1: 
					int ch=0;
								
					System.out.println("\n1. add \n2. all All \n3. Add at index \n4. EXIT \n Select Option: ");
					ch = Integer.parseInt(br.readLine());
					switch(ch){
					case 1:
						System.out.println("Enter element to add : ");
						al.add(br.readLine());
						System.out.println("Added Successfully !!");						
						break;
					case 2:
			            ArrayList<String> t = new ArrayList<String>();							
						int n;
						System.out.println("How many elements ? :");
						while(true){						
						n = Integer.parseInt(br.readLine());
						if(n>0)
							break;	 						
						else
							System.out.println("Enter positive number :");
						}	
						System.out.println("Enter elements :");
						for(int i=0;i<n;i++)
						{
						t.add(br.readLine());	
						}
						al.addAll(t);
						System.out.println("Added Successfully !!");
						break;
					case 3:
						int idx;
						System.out.println("Enter index for element to add :");
						while(true){
						idx=Integer.parseInt(br.readLine());
						if(idx<=al.size())
						{
							break;
						}
						else
						{
							System.out.println("Enter valid index :");	
						}
						}
						System.out.println("Enter element:");
						al.add(idx,br.readLine());
						System.out.println("Added Successfully !!");
												
						break;	
					case 4:
						break;
					default:
						System.out.println("Please enter valid choice...");
					}		
					break;
                            case 2:
					int ch1=0;
								
					System.out.println("\n1. Remove single element \n2. Remove all elements \n3. EXIT \n Select Option:");
					ch1 = Integer.parseInt(br.readLine());
					 switch(ch1)
				 		{
						case 1:
							
							System.out.println("Enter element to remove : ");
							String t= br.readLine();
							if(al.contains(t))
							{
      						  al.remove(t);	              				       System.out.println("Element Removed !");							
	    	                     			}
							else
							{
							System.out.println("Element does not exists !!");	
							}	
		 					break;
						case 2:
								al.clear(); //al.removeAll();
								System.out.println(" All elements are removed !"); 
							break;
						case 3:
							break;
						default:
							System.out.println("Please enter valid choice...");
						}	
						break;	

                            case 3: 
                                System.out.println("Curret Array List : "+al);
				break;

                            case 4:
				break;
								
                            default:
                                System.out.println("Please enter valid choice...");
                            break;
                        }

                    } while (arrCh < 4);
                
                break;
                				//Linked List
                case 2: 
                    int llCh=0;
                    do 
                    {
                        System.out.println("\n1. Add\n2. Remove \n3. Display\n4. Exit\nSelect operation:");
                        llCh = Integer.parseInt(br.readLine());
                        switch (llCh)
                        {
                            case 1: 
                                int ch=0;
								
				System.out.println("\n1. add at first \n2. add at last \n3. add \n4. EXIT \n Select Option: ");
					ch = Integer.parseInt(br.readLine());
						switch(ch){
							case 1:
								System.out.println("Enter element to add : ");
								ll.addFirst(br.readLine());
								break;
							case 2:
								System.out.println("Enter element to add : ");
								ll.addLast(br.readLine());
								break;
							case 3:
								System.out.println("Enter element to add : ");
								ll.add(br.readLine());
								break;
							case 4:
								break;
							default:
								System.out.println("Please enter valid choice...");
								}
                             				break;
							 
                            case 2: 
                                int ch1=0;
								
				System.out.println("\n1. remove first \n2. remove last \n3. remove\n4. EXIT \n Select Option: ");
					ch1 = Integer.parseInt(br.readLine());
						switch(ch1){
							case 1:
								ll.removeFirst();
							  System.out.println("Removed Successfully !");			
								break;
							case 2:
								ll.removeLast();
		                                                System.out.println("Removed Successfully !");
								break;
							case 3:		
								System.out.println("Enter element to add : ");
								String t = br.readLine();
						     if(ll.contains(t))	{						
							 ll.remove(t);
							System.out.println("Element remove successfully...");}
							else{
								System.out.println("Element does not exists !");
							    }	
								break;
							case 4:
								break;
							default:
								System.out.println("Please enter valid choice...");
								}
                             	break;
                        	
                            case 3: 
                                System.out.println("Curret Linked List : "+ll);
				break;
                        
                            case 4:
				break;
                        
                            default:
                                System.out.println("Please enter valid choice...");
                        }
                    
                    } while (llCh < 4);
					break;
				
		case 3:
			break;
                default:
			System.out.println("Please enter valid choice...");
            }
        } while (ds < 3);
    }
}
