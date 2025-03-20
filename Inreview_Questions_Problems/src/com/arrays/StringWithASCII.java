package com.arrays;

public class StringWithASCII {

	public static void main(String[] args) {
		int count = 0;
	//	int total = 0;
		System.out.println("UpperCase Alphanets.....");
		for (int i = 65; i < 90; i++) {
         // char ch=(char)i;
          //or
          char[] ch=Character.toChars(i);
         count++;
         // total++;
          System.out.println(ch);
		}
		System.out.println("Count the values:"+count);
		//System.out.println("Count the values:"+total);
	}

}
