package com.deloitte;
import java.io.BufferedInputStream;

public class sort {
	public static void main(String[] args) {
		String []names= {"Manoj", "Abdul","Rohit","Pratik","Jaya"};
		for(int i=0;i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				if(names[i].compareTo(names[j])>0){
					String temp=names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		}
		for(String x:names) {
			System.out.println(x);
		}
		
	}

}
