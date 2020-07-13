package com.java;

import java.util.HashMap;
import java.util.Set;

public class RepeatedString_HashMap {
static String givenString;
	
	public static void main(String[] args) {
		
		stringCount();
	}
	
	public static void stringCount(){
		String[] splittedString = givenString.split(" ");
		
		HashMap<String, Integer> hm  = new HashMap<String, Integer>();
		
		for(String str :splittedString ){
			if(hm.get(str)!= null){
				hm.put(str, hm.get(str)+1);
			}
			else
				hm.put(str, 1);
		}
		//Set<String> se = hm.keySet();
		
		for(String s : hm.keySet()){
			if(hm.get(s) > 1){
				System.out.println(hm.get(s));
			}
			
		}
				
	}
	
}
