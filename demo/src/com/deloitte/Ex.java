package com.deloitte;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



	

	public class Ex {
		public static void main(String[] args) {
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			int a,b;
			System.out.println("enter a and b");
			
			
			try {
				a=Integer.parseInt(in.readLine());
				b=Integer.parseInt(in.readLine());
				
				double x=a/b;
				System.out.println("result is="+x);
			}
			catch(ArithmeticException|IOException| NumberFormatException ex) {
				System.out.println(" Error occured:"+ ex.getMessage());
			}
			
			
			System.out.println("Execution done");
			
		}

	}


