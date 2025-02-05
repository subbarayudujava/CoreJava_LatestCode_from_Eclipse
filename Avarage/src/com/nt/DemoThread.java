package com.nt;

public class DemoThread {

	public static void main(String[] args) {
		new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("registation:" + Thread.currentThread().getName());
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}).start();
		new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("login:" + Thread.currentThread().getName());
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}).start();
		new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("to view Details:" + Thread.currentThread().getName());
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}).start();
	}// main

}// calss
