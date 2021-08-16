package com.practice;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class KthSmallesElementInArray {

	public static void main(String[] args) {
		int numbers[] = {2,4,7,3,8};
		int k=8;
		System.out.println(kthSmallest(numbers, k));
		
	}
	public static int kthSmallest(int num[],int k) {
	
		if(k>num.length || k<num.length) {
			return -1;//Assumption -1 is for negative check
		}
		
		PriorityQueue<Integer> maxheap = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int i:num) {
			maxheap.add(i);
			if(maxheap.size()>k) {
				maxheap.remove();
			}
			
		}
		
		return maxheap.peek();
	}
}
