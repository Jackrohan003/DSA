package com.practice;

public class MoveNegativeNumbersToLeft {

	public static void main(String[] args) {
		
		int a[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6,-6,-3};
		
		System.out.println("Before Moving ");
		display(a);
		System.out.println("After Moving ");
		moveNegativeNumbersWithOrder(a);
		display(a);
		System.out.println("After Moving ");
		moveNegativeNumbers(a);
		display(a);
		
	}
	public static void moveNegativeNumbersWithOrder(int a[]) {
		
		int j=0;
		int temp;
		for(int i=0;i<a.length;i++) {
			
			if(a[i]<0) {
				if(i!=j) {
					temp = a[i];
					a[i] = a[j];
					a[j]=temp;
				}
				j++;
			}
		}
	}
	
	public static void moveNegativeNumbers(int a[]) {
		int left=0;
		int right=a.length-1;
		
		while(left<right) {
			if(a[left] > 0 && a[right]<0 ) {
				int temp = a[right];
				a[right] = a[left];
				a[left] = temp;
				left++;
				right--;
			}
			if(a[left]<0)
				left++;
			if(a[right]>0)
				right--;
		}
	}
	public static void display(int a[]) {
		for(int i:a) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
