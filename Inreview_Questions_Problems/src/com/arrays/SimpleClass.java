package com.arrays;

public class SimpleClass {
	
	public void methodA() {
		methodB(10);
	}
    public void methodB(int x) {
    	System.out.println("tha values of :"+x);
    }
	public static void main(String[] args) {
   SimpleClass sc=new SimpleClass();
   sc.methodA();
   //sc.methodB(11);
	}

}
