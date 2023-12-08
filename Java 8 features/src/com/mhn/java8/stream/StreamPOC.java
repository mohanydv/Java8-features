package com.mhn.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPOC {

	public static void main(String[] args) {
		
		List<Integer> arrList = new ArrayList<>();
		arrList.add(23);
		arrList.add(3);
		arrList.add(53);
		arrList.add(73);
		arrList.add(13);

		//using stream
		arrList = arrList.stream().filter(s->s>=19).collect(Collectors.toList());
		
		arrList.stream().forEach(System.out:: println);
		
		
		/* befoare Stream
		 * List<Integer> elemnt = findElemnt(arrList); for (Integer integer : elemnt) {
		 * System.out.println(integer); }
		 */
	}
//before stream
	/*
	 * private static List<Integer> findElemnt(List<Integer> arrList) {
	 * List<Integer> arrList1 = new ArrayList<>(); for (Integer integer : arrList) {
	 * if (integer >= 19) arrList1.add(integer); } return arrList1;
	 * 
	 * }
	 */
}
