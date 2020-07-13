package com.java;

import java.util.Scanner;

public class Practice {
static	Scanner sc = new Scanner(System.in);
	


	public static void main(String[] args) {
		//prime();
	//	RemoveSpaces();
		//reverseNumber();
		//repeatArray();
		// stringEx();
	
		int a = 8;
		int b = 45;
		int c = a << 3;
		System.out.println(c);
		
	}	public static void repeatArray(){
		int i=0;
		for(;i<10; i++){
		System.out.println(i);
		}

        int arr[] = {4, 2, 4, 5, 2, 3, 1}; 
        int arr_size = arr.length; 
      printRepeating(arr, arr_size); 
    } 
	
	static void printRepeating(int arr[], int size)  
    { 
        int i, j; 
        System.out.println("Repeated Elements are :"); 
        for (i = 0; i < size; i++)  
        { 
            for (j = i + 1; j < size; j++)  
            { 
                if (arr[i] == arr[j])  
                    System.out.print(arr[i] + " "); 
            } 
        } 
    } 
  
static void stringEx(){
	String s1 = "true";
	String s2 = "true";
	 
	//first sop
	System.out.println(s1==s2);
	 
	String s3= new String("true");
	 
	//second sop
	System.out.println(s1==s3);
	 
	String s4= "True";
	 
	//Third sop
	System.out.println(s2==s4);
	 
	}


	
	public static void reverseNumber(){
		int num = 451237;
		int revNum = 0;
		
		while(num!=0){
			revNum = (revNum*10) + (num%10);
			
			num = num/10;
			
		}System.out.println(revNum);
		
		
	}

	public static void findMax(int[] num){
		int maxOne =0;
		int maxTwo = 0;
		
	
		
		for(int i : num){
			if(maxOne < i){
				maxTwo=maxOne;
				maxOne=i;
				
			}else if(maxTwo<i){
				maxTwo = i;
			}
		}
		
		
	}
	
	public static void prime(){
		int num;
		System.out.println("Enter a number:  ");
	//	Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		if(num<=1){
			System.out.println("Number is a prime");
		}
		
			for(int i=2; i<=num/2;){
				if(num%i == 0){
					System.out.println("number is not a prime");
				}else{
					System.out.println("Its a prime");
				}
			break;
			}
		
		
		
	}
	
	public static void RemoveSpaces(){
		
		String str = "I am  an    Engineer";
		String s = str.trim().replaceAll("  +", " ");
		
		System.out.print(s);
		
		
		
	}
	
}
