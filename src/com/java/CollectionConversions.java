package com.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionConversions {
	
	public static void main(String[] args) {
		list_TO_Array();
	}

	
	static void list_TO_Array(){
		int[] arr1 = {2,4,5,6,7,5,3,2,4};
		ArrayList<String> AL = new ArrayList<String> ();
		Arrays.asList(arr1);
		
		
		AL.add("my");
		AL.add("name");
		AL.add("is");
		System.out.println("Actual List  " +AL);
		
		System.out.println(AL.toString());
		AL.toArray();
		String arr = AL.toString();
		System.out.println(arr);
		
		String[] ar = (String[]) AL.toArray();
		
	}
	
	static void Array_to_List(){
		
		int[] test = {1,4,5,7,5,3};
		
		List<Integer> li = new ArrayList<Integer>();
		
		
		
		
	}
	
}
