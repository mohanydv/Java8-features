package com.mhn.java8;

import java.util.function.Function;

public class FunctionChaining {

	public static void main(String[] args) {
		
		Function <Integer , Integer> square =s->s*s;
		
		Function <Integer , Integer> qube =y->3*y;
		
		
		/*
		 * there are two ways we can chain  function andThen and Compose
		 * if we use  fun1 andThen(fun2).apply(I/P); then : = first  fun1 and the fun2 will execute
		 * if we use  fun1 compose (fun2).apply(I/P); then : = first fun2 and the fun1 will execute
		 */	
		
		System.out.println(	square.andThen(qube).apply(2));
		
		System.out.println(	square.compose(qube).apply(2));
				
			
		

	}

}
