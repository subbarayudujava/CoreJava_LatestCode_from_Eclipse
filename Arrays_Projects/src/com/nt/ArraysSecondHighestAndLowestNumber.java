package com.nt;

public class ArraysSecondHighestAndLowestNumber {
	public static void main(String[] args) {
		int[] numbers = { 2, 3, 6, 4, 1, 9, 5, 7, 8 };

		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		int lowest = Integer.MAX_VALUE;
		int secondLowest = Integer.MAX_VALUE;

		for (int num : numbers) {
			// Update highest and second highest
			if (num > highest) {
				secondHighest = highest;
				highest = num;
			} else if (num > secondHighest && num != highest) {
				secondHighest = num;
			}

			// Update lowest and second lowest
			if (num < lowest) {
				secondLowest = lowest;
				lowest = num;
			} else if (num < secondLowest && num != lowest) {
				secondLowest = num;
			}
		}

		// Check and print results for highest and lowest
		if (secondHighest != Integer.MIN_VALUE) {
			System.out.println("Second Highest Value: " + secondHighest);
		} else {
			System.out.println("There is no second highest value.");
		}

		if (secondLowest != Integer.MAX_VALUE) {
			System.out.println("Second Lowest Value: " + secondLowest);
		} else {
			System.out.println("There is no second lowest value.");
		}
	} // main
} // class ArraysSecondHighestAndLowestNumber
