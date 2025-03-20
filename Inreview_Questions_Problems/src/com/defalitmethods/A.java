package com.defalitmethods;

public class A implements Test {
	@Override
	public void m1() {
		System.out.println("This is abstract method in java");
	}

	public static void main(String[] args) {
		A a = new A();
		a.m1();
        a.m2();
	}

}
