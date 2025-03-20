package com.defalitmethods;

public interface Test {
   public void  m1() ;
 //  public void m2();
   default void m2() {
	   System.out.println("Test.m2()");
   }
}
