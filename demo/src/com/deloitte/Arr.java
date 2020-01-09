package com.deloitte;


public class Arr {
	public static void main(String[] args) {

	
	int []nums={1,9,3,5,6,7};
	int max=nums[0];
	
	for(int i:nums) {
		if(i>max) {
			max=i;
	}
}
System.out.println("Max is:"+max);
}
}
