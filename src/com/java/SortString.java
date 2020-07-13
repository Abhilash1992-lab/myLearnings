package com.java;

import java.util.Arrays;

public class SortString {
	static 	String[] months = {"jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "NOV", "Dec"};
	public static void main(String[] args) {
		
	
	Arrays.sort(months);
	
	Arrays.sort(months, String.CASE_INSENSITIVE_ORDER);
	sortingArray(months);
	
		
	}
	
	public static void sortingArray(String[] array){

		for(String str: months){
			System.out.println(str +"      ");
		}
		
	
	}

}
