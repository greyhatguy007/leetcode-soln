package com.learnDSA.leetcode;

public class Leetcode1252 {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] ans = new int[m][n];
        int res=0;

        for(int[] i : indices){
            for(int k=0;k<n;k++){
                ans[i[0]][k]++;
            }
            for(int k=0;k<m;k++){
                ans[k][i[1]]++;
            }
        }

        for(int[] row:ans){
            for(int i:row){
                if(i%2!=0){
                    res++;
                }
            }
        }
        return res;
    }
}
