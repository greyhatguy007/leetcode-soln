package com.learnDSA.leetcode;

import java.util.Arrays;

public class Leetcode1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans=new int[nums.length];
        int c=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[j]<nums[i]){
                    c++;
                }
            }
            ans[i] = c;
            c=0;
        }
        return ans;
    }
}
