package com.defalitmethods;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class RemoveDuplicatesWithIndex {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 2, 2, 6);
        
        AtomicInteger index = new AtomicInteger(1);
        
        List<String> orderedNumbers = numbers.stream()
                                             .distinct()
                                             .map(num -> index.getAndIncrement()+"")
                                             .collect(Collectors.toList());

        orderedNumbers.forEach(System.out::println);
    }
}
