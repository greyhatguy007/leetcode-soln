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

    // Optimised Solution

    public int diagonalSumOptimised(int[][] mat) {
        int ans = 0;
        for(int i=0;i<mat.length;i++){
            ans += mat[i][i];
            if(i!=mat.length-i-1)ans += mat[i][mat.length-i-1];
        }
        return ans;
    }
}
