package com.defalitmethods;

import java.util.Collections;
import java.util.stream.Collectors;

public class Java8Versio {

	public static void Main(String[] args) {
		String DataOrginal = "SubbaRyaU";

		String reversed = DataOrginal.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.collectingAndThen(
                    Collectors.toList(),
                    list -> {
                        Collections.reverse(list);
                        return list.stream()
                                   .map(String::valueOf)
                                   .collect(Collectors.joining());
                    }
                ));

	}
}