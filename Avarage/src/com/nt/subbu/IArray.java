package com.nt.subbu;

import java.util.Scanner;

public class IArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of  Array");
		int size = sc.nextInt();
		Integer a[] = new Integer[size];
		System.out.println("Enter the :" + size + "values");
		for (int i = 0; i < size; i++) {
			a[i] = new Integer(sc.nextInt());
		}
		System.out.println("print the values");
		for (Integer k : a) {
			System.out.print(k + " ");
		}
	}
}
