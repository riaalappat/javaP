package com.deloitte;
import java.util.ArrayDeque;
import java.util.*;

public class Map1 {
	public static void main(String[] args) {
		List<String> emails=Arrays.asList("humprey@gmail.com","bogart@hotmail.com","clark@yahoo.com","gable@gmail.com","james@gmail.com","stewart@hotmail.com","gregory@yahoo.com");
		Map<String,List<String>>emailList= new HashMap<>();
		
		for(String email:emails) {
			String domain=email.substring(email.indexOf("@")+1,email.indexOf("."));
			
			if(emailList.containsKey(domain)) {
				List<String> em=emailList.get(domain);
				List<String> ems=emailList.get(domain);
				
				emailList.put(domain,em);
			}
			else {
				emailList.put(domain, Arrays.asList(email));
			}
		}
		//emailList.forEach(d,e)->{
			//System.out.println("\n\nDomain:"+d);
			System.out.println(".......................");
			//e.forEach(s)->System.out.println(s));
		}
		
	}

//}
