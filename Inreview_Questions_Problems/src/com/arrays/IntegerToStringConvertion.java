package com.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class IntegerToStringConvertion {
	
	public static void main(String[] args) {
		/*double num = 500.00;
		String strNum = String.valueOf(num);
		System.out.println("String Representation: " + strNum);*/
		
		//Sort method
		
		/*int[] arr= {2,4,1,5,3,7,6};
		Arrays.sort(arr);
		System.out.println("Order of the numbers::"+Arrays.toString(arr));
		*/ 
		
		//list max and min numbers findout 
		
		/*List<Integer> list=Arrays.asList(10,30,20,50,60);
		
		System.out.println("maximum::"+Collections.max(list));
		System.out.println("minimum::"+Collections.min(list));*/
		
		//Find length of String 
		
		String str="Subbu";
		int len=str.length();
		System.out.println("lenth"+len);
		Optional<String> le=str.describeConstable();
		System.out.println("count"+le);
		}

}
