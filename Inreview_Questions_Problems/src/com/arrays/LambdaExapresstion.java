package com.arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Spliterator;

public class LambdaExapresstion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array size");
		int s = sc.nextInt();
		Integer m[] = new Integer[s];
		System.out.println("Arrays size :" + s + ":Integer elements");
		/*for (Integer k : m) {
			System.out.println(k);
		}*/
		for(int i=0;i<m.length;i++) {
			m[i]=new Integer(sc.nextInt());
		}
		Spliterator<Integer> sp = Arrays.spliterator(m);
        System.out.println("LambdaExapresstion.main()");
		sp.forEachRemaining((r) -> {
			System.out.println(r.toString()+"");
		});
	}

}
