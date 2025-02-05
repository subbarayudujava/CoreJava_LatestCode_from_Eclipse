package com.nt;

public class UpperCase {

	public static void main(String[] args) {
		String str = "SUB123bvBV123";
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char ch1 = str.charAt(i);//convertion
			if (ch1 >= 65 && ch1 <= 91) {
				char ch2 = (char) (ch1 + 32);//addition of the give for each charactor
				sb.append(ch2);
			} else if (ch1 >= 97 && ch1 <= 122) {
				char ch3 = (char) (ch1 - 32);
				sb.append(ch3);
			} else {
				sb.append(ch1);
			}
		}
		System.out.println(sb);
	}

}
