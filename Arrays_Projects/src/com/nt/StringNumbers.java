package com.nt;

import java.util.LinkedList;
import java.util.List;

public class StringNumbers {

	/*private static List<Integer> extract(String str) {
		List<Integer> list = new LinkedList<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int ascii = (int) ch; // convertion in Ascii values
			if (ascii >= 48 && ascii <= 57) {
				char ch1=(char)ascii;
				int inu=ch1-'0';
			list.add(inu);
			}
		} // for
		return list;
	}*/

	public static void main(String[] args) {
       //   String str1="ab1c2d3";//output=abccddd
		String str = "String123";
		StringBuilder numbers = new StringBuilder();
		/*for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int ascii = (int) ch; // convertion in Ascii values
			if (ascii >= 48 && ascii <= 57) {
			numbers.append(ch);
		}//for
		System.out.println(numbers);*/
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			if (ch >= '0' && ch <= '9') {
				numbers.append(ch);
			}//for
			System.out.println(numbers);
		/*List<Integer>	str=StringNumbers.extract("String123");
			System.out.println(str);*/
	}// main
	}
}
// class
