package com.deloitte;
import java.io.Serializable;

public class Employee5 implements Serializable{
	
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private int empId;
		private String empName;
		private float salary;
		
		public Employee5() {}
		
		public Employee5(int empId, String empName, float salary) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.salary = salary;
		}



		public int getEmpId() {
			return empId;
		}

		public void setEmpId(int empId) {
			this.empId = empId;
		}

		public String getEmpName() {
			return empName;
		}

		public void setEmpName(String empName) {
			this.empName = empName;
		}

		public float getSalary() {
			return salary;
		}

		public void setSalary(float salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
		}
		
		

	}




