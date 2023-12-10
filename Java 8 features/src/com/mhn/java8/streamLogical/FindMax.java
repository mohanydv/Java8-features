package com.mhn.java8.streamLogical;

import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
public interface FindMax {

	void maximum(List<Integer> max);

	// default method for finding third maximum element 
	default List<Integer> thirdMax(List<Integer> list) {
		return list.stream().distinct().sorted((o1, o2) -> o2 - o1).skip(2).limit(1).collect(Collectors.toList());
	}
}
