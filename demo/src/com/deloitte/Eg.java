package com.deloitte;
import java.io.*;

public class Eg {
	public static void main(String[] args) {
		
	
	
	try{ 
		
		File file=new File("C:\\Users\\Admin\\Desktop\\j.txt");
		//FileInputStream fin=new FileInputStream(file);
		FileReader fin=new FileReader(file);
		//int c;
		//while((c=fin.read())!=-1){
			//System.out.print((char)c);
		BufferedReader br=new BufferedReader(fin);
		System.out.println(br.readLine());
		
	}
	catch(Exception ex) {
		System.out.print(ex);
		
	}

}
}

