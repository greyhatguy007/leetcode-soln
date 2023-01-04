package com.learnDSA.leetcode;

import java.util.Arrays;

public class Leetcode832 {

    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] row:image){
            reverse(row);
        }
        int [][] ans = new int[image[0].length][];
        for(int i=0;i<ans.length;i++){
            ans[i] = invert(image[i]);
        }
        return ans;
    }

    public void reverse(int[] arr){
        int start=0,temp,end=arr.length-1;
        while(start<end){
            temp = arr[start];
            arr[start++] = arr[end];
            arr[end--]=temp;
        }
    }

    public int[] invert(int[] row){
        int[] ans = new int[row.length];
        for(int i=0;i<row.length;i++){
            if(row[i]==0){
                ans[i]=1;
            } else ans[i]=0;
        }
        return ans;
    }
}
