package com.nt;

import java.util.Scanner;

public class SumOfArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size  of array");
        int size=sc.nextInt();
        Integer a[]=new Integer[size];
        System.out.println("Enter the :"+size+"Values");
        int sum=0;
        for(int i=0;i<size;i++) {
        	a[i]=new Integer(sc.nextInt());
        	sum=sum+a[i];
        }
        System.out.println("sum of value:"+sum);
	}

}
