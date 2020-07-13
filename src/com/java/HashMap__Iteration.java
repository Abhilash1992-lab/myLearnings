package com.java;


import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

// How to find repeated/duplicated words in a string using Java public class
public class HashMap__Iteration{

public static void main(String[]args)
{Scanner sc=new Scanner(System.in);
System.out.print("Enter string to analyse:");
String str = sc.nextLine(); 
sc.close();
String[] splittedWords = str.split(" ");


HashMap<String,Integer> hash=new HashMap<String,Integer>();

for( String str1 : splittedWords) {
	if(hash.get(str1) != null) {
		hash.put(str1, hash.get(str1)+1);
		
	}
	else {
		hash.put(str1, 1);
	}
}
Set<String> str2 = hash.keySet();

for(String st : str2){
	System.out.println("Word " +st +"  repeated by   " + hash.get(st));
	

	
}

}}

/*
 * public class HashMap__Iteration { public static void main(String[] args) {
 * String string = "Big black bug bit a big black dog on his big black nose";
 * int count;
 * 
 * // Converts the string into lowercase string = string.toLowerCase();
 * 
 * // Split the string into words using built-in function String words[] =
 * string.split(" ");
 * 
 * System.out.println("Duplicate words in a given string : "); for (int i = 0; i
 * < words.length; i++) { count = 1; for (int j = i + 1; j < words.length; j++)
 * { if (words[i].equals(words[j])) { System.out.println("Words of [i] " +
 * words[i]); count++; // Set words[j] to 0 to avoid printing visited word
 * words[j] = "0"; } }
 * 
 * // Displays the duplicate word if count is greater than 1 if (count > 1 &&
 * words[i] != "0") System.out.println(words[i]); } }
 */
