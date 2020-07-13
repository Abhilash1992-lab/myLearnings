package com.java;

public class RemoveExtraSpaces {
	
	public static void main(String[] args) {
		
	
	String inputName = " And Yes    may    be          Yes             You        Are";

	String output = inputName.trim().replaceAll("  +", " ");
	System.out.println(output);
	}

}
