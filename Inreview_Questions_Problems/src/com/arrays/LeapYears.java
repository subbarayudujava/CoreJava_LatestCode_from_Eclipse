package com.arrays;

public class LeapYears {

	public static void main(String[] args) {
		int n=2024;
		if(n%4==0 && (n%100!=0 || n%400==0)) {
			System.out.println("leap years");
		}else {
			System.out.println("not Leapy ear");
		}

	}

}
