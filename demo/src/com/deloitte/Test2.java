package com.deloitte;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		
		
		int digit=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		if(n<100) {
			System.out.println("INVALID");
		}
		else {
			int sum=0;
			while(n!=0) {
				digit=n%10;
				if(digit%2!=0) {
					sum=sum+digit;
				}
			n=n/10;
			}
		
		System.out.println("Sum is:"+sum);
		
	}

}
}


