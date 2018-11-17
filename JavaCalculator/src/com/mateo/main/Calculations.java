package com.mateo.main;

public class Calculations {

	enum Operation {
		ADD, SUBTRACT, MULTIPLY, DIVIDE, SQUARE,
	}	

	public static int calculate(Operation op, int A, int B) {
		switch (op) {
		case ADD:
			return add(A, B);
		case SUBTRACT:
			return subtract(A, B);
		case MULTIPLY:
			return multiply(A, B);
		case DIVIDE: 
			return divide(A, B);
		case SQUARE:
			return square(A,B);
		}
		
		throw new RuntimeException("Unsupported exception");

	}


		private static int add(int a, int b) {
			// TODO Auto-generated method stub
			return a + b;
		}

		private static int multiply(int a, int b) {
			// TODO Auto-generated method stub
			return a * b;
		}

		private static int subtract(int a, int b) {
			// TODO Auto-generated method stub
			return a - b;
		}

		private static int divide(int a, int b) {
			// TODO Auto-generated method stub
			return a / b;

		}
		private static int square(int a, int b) {
			// TODO Auto-generated method stub
			return (a*a);
		}

}
