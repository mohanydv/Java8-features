package com.mhn.java8.streamLogical;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NoofOccouranceofWord {

	public static void main(String[] args) {
		String str = "Thank you for submitting your application for the position of Senior Software Engineer. Your application is queued for review and we will contact you shortly.";
List<String> list = Arrays.asList(str.split(" "));
	Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.print
	(collect );
	}

}
