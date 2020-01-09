package com.deloitte;
import java.util.Scanner;

class PrimeChecker{
	public boolean isPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}return true;
	}
}

public class prime {
	public static void main(String[] args) {
		PrimeChecker p=new PrimeChecker();
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int lower,upper;
		System.out.println("Enter the range");
		lower=sc.nextInt();
		upper=sc.nextInt();
		sc.close();
		if(lower<3||upper>999) {
			System.out.println("INVALID RANGE");
			
		}
		else {
			for(int i=lower;i<=upper;i++) {
				if(p.isPrime(i)) {
					sum+=i;
				}
			}
			System.out.println("Sum is "+sum);
		}
	}
}

	
		
		
		
		
		
		

