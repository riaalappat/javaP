
package com.deloitte;
import java.util.Scanner;

public class P{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print((i+j+1)&1);
			}
			System.out.println();	
			}
			
		}
}



