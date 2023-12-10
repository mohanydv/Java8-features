package com.mhn.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CountDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(21);
		list.add(51);
		list.add(31);
		list.add(11);
		//using map we create new object of existing stream object
		Stream<Integer> filter = list.stream().filter(s -> s >=22);
		System.out.println( filter .count());
		
	}
}
