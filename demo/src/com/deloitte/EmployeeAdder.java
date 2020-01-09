package com.deloitte;


public class EmployeeAdder {
	public void AddEmployee(Employee emp){
		if(emp.getEmpId()<10000 || emp.getEmpId()>99999) {
			throw new  InvalidEmployeeID("Invalid id");
		}
		
		if(emp.getEmpName().length()<3) {
			throw new  InvalidEmployeeName("Invalid name");
	}
		if(emp.getSalary()<30000 || emp.getSalary()>80000) {
			throw new  InvalidEmployeeSalary("Invalid salary");
		}
		
		

}
	
	
}
