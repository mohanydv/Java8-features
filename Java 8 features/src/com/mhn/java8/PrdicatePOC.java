package com.mhn.java8;

import java.util.function.Predicate;

public class PrdicatePOC {

	public static void main(String[] args) {
		/*
		 * predefine functional interface having test(T t) method with single argument
		 * and return boolean value
		 */
		Predicate<String> p = s -> s.length() >= 5;
		System.out.println(p.test("mohan"));

		/*
		 * // before predicate PrdicatePOC poc = new PrdicatePOC(); System.out.println(
		 * poc.checklength("mohanydv"));
		 */
	}
	/*
	 * private Boolean checklength(String s) { if (s.length() >= 4) return true;
	 * else return false;
	 * 
	 * }
	 */
}
