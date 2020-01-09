package com.deloitte;


public class P1 {
	public static void main(String[] args) {
		int []arr= {6,3,10,5,9};
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("after sorting");
		for(int i:arr) {
			System.out.println(i+"\t");
		}
		
		
		
		
	}
}
