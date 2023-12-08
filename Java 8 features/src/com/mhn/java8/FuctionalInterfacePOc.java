package com.mhn.java8;

//this annotation is optional 
@FunctionalInterface
public interface FuctionalInterfacePOc {

	// a functiona intreface can have only one abstract method

	public abstract void AbstactMethdod();

// it can have any no of dafault and static method 

	public default void defaultmethod() {

		System.out.println("this is default method");

	}

	public default void defaultmethod2() {

		System.out.println("this is secound default method");

	}

	public static void staticmethod() {

		System.out.println("this is staic method");

	}

}
