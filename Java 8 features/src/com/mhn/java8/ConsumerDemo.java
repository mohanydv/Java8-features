package com.mhn.java8;

import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		
	
	
	Consumer<Integer> square = e-> System.out.println("cosnumer "+e*e);
	square.accept(8);
	}
}
