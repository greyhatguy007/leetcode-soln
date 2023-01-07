package com.learnDSA.leetcode;

import java.util.ArrayList;

public class Leetcode566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c!=mat.length*mat[0].length){
            return mat;
        }
        int[][] ans = new int[r][c];
        ArrayList<Integer> temp = new ArrayList<>();
        for(int[] row:mat){
            for(int ele:row){
                temp.add(ele);
            }
        }
        int t =0;
        for(int i=0;i<r;i++){
            for (int j = 0; j < c; j++) {
                ans[i][j] = temp.get(t++);
            }
        }

        return ans;
    }

    // Optimised Solution

    public int[][] matrixReshapeOptimised(int[][] nums, int r, int c) {
        int n = nums.length, m = nums[0].length;
        if (r*c != n*m) return nums;
        int[][] res = new int[r][c];
        for (int i=0;i<r*c;i++)
            res[i/c][i%c] = nums[i/m][i%m];
        return res;
    }

}
