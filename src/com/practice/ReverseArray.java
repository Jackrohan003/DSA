package com.practice;

public class ReverseArray {

	public static void main(String[] args) {
	
		int array[]= {1,2,3,4,5,6};
		System.out.println("Before Reversing array");
		displayArray(array);
		reverseArray(array);
		System.out.println("After Reversing array");
		displayArray(array);
		
	}
	public static void displayArray(int array[]) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
		}
		System.out.println();
	}
	public static void reverseArray(int array[]) {
		int start =0;
		int end = array.length-1;
		int temp;
		while(start<end) {
			temp = array[start];
			array[start]=array[end];
			array[end]= temp;
			start++;
			end--;
		}
	}
	
}
