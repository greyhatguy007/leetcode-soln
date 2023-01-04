package com.learnDSA.leetcode;

public class Leetcode1572 {
    public int diagonalSum(int[][] mat) {
        int ans = 0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(i==j || i+j==mat.length-1){
                    ans+=mat[i][j];
                }
            }
        }
        return ans;
    }
}
