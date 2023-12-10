package com.mhn.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TerminlAndNonTerminalPOC {

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<>();

		emp.add(new Employee(1, "mohan"));
		emp.add(new Employee(2, "manas"));
		emp.add(new Employee(3, "om"));
		emp.add(new Employee(4, "anand"));
		emp.add(new Employee(5, "golu"));
		emp.add(new Employee(6, "deepak"));
		emp.add(new Employee(7, "prem"));
		emp.add(new Employee(8, "tejas"));
		emp.add(new Employee(8, "pankaj"));

		
		// if we itermediate operator are lazy loaded
		
		emp.stream().filter(e -> e.getId() >= 5).map(empl -> {
			empl.printName();
			return empl.getName();
		}).collect(Collectors.toList()).stream().filter(name -> name.length() > 4).map(name -> {
			System.out.println(name);
			return name;
		}).count();
	}

}
