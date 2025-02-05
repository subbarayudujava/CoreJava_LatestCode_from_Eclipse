package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class ExampleApp {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(Arrays.asList("Subbu", "ravi", "mohan"));
		// for loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println("names:" + list.hashCode());
		}
		// for each loop
		for (String lis : list) {
			System.out.println(lis);
		}
     //for Each method
		list.forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		});
		System.out.println("order of :");
		Collections.sort(list,(e1,e2)->e1.compareTo(e2));	//ORDER OF NAMES
		//for each loop with lambda expressionss
		list.forEach(s->System.out.println(s));
	}
}
