package com.mhn.java8.streamLogical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapAndFlatMap {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();

		empList.add(new Employee(1, "mohan", Arrays.asList("pune", "mumbai", "delhi")));
		empList.add(new Employee(2, "manas", Arrays.asList("pune", "gurgaon")));
		empList.add(new Employee(3, "rahul", Arrays.asList("noida", "mumbai", "delhi")));
		empList.add(new Employee(4, "jacky", Arrays.asList("pune", "Lucknow", "delhi")));
		empList.add(new Employee(5, "ashish", Arrays.asList("banglore", "delhi")));
		empList.add(new Employee(6, "ranjet", Arrays.asList("Lucknow", "indore", "hyderabad")));

		// to get city
		empList.stream().map(e -> e.getCity()).collect(Collectors.toList()).forEach(System.out::println);

		// to get city in unique

		System.out.println("*******************************************************************8");
		Set<String> set = empList.stream().flatMap(e -> e.getCity().stream()).collect(Collectors.toSet());
		System.out.print(set);
		
	}
}
