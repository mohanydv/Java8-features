package com.mhn.java8;

import java.util.function.Predicate;

public class PrdicateJoining {

	public static void main(String[] args) {

		Predicate<String> checklength = s->s.length()>=5;
		Predicate <String> checkEven = s->s.length()%2==0;
		
		
		System.out.println("and joining "+ checklength.and(checkEven).test("mohan"));
		System.out.println("or joining "+ checklength.or(checkEven).test("mohan"));
		
		//negate  have only 1  predicate
		System.out.println("and joining "+ checkEven.negate().test("mohan"));
		
		
		
	}

}
