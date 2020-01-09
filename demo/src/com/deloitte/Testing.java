package com.deloitte;


interface Inter5{
	int sum(int x,int y);
}


 public class Testing{
	 
	 public static void main(String[] args) {
		 Inter5 i=(x,y)->{
		              System.out.println("adding..");
		              return (x+y);
		 
	 };
	 System.out.println(i.sum(5,6));
		};
 }
