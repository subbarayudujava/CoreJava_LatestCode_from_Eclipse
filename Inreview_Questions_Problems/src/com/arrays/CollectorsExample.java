package com.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Joining elements into a single string
        String joinedNames = names.stream()
                                  .collect(Collectors.joining(",subbu,ravi "));

        System.out.println(joinedNames);
    }
}

