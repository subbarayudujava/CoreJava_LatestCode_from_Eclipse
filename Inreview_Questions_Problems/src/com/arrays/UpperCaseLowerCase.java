package com.arrays;

public class UpperCaseLowerCase {

	public static void main(String[] args) {
		String str = "subbu,subbu";
		int mid = str.length() / 2;
		String lowercase = "";
		String uppercase = "";

		for (int i = 0; i < str.length(); i++) {
			if (i < mid) {
				lowercase = lowercase + Character.toLowerCase(str.charAt(i));
				uppercase = uppercase + Character.toUpperCase(str.charAt(i));
			}
		}
		System.out.print("lowerCase:" + lowercase);
		System.out.print("upperCase:" + uppercase);
	}

}
