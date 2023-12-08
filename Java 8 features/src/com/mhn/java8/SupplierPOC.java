package com.mhn.java8;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierPOC {
	public static void main(String[] args) {

		Supplier<Date> cureetdate = () -> new Date();
		System.out.println(cureetdate.get());
	}
}
