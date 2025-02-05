package com.nt;

public class ArraysSecondHightNumber {

	public static void main(String[] args) {
		int[] numbers = { 2, 3, 6, 4, 1, 9, 5, 7};
		int hightest = Integer.MIN_VALUE;
		int secoundhightest = Integer.MIN_VALUE;
		int lowest=Integer.MAX_VALUE;
		int secondLowest=Integer.MAX_VALUE;
		int third=Integer.MIN_VALUE;
		int thirdHight=Integer.MIN_VALUE;
		for (int num : numbers) {
			if (num > hightest) {
				secoundhightest = hightest;
				hightest = num;
			} else if (num > secoundhightest && num != hightest) {
				secoundhightest = num;
			}
			if(num<lowest) {
				secondLowest=lowest;
				lowest=num;
			}
			if(num>third) {
				thirdHight=third;
				third=num;
			}
		}
      System.out.println("secound HightestValues:"+secoundhightest);
      System.out.println("secound HightestValues:"+secondLowest);
      System.out.println("secound HightestValues:"+thirdHight);
      
	}// main

}// Class
