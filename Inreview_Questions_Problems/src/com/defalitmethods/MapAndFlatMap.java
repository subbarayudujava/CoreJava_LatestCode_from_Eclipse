package com.defalitmethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapAndFlatMap {

	public static void main(String[] args) {
		// By using map
		List<Integer> list = Arrays.asList(1, 2, 4, 7, 9, 8, 7);
		list.stream().map(n -> n + 10).distinct().forEach(System.out::println);

		
		// by using flatMap
		System.out.println("By using flatMaping in java");
		List<Integer> list1 = Arrays.asList(1, 2);
		List<Integer> list2 = Arrays.asList(3, 4);
		List<Integer> list3 = Arrays.asList(5, 6);
		List<Integer> list4 = Arrays.asList(7, 8);
		List<List<Integer>> allList=Arrays.asList(list1,list2,list3,list4);
		allList.stream().flatMap(x->x.stream()).forEach(System.out::println);
	}

}
