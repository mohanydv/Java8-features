package com.mhn.java8.streamLogical;

import java.util.Arrays;

public class Multiplyclass {

	public static void main(String[] args) {

		FindMax max = list -> list.stream().sorted((o1, o2) -> o2 - o1).limit(1).forEach(System.out::print);
		max.maximum(Arrays.asList(5, 4, 2, 5, 6, 8, 554, 76, 8, 543, 5, 34));

	}

}
