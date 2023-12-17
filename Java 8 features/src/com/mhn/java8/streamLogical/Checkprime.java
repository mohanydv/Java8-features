package com.mhn.java8.streamLogical;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

public class Checkprime {

	public static void main(String[] args) {

		// System.out.println(isprime(6));
		/*
		 * List<Double> sqrtOfFirst10Prime = new ArrayList<>(); int index = 1; while
		 * (sqrtOfFirst10Prime.size() < 10) { if (isprime(index)) {
		 * sqrtOfFirst10Prime.add(Math.sqrt(index)); } index++;
		 * 
		 * } System.out.println(sqrtOfFirst10Prime);
		 */
	}

	private static boolean isprime(int no) {

		/*
		 * boolean isdivisble =false; for (int j = 2; j < no; j++) { if (no%j==0) {
		 * isdivisble=true; break; } }
		 */
		return no > 1 && IntStream.range(2, no).noneMatch(m -> no % m == 0);
	}

}
