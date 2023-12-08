package com.mhn.java8;

 import java.util.function.Function;

public class FunctionPOC {
	public static void main(String[] args) {
		/*
		 * FunctionPOC functionPOC = new FunctionPOC();
		 * System.out.println(functionPOC.square(8));
		 */
// Function uses apply() abstract method with single argument 	 to call and we need to give type of given value and return value

		Function<Integer, Integer> fun = i -> i * i;
		System.out.println(fun.apply(9));
	}

	/*
	 * private int square(int i) { int square = i * i; return square;
	 * 
	 * }
	 */
}
