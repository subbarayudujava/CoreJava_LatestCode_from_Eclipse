package com.arrays;

public class Breack {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				System.out.println("tha beack statement is :" + i);
				break;//Break the statement when i=3
			}
			System.out.println(i);
		}
	}

}
