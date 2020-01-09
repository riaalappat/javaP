package com.deloitte;

public class Assignment
{
	public static void main(String[] args) 
	{
		String []email= {"humprey@gmail.com","bogart@hotmail.com","clark@yahoo.com","gable@gmail.com","james@gmail.com","stewart@hotmail.com","gregory@yahoo.com"};
		String[] g=new String[10];
		//String[] h=new String[10];
		//String[] y=new String[10];

		for(String x:email) 
		{
			if(x.contains("@gmail.com")) 
			{
				for (int i = 0; i <email.length; i++) 
				{  
					g[i]=x;
				}		
				
			}
			
			
			
		for(String a:g) {
			System.out.println(a);
		}
		
		
		
	}
	}}



/*
	if(x.contains("@hotmail.com")) 
	{
		for (int i = 0; i <email.length; i++) 
		{  
			h[i]=x;
		}		
		
	}
	if(x.contains("@yahoo.com")) 
	{
		for (int i = 0; i <email.length; i++) 
		{  
			y[i]=x;
		}		
		
	}
	
	
}
	*/