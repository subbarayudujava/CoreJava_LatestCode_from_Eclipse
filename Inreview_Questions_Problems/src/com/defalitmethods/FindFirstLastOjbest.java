package com.defalitmethods;

import java.util.ArrayList;
import java.util.List;

public class FindFirstLastOjbest {

	public static void main(String[] args) {
		/*Class<?> ojb=ReflectionAPIByUsingGetName.class;
		System.out.println(ojb.getName());*/

		List<String> str = new ArrayList<String>();
		str.add("Corejava spring");
		str.add("oracleg");
		str.add("htlmg");
		/*boolean anyMatch = str.stream().allMatch((x) -> {
			return x.endsWith("g");
		
		});
		System.out.println(anyMatch); */  
		Boolean present = str.stream().findAny().isPresent();
		while (present.TRUE) {
			
			System.out.println(present);
		}
		
	}

}
