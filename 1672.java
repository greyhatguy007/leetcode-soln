package com.learnDSA.leetcode;

// https://leetcode.com/problems/richest-customer-wealth/

public class Leetcode1672 {

    public int maximumWealth(int[][] accounts) {
        int max=0, temp;
        for(int[] row : accounts){
            temp=0;
            for(int i : row){
                temp = temp + i;
            }
            if(temp>max){
                max = temp;
            }
        }
        return max;
    }

}
