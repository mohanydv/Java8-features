package com.mhn.java8.stream;

public class Employee {
private Integer id;
private String name;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + "]";
}
public Employee() {
	super();
}
public Employee(Integer id, String name) {
	super();
	this.id = id;
	this.name = name;
}


public void printName() {
System.out.println("In Emp class " +name);	
} }