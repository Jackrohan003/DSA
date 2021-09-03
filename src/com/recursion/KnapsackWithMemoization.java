package com.recursion;

import java.util.Arrays;

public class KnapsackWithMemoization {

	public static void main(String[] args) {

        int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = val.length;
        int t[][] = new int[n+1][W+1];
        
        for(int row[]:t)
        	Arrays.fill(row, -1); // Fill up the twoD array by -1 
       
        System.out.println(knapSack(W, wt, val, n,t));
        displayTwoD(t);
	}
	
	private static void displayTwoD(int t[][]) {
		for(int row[]: t) {
			for(int col:row) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

	private static int knapSack(int w, int[] wt, int[] val, int n, int[][] t) {
		
		if(n==0 || w==0)
			return 0;
		if(t[n][w]!=-1) {
			return t[n][w];
		}
		
		if(wt[n-1]<=w) {
			return t[n][w] = Math.max(val[n-1] + knapSack(w-wt[n-1], wt, val, n-1,t),
					knapSack(w, wt, val, n-1,t));
		}
		else {
			return t[n][w] = knapSack(w, wt, val, n-1,t);
		}
		
	}
}
