package com.arrays;

import java.util.Arrays;

public class DescendingOrder {
	private static Integer[] reverse(Integer[] arr) {
		Integer[] arr1 = new Integer[arr.length];
		Arrays.sort(arr);
		for (int i = arr.length - 1, j = 0; i >= 0; i--) {
			arr1[j] = arr[i];
			j++;
		}
		return arr1;
	}

	public static void main(String[] args) {
		Integer[] arr1 = new Integer[] { 5, 7, 9, 4, 1, 2, 0, 0, 0 };
		Integer[] reverse = reverse(arr1);
		for (Integer arr : reverse) {
			System.out.print(arr + " ");
		}
	}

}
