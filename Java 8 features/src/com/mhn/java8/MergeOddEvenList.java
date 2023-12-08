package com.mhn.java8;

import java.util.ArrayList;
import java.util.List;

public class MergeOddEvenList {

	public static void main(String[] args) {
		List<Integer> evenList = new ArrayList<Integer>();
		List<Integer> oddList = new ArrayList<Integer>();

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0)
				evenList.add(i);
			else
				oddList.add(i);
		}

		
		
		List< Integer> mergedList = new  ArrayList<Integer>();
		
		
		Thread oddThread = new Thread(()->mergedLists(oddList, mergedList),"OddThread");
		Thread evenThread = new Thread(()->mergedLists(evenList, mergedList),"EvenThread");
		
		oddThread.start();
		evenThread.start();
		
        try {
            // Wait for both threads to finish
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		
		  System.out.println("Merged List: " + mergedList);
		
	}

	private static synchronized void mergedLists(List<Integer> sourceList, List<Integer> mergeList) {
		 while (!sourceList.isEmpty()) {
	            Integer value = sourceList.remove(0); 
	            System.out.println(Thread.currentThread().getName() + " adds: " + value);
	            mergeList.add(value); 
	        }	
	}
	
	
	

}
