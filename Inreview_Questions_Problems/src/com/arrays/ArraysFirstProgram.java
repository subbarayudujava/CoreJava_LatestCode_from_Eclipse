package com.arrays;

import java.util.Scanner;

public class ArraysFirstProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array object.....");
		int n = sc.nextInt();
		Integer a[] = new Integer[n];
		System.out.println("Enter the " + n + "Arrays Objects");
		for (int i = 0; i < n; i++) {
			a[i] = new Integer(sc.nextInt());
		}
		System.out.println("Using for loop to get arrays");
		for (int i = 0; i < n; i++) {
			System.out.println(a[i].toString() + " ");
		}
		System.out.println("Using Extend for Loop ");
		for (Integer k : a) {
			System.out.println(k.toString() + "");
		}
	}

}
