package com.deloitte;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileOperations {
	public static void main(String[] args) throws Exception {
		
		FileInputStream fin=null;
		ObjectInputStream ois=null;
		FileOutputStream fout=null;
		ObjectOutputStream oos=null;
		
		
	try{ 
		Employee emp=new Employee(101,"Samir",50000);
		
		fout=new FileOutputStream("emp.txt");
		oos= new ObjectOutputStream (fout);
		
		oos.writeObject(emp);
	
	}
	catch(Exception ex) {
		System.out.print(ex);
		
	}
	finally {
		oos.close();
		fout.close();
	}
	
	
	try{ 
		fin=new FileInputStream("emp.txt");
		ois= new ObjectInputStream (fin);
		Employee emp=(Employee)ois.readObject();
		System.out.println(emp);
	}
	catch(Exception ex) {
		System.out.print(ex);
		
	}
	finally {
		ois.close();
		fin.close();
	}
	
	
	
	
}
}

