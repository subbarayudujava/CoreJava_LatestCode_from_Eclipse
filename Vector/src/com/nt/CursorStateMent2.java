package com.nt;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class CursorStateMent2 {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<Integer>();
		for (int i = 0; i <= 5; i++) {
			vector.add(new Integer(i));
		}
		ListIterator<Integer> list = vector.listIterator();
		System.out.println("===forword direction===");
		while (list.hasNext()) {
			System.out.println(list.next());
		}
		System.out.println("===backword Direction===");
		while (list.hasPrevious()) {
			System.out.println(list.previous());
		}
		System.out.println("==by using enumeration ===");
		Enumeration<Integer> enumeration = vector.elements();
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}// main

}// class
