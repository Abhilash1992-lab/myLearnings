
package com.java;

import java.util.Scanner;

public class ReverseNumbers {

	public static void main(String[] args) {
		revNumber();
	}


	public static void revNumber() {
		int number, revNumber = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to reverse :");
		number = sc.nextInt();
		while(number!=0)
		{
			revNumber = (revNumber*10)+ (number%10);
			number = number/10;
		
		
		}	System.out.println(revNumber);
		
		sc.close();
		
		

			}

}

