package com.arrays;

public class LambdaExpression {
	public static void main(String[] args) {
		// Using an Anonymous Class to Implement Car Interface
		Car c = new Car() {
			@Override
			public int getSpeed(){
				System.out.println("This is an Audi:" );
				return 50;
			}
		};

		// Calling the drive method
		System.out.println(c.getSpeed());

		// using Lambda Exapretion in java 8 verion
		Car c1 = () ->80;
		System.out.println(c1.getSpeed());
		
	}
}

@FunctionalInterface
interface Car {
	public int getSpeed();
}
