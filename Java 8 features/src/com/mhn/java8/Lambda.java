package com.mhn.java8;

import java.util.function.BiConsumer;

public class Lambda {

	public static void main(String[] args) {
//	 before java 8 what we do
//		Lambda lambda = new Lambda();
//		lambda.add(12, 23);

	BiConsumer<Integer, Integer> biConsumer =(a,b)-> 	System.out.println(a+b);
	biConsumer.accept(12,23);
	}

	
	
	//implementation of add method
	/*
	 * private void add(int i, int j) { System.out.println(i + j); }
	 */
}
