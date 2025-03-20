package com.arrays;

import java.util.Date;

public class GaebageCollector {

	public static void main(String[] args) {
         Runtime r=Runtime.getRuntime();
         System.out.println("total hap memory size:"+r.totalMemory());
         System.out.println("total freeme	mory:"+r.freeMemory());
         for(int i=0;i<10000;i++) {
        	 Date d=new Date();
        	 d=null;		
         }
         System.out.println(r.freeMemory()); 
         r.gc();
         System.out.println(r.freeMemory()); 
	}

}
