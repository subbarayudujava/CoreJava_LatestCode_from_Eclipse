package com.arrays;

public class CharactorUpperCaseLowerCase {

	public static void main(String[] args) {
		String str = "ABC12acFG";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 65 && ch <= 97) {
				sb.append((char) (ch + 32));
			} else if (ch >= 97 && ch <= 122) {
				sb.append((char) (ch - 32));
			} else {
				sb.append(ch);
				// sb.reverse();
				// System.out.println(sb);
			}
		} // for

		System.out.println("outPut:" + sb);

	}// main

}// Class
