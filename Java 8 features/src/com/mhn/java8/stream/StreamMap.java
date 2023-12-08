package com.mhn.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamMap {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(21);
		list.add(51);
		list.add(31);
		list.add(11);
		//using map we create new object of existing stream object
		list.stream().map(s -> s * s).forEach(System.out::println);
	}

}
