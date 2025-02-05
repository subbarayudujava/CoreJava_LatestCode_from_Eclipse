package com.nt;

public class Mobile {

	Sim sr = null;

	public Mobile(Sim s) {
		sr = s;
	}

	public static void main(String[] args) {
      
		Mobile mobile =new Mobile(new Jio());
		Mobile mobile1 =new Mobile(new Airtral());
		System.out.println("Jio:"+mobile);
	}

}
