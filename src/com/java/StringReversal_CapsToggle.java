package com.java;

public class StringReversal_CapsToggle {

	public static void main(String[] args) {
		 toggleString("MyNamEISABhilaSH");
		//reverse_toggleString();
	}

	public static void reverse_toggleString() {
		char c = 0;
		String sentence = "MyNameIsAbHIlaSH";

		String rev = "";
System.out.println("Given sentence is:  " +sentence);
		for (int i = 0; i < sentence.length(); i++) {
			c = sentence.charAt(i);
			if (Character.isUpperCase(c)) {
				c = Character.toLowerCase(c); 
			} else if (Character.isLowerCase(c)) {
				c = Character.toUpperCase(c);
			}
		//	rev = c + rev;   //in order to get toggle case and with reversed string 
		  rev = rev + c;   //in order to get only toggle case 
		}

		System.out.println(rev);

	}

	public static String toggleString(String sentence) {
		StringBuilder toggled = new StringBuilder(sentence.length());

		// System.out.println( +sentence.length());
		// System.out.println("Statement after changing to charArray " +
		// sentence.toCharArray());
		for (char letter : sentence.toCharArray()) {
			if (Character.isUpperCase(letter)) {
				letter = Character.toLowerCase(letter);
			} else if (Character.isLowerCase(letter)) {
				letter = Character.toUpperCase(letter);
			}

			toggled.append(letter);
		//	System.out.println("Toggled" + toggled);

		}
		System.out.println(toggled);
		return toggled.toString();

	}

}

