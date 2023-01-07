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


    // Optimised Solution


    public boolean findRotationOptimised(int[][] mat, int[][] target) {
        boolean[] ansArr = {true,true,true,true};
        int n = mat.length;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(mat[i][j]!=target[i][j]) ansArr[0]=false;
                if(mat[i][j]!=target[n-j-1][i]) ansArr[1]=false;
                if(mat[i][j]!=target[n-i-1][n-j-1]) ansArr[2]=false;
                if(mat[i][j]!=target[j][n-i-1]) ansArr[3]=false;
            }
        }
        return ansArr[0]||ansArr[1]||ansArr[2]||ansArr[3];
    }
}
