package com.deloitte;


	
	interface Operation1{
		double operate(double a,double b);
	}

	class Calculation1{
		double calculate(double i, double j, Operation1 op) {
			return op.operate(i, j);
		}
	}
	
	class AddOperation implements Operation1{
		public double operate(double a, double b) {
			return a+b;
		}
	}


public class Test1 {
		public static void main(String[] args) {
			Calculation1 cal=new Calculation1();
			double a=1.5,b=2.5;
			Operation1 op=new AddOperation();
			double sum=cal.calculate(a,b,op);
			double pr=cal.calculate(a,b,(x,y)->x*y);
			System.out.println(sum);
			System.out.println(pr);
		};
		 

	}



