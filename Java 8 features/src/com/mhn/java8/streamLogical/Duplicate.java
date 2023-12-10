package com.mhn.java8.streamLogical;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicate {
	public static void main(String[] args) {
		
	
		
	//find duplicate elements in a list
	
	List<Integer> list = Arrays.asList(5,2,3,5,6,3,1,6,7,3,9,3,4,4);
		Set<Integer> set = new  HashSet<Integer>();
	
	 list.stream().filter(l->!set.add(l)).collect(Collectors.toSet()).forEach(System.out::println);

	
	}
}

