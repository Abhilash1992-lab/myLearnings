package com.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ArraysPractice {
	public static void main(String[] args) {

		//twoDimensionalArrays();
		//findDuplicates();
		//sortStrings();
		//test();
		//checkPrimeNum();
		removeExtraSapces();
	}

	
	public static void removeExtraSapces()
	{
		String str = "   My    name is                Abhi   ";
	//	System.out.println(str);
	String withoutSpace =	str.trim().replaceAll(" +", " ");
	System.out.println("String without extra spaces : " +withoutSpace); // to remove extra spaces in entire string
		System.out.println(withoutSpace);
// System.out.print(str.trim());		//to remove trailing and leading spaces 
	}
	public static void checkPrimeNum() {	
		Scanner scan = new Scanner(System.in);
		scan.close();
	System.out.print("Enter an int value : ");
	int input = scan.nextInt();
	if (checkPrime(input)) {
		System.out.println("Input value " + input + " is a prime number.");
	} else {
		System.out.println("Input value " + input
				+ " is not a prime number.");
		
		
	}
}

public static boolean checkPrime(int n) {
	if (n <= 1) {
		return false;
	}
	for (int i = 2; i < Math.sqrt(n); i++) {
		if (n % i == 0) {
			return false;
		}
	}
	return true;
}
	public static void test() {
		/*
		 * String str = "Happy New Near";
		 * 
		 * String [] arr = str.split(" ");
		 * 
		 * for(int i=0; i<=arr.length; i++) { System.out.println(arr[i]); }
		 */
		
		//System.out.println(Math.sqrt(10));
		
		 String str[] = { "yogi", "ram", "ram", "yogi", "yogi", "yogi", "raju", "raju", "ram", "yogi", };
	        Map<String, Integer> map = new HashMap<String, Integer>();
	        for (String s : str) {
	            if (map.containsKey(s)) {
	                map.put(s, map.get(s) + 1);
	                System.out.println("Map is now  " +map);
	            } else {
	                map.put(s, 1);
	            }
	        }
	        for (Entry<String, Integer> e : map.entrySet()) {
	            System.out.println(e.getKey() + "---" + e.getValue());

	        }
	}
	public static void arrays() {
		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		cars[0] = "Opel";
		System.out.println(cars[0]);
		System.out.println(cars[1]);
		System.out.println(cars[2]);
		System.out.println(cars[3]);
	}

	public static void twoDimensionalArrays() {
		int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
		for (int i = 0; i < myNumbers.length; ++i) {
			for (int j = 0; j < myNumbers[i].length; ++j) {
				System.out.println(myNumbers[i][j]);
			}
		}
	}
	
	
	public static void findDuplicates() {

		

			ArrayList<String> list = new ArrayList<String>();

			// Form a list of numbers from 0-9.
			for (int i = 0; i < 10; i++) {
				list.add(String.valueOf(i));
			}

			// Insert a new set of numbers from 0-5.
			for (int i = 0; i < 5; i++) {
				list.add(String.valueOf(i));
			}

			System.out.println("Input list : " + list);
			System.out.println("\nFiltered duplicates : " + processList(list));
		}

		public static Set<String> processList(List<String> listContainingDuplicates) {

			final Set<String> resultSet = new HashSet<String>();
			final Set<String> tempSet = new HashSet<String>();

			for (String yourInt : listContainingDuplicates) {
				System.out.println("resultSet is " +resultSet);
				if (!tempSet.add(yourInt)) {
					
					resultSet.add(yourInt);
				}
			}
			return resultSet;
		}
		
		public static void sortStrings(String[] inputList2, Comparator<String> caseInsensitiveOrder) {

			

				String[] inputList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
						"aug", "Sep", "Oct", "nov", "Dec" };

				// Display input un-sorted list.
				System.out.println("-------Input List-------");
				showList(inputList);

				// Call to sort the input list.
				ArraysPractice.sortStrings(inputList, null);

				// Display the sorted list.
				System.out.println("\n-------Sorted List-------");
				showList(inputList);
				

				// Call to sort the input list in case-sensitive order.
				System.out.println("\n-------Sorted list (Case-Sensitive)-------");
				ArraysPractice.sortStrings(inputList, String.CASE_INSENSITIVE_ORDER);

				// Display the sorted list.
				showList(inputList);
			}
		public static void showList(String[] array) {
			for (String str : array) {
				System.out.print(str + " ");
			}
			System.out.println();
		}
	}
	

