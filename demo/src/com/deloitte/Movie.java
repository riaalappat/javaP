package com.deloitte;
import java.util.*;



/* Q. Write a Java Program for following requirements
Take input from User for ID, Name, Showdate, Showtime, Status
Create movie object and populate above details
Store the object in an ArrayList
Take input from user for ID and display the details in the movie object of that ID.
- User Interface should be in class having main method
- Storage should be in Data Access Object

- Ensure proper coding standards, naming conventions, OOP concepts */ 

public class Movie {
	int ID;
	String Name;
	String Showdate;
	String Showtime;
	String Status;

	public Movie() {}
	
	public Movie(int iD, String name, String showdate, String showtime, String status) {
		super();
		ID = iD;
		Name = name;
		Showdate = showdate;
		Showtime = showtime;
		Status = status;
	}



	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID:");
		int ID= sc.nextInt();
		System.out.println("Enter Name:");
		String Name=sc.next();
		System.out.println("Enter Showdate:");
		String Showdate=sc.next();
		System.out.println("Enter Showtime:");
		String Showtime=sc.next();
		System.out.println("Status:");
		String Status=sc.next();
		
		Movie m=new Movie(ID,Name,Showdate,Showtime,Status);
		System.out.println(m);
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
