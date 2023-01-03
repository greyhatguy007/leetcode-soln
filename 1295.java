package com.learnDSA.leetcode;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class Leetcode1295 {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i:nums){
            if(even(i)){
                count++;
            }
        }
        return count;
    }

    public boolean even(int i){
        return String.valueOf(i).length() % 2 == 0;
    }
}
