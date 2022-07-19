//Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
//https://leetcode.com/problems/set-matrix-zeroes/
package com.arrays;

public class SetMatrixZero {

	//BruteForce (Condition is only for non negative values of matrix)
  //Change value affected value to -1 so that upcoming 0 should not be marked
	public void setZeroes(int[][] m) {
        int r= m.length;
        int c = m[0].length;
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(m[i][j]==0){
                    swap(m,i,j);
                }
            }
        }
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(m[i][j]==-1){
                    m[i][j]=0;
                }
            }
            
        }
        
    }
    public static void swap(int m[][],int row,int col){
        for(int k=0;k<m[0].length;k++){
            if(m[row][k]!=0){
                m[row][k]=-1;
            }
        }
        for(int k=0;k<m.length;k++){
            if(m[k][col]!=0){
                m[k][col]=-1; 
            }
        }
    }
    
    public static void display(int m[][]) {
    	for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
	
    public static void setZeroes(int[][] m) {
    
        int rlen = m.length;
        int clen = m[0].length;
        //Take two dummy array
        int r[] = new int[rlen];
        int c[] = new int[clen];
        //Fill dummy array with -1
        Arrays.fill(r,-1);
        Arrays.fill(c,-1);
       
        //if perticular cell is zero then change the row and col dummy array to zero for that row and col index respectively.
        for(int i=0;i<rlen;i++){
            for(int j=0;j<clen;j++){
                if(m[i][j]==0){
                    r[i]=0;
                    c[j]=0;
                }
            }
        }
        
        for(int i=0;i<rlen;i++){
            for(int j=0;j<clen;j++){
                if(r[i] ==0 || c[j]==0){
                    m[i][j]=0;
                }
            }
        }
        
    }
	
	
	
}
