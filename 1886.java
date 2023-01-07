package com.learnDSA.leetcode;

public class Leetcode1886 {

    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++){
            if(matEquals(mat, target)){
                return true;
            }
            mat = rotate(mat);
        }
        return false;
    }

    public static boolean matEquals(int[][] a, int[][] b){
        for(int i=0;i<a.length;i++){
            for (int j = 0; j < a.length; j++) {
                if(a[i][j]!=b[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] rotate(int [][] mat){
        int[][] ans = new int[mat.length][mat.length];
        for(int i=0;i<mat.length;i++){
            for (int j = 0; j < mat.length; j++) {
                    ans[j][i] = mat[i][j];
            }
        }
        int start=0,end= mat.length-1;
        while(start<end){
            int[] temp = ans[start];
            ans[start++] = ans[end];
            ans[end--] = temp;
        }
        return ans;
    }
}
