package com.deloitte;

public class Mainnn {
	public static void main(String[] args) {
		Employee emp=new Employee(101,"Mahesh",50000);
		
		EmployeeAdder a=new EmployeeAdder();
		try {
			a.AddEmployee(emp);
		}
		catch(Exception e) {
			System.out.println(e+ "error");
		}
		
		
	}

}


	
		