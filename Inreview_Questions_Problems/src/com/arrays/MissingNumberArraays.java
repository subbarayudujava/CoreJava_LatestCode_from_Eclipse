package com.arrays;

public class MissingNumberArraays {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 5, 6, 7, 8,9, 10 };
		int sum = (10 * 11) / 2;
		System.out.println(sum);
		int actualsum = 0;

		for (int i = 0; i < arr.length; i++) {
			actualsum = actualsum + arr[i];
		}
		System.out.println("missing number:"+(sum-actualsum));
	}

}
