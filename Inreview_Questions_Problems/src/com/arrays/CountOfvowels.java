package com.arrays;

import java.util.Scanner;

public class CountOfvowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ....");
		String str = sc.nextLine();
		int len = str.length();
		int aphabets = 0, count = 0, numbers = 0;

		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);

			switch (ch) {
			case 'a':
				count++;
				break;
			case 'e':
				count++;
				break;

			case 'i':
				count++;
				break;

			case 'o':
				count++;
				break;

			case 'u':
				count++;
				break;
			}
			int p = (int) ch;
			if (p >= 65 && p <= 90) {
				aphabets++;
			}
			if (p >= 96 && p <= 122) {
				aphabets++;
			}
			if (p >= 48 && p <= 57) {
				numbers++;
			} // if close
		} // for close

		System.out.println("Vowels:" + count);
		System.out.println("Aphabets:" + (aphabets - count));
		System.out.println("Numbers:" + numbers);
		System.out.println("others:" + (len - (aphabets + numbers)));
	}// main method

}// class
