package com.deloitte;


interface Operation{
	double operate(double a,double b);
}

class Calculation{
	double calculate(double i, double j, Operation op) {
		return op.operate(i, j);
	}
}


public class Test {
	public static void main(String[] args) {
		Calculation cal=new Calculation();
		double a=1.5,b=2.5;
		double sum=cal.calculate(a,b,(x,y)->x+y);
		double pr=cal.calculate(a,b,(x,y)->x*y);
		System.out.println(sum);
		System.out.println(pr);
	};
	 

}
