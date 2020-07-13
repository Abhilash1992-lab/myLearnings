package com.java;

public class InvertNumber {

	public long doInvert(long number) {

		long invert = 0;
		while (number != 0) {
			invert = (invert * 10) + (number % 10);
			// System.out.println("Invert" +invert);
			number = number / 10;
		}
		return invert;
	}

	public static void main(String args[]) {

		long lnum = 654321;
		InvertNumber input = new InvertNumber();

		System.out.println("Input value : " + lnum);
		System.out.println("Inverted value : " + input.doInvert(lnum));

		String inputName = " And Yes    may    be          Yes             You        Are";

		String output = inputName.trim().replaceAll("  +", " ");
		System.out.println(output);
	}
}
