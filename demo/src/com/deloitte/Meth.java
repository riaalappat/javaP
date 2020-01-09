package com.deloitte;

public class Meth {
	
	int a;
	int b;
	
	
	public Meth(int a, int b) {
		
		this.a = a;
		this.b = b;
	
	}
	
	static int add(int a,int b) {
		return a+b;
	}
	
	static int add(int a,int b,int c) {
		return a+b+c;
	}
	
	static float add(float a,float b) {
		return a+b;
	}
	
public static void main(String[] args) {
	System.out.println(add(5,6));
	System.out.println(add(1,2,3));
	System.out.println(add(1.5f,2.5f));
			
	
}
	
}

