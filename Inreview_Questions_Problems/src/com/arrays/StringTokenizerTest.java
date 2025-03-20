package com.arrays;

import java.util.*;

public class StringTokenizerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ...");
		String str = sc.nextLine();
		System.out.println("Entr the delimer into the pecess");
        String dr=sc.nextLine();
        StringTokenizer ob=new StringTokenizer(str,dr);
        System.out.println("Count of Tokens:"+ob.countTokens());
        System.out.println("----------Display the Tokens-------");
        while (ob.hasMoreTokens()) {
        	String s=ob.nextToken();
        	System.out.println("content:"+s.toString());
        	System.out.println("count of Tokens:"+ob.countTokens());
        }
	}

}
