package com.practice;

public class SortArrayOfZeroOneTwo {

	public static void main(String args[]) {

		int numbers[] = { 0, 2, 2, 1, 1, 2, 0, 1, 0 };
		display(numbers);
		sortArray(numbers);
		display(numbers);

	}

	public static void sortArray(int nums[]) {
		int low = 0;
		int high = nums.length - 1;
		int mid = 0;
		int temp;
		while (mid <= high) {
			switch (nums[mid]) {
			case 0: {
				temp = nums[mid];
				nums[mid] = nums[low];
				nums[low] = temp;
				low++;
				mid++;
				break;
			}
			case 1: {
				mid++;
				break;
			}
			case 2: {
				temp = nums[mid];
				nums[mid] = nums[high];
				nums[high] = temp;
				high--;
				break;
			}

			}
		}
	}

	public static void display(int nums[]) {
		for (int n : nums)
			System.out.print(n + " ");
		System.out.println();
	}
}
