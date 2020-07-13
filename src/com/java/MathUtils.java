//package com.java;

//import java.util.ArrayList;

package com.java;

import java.util.Scanner;

public class MathUtils {

	public static void main(String[] args) {
/*		Scanner sc = new Scanner(System.in);
System.out.println("Enter the value: ");*/
		
		String[] ste = {"yes", "now"};
		
		System.out.println(strLen(ste));

	}

	public static String strLen(String[] strArr) {

		StringBuilder br = new StringBuilder();

		int length = strArr[0].length();

		for (int i = 0; i < length; i++) {
			System.out.println(length);
		
			if (strArr[0].charAt(i) == '1' && strArr[1].charAt(i) == '1') {
				br.append("1");

			} else
				br.append("0");

		}

		return strArr[0];

	}

}


/*public class MathUtils {
  public static void main(String[] args) {
  // Write your code here
  ArrayList<String> al = new ArrayList<String>();
  
  al.add("Red");
  al.add("Pink");
  al.add("Voilet");
  

    System.out.println(al);
  
  
 }
}*/