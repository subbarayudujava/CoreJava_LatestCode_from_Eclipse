package com.arrays;

public class DemoMethods {

	public static void main(String[] args) {
		int a = 1, b = 4, c = 17;
		Average av = new Average();
		float calculate = av.calculate(a, b, c);
		System.out.println(calculate);
	}

}

class Average {
	public float calculate(int x, int y, int z) {
		float A = (float) (x + y + z) / 3;
		return A;
	}
}
