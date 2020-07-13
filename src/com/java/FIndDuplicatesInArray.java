package com.java;

import java.util.ArrayList;
import java.util.Arrays;

public class FIndDuplicatesInArray {
	  public static void func2(Integer arr[]) 
	    { 
	        // Using Arrays.asList() method 
	        ArrayList<Integer> array_list =  new ArrayList<Integer>(Arrays.asList(arr)); 
	        System.out.print(array_list); 
	    } 
	

	public static void main(String[] args) {

		int[] arr = new int[] { 3, 5, 4, 6, 7, 5, 3, 7, 9, 3, 4, 7 };

		
	

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[j]);
			}
		}

	}

}
