package com.mhn.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StarPattern {

	public static void main(String[] args) {

		
		
	String str = "mohanyadav";
	 
	List<char[]> charr = Arrays.asList(str.toCharArray());
	    Map<char[], Long> collect = charr.stream().collect( Collectors.groupingBy(Function.identity(), Collectors.counting()));
	   
			System.out.println(collect);
	
			
			char[] chaar = str.toCharArray();
			
		//	Map<Character, Integer> result = new HashMap<>();
	for (int i = 0; i < chaar.length; i++) {
		
		
		for(int j=i; j<=chaar.length;j++) {
			int count = 1;
			if (chaar[i]==chaar[j]) {
				count++;
			
			}else {
				
			//	System.out.println("char="+chaar[i] +  " occurance =" +count);
			}
			System.out.println("char="+chaar[j] +  " occurance =" +count);
		}	}
	}
	
	}
		
	
	
	
	


