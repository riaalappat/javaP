package com.deloitte;
import java.util.ArrayList;

public class A2 
{
	
		    public static void main(String[] args) 
		    {
		    	String []email= {"humprey@gmail.com","bogart@hotmail.com","clark@yahoo.com","gable@gmail.com","james@gmail.com","stewart@hotmail.com","gregory@yahoo.com"};
		    	 ArrayList<String> l1 = new ArrayList<String>();
		    	 ArrayList<String> l2 = new ArrayList<String>();
		    	 ArrayList<String> l3 = new ArrayList<String>();
			        
			        for(String x:email) 
					{
						if(x.contains("@gmail.com")) 
						{
							 l1.add(x);
						    
						}
						if(x.contains("@hotmail.com")) 
						{
							 l2.add(x);
						    
						}
						if(x.contains("@yahoo.com")) 
						{
							 l3.add(x);
						    
						}
			        }
			        
			        //print list
			        System.out.println();
			        for(int i=0; i < l1.size(); i++)
			        {
			            System.out.println(l1.get(i) );
			        }
			        System.out.println();
			        for(int i=0; i < l2.size(); i++)
			        {
			            System.out.println(l2.get(i) );
			        }
			        System.out.println();
			        for(int i=0; i < l3.size(); i++)
			        {
			            System.out.println(l3.get(i) );
			        }
			        
			        
			        String[] arr=new String[l1.size()];
			        
			        arr=l1.toArray(arr);
			        
					System.out.println("Elements of Array are:");
					for(int i=0; i < arr.length; i++)  
					{
						
						System.out.println(arr[i]);
					}
			   
		        
			}
}
