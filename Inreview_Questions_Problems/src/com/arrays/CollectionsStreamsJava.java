package com.arrays;

import java.util.Collections;
import java.util.stream.Collectors;

public class CollectionsStreamsJava {

    public static void main(String[] args) {
        String str = "Subbarayudu";
        String reversed = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
                    Collections.reverse(list);
                    return list.stream();
                }))
                .map(String::valueOf)
                .collect(Collectors.joining());
                
        System.out.println("Original: " + str);
        System.out.println("Processed: " + reversed);
    }
}
