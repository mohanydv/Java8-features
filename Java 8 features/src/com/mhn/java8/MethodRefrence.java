package com.mhn.java8;

public class MethodRefrence {

	public static void main(String[] args) {

//if there no exiting method then use lambda expression other than use method reference for code reusability 		
		/*
		 * FuctionalInterfacePOc interface1 =()->
		 * System.out.println("this is lambda implemation of FuctionalInterfacePOc");
		 * interface1.AbstactMethdod();
		 */

		// we can reuse the method if it already present it helps in code REUSABILITY

		FuctionalInterfacePOc fuctionalInterfacePOc = Test::testdemo;
		fuctionalInterfacePOc.AbstactMethdod();

	}

}

class Test {

	public static void testdemo() {
		System.out.println("This is method reference of test class");

	}
}