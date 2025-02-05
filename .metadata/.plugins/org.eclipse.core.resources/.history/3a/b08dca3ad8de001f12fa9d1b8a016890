package com.arrays;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

 public class CharaCtorRepeted {
   public static void main(String[] args) {
       
       String input="Programing in java amazing";
       
     Map< Character,Long> charcount=input.chars()
                  .filter(c-> c  !=' ')
                  .mapToObj(c -> (char) c)
                  .collect(Collectors.groupingBy(Function.
                  identity(),Collectors.counting()));
                  
            charcount.entrySet().stream()
                  .filter(entry -> entry.getValue()>2)
                  .forEach(entry-> System.out.println
                  (entry.getKey()+"->"+entry.getValue()));
   }
}