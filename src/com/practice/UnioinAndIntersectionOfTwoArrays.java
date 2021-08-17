package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class UnioinAndIntersectionOfTwoArrays {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 2, 4, 4, 5, 6 };
        int arr2[] = { 2, 3, 5, 7 };
        int m = arr1.length;
        int n = arr2.length;
        printUnionAndIntersection(arr1, arr2, m, n);
	}

	private static void printUnionAndIntersection(int[] a, int[] b, int m, int n) {
		
		int i=0,j=0,k=0,l=0;
		ArrayList<Integer>union = new ArrayList<Integer>();
		ArrayList<Integer>intersection = new ArrayList<Integer>();

		while(i<m && j<n) {
			if(a[i]<b[j] ) 
				union.add(a[i++]);
			else if(a[i]>b[j])
				union.add(b[j++]);
			else {
				union.add(a[i]);
				intersection.add(a[i]);
				i++;j++;
			}
			
		}
		while(i<m) {
			union.add(a[i++]);
		}
		while(j<n) {
			union.add(b[j++]);
		}
		display(union);
		display(intersection);
	}
	
	
	
	private static void display(ArrayList<Integer> list) {
		list.forEach(value -> System.out.print(value+" "));
		System.out.println();
	}

	public static int findUnionOfArrayUsingJava8(int a[],int b[]) {
		
		List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
		
		list.addAll(Arrays.stream(b).boxed().collect(Collectors.toList()));
		
		HashSet<Integer> set = new HashSet<Integer>(list);
		
		return set.size();
	}
}
