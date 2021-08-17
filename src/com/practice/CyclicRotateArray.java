package com.practice;

public class CyclicRotateArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		rotateLeft(a);
		display(a);
		rotateRight(a);
		display(a);
	}

	private static void rotateRight(int[] a) {
		
		int len = a.length;
		if(len==0)
			return;
		int temp = a[len-1];
		for(int i=len-1;i>0;i--) {
			a[i] = a[i-1];
		}
		a[0]=temp;
	}
	
	private static void rotateLeft(int a[]) {
		int len = a.length;
		if(len==0)
			return;
		int temp = a[0];
		for(int i=0;i<len-1;i++) {
			a[i] = a[i+1];
		}
		a[len-1]=temp;
	}
	
	private static void display(int[] a) {
		for(int i:a)
			System.out.print(i+" ");
		System.out.println();
	}
}
