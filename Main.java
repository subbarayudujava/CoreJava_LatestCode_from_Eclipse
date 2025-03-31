package com.nt.Interface;

public class Main  implements A,B{

	@Override
	public void m1() {
		System.out.println("Override The methods");
		A.super.m1();
		B.super.m1();
	}
	public static void main(String[] args) {
		Main m=new Main();
		m.m1();
	}

}
