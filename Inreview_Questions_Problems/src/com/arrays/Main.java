package com.arrays;

import java.util.*;
class Main {
    public static void main(String[] args) {
        String[] items={"Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil"};
     Map<String,Integer> count=new TreeMap<>();
     
     for(String item:items){
         
         count.put(item,count.getOrDefault(item,0)+1);
     }
      for(Map.Entry<String,Integer> entry : count.entrySet()){
          System.out.println(entry.getKey()+" _"+entry.getValue());
      } 
    }
}
