package com.learnDSA.leetcode;

public class Leetcode1512 {
    public int numIdenticalPairs(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j] && i<j){
                    ans++;
                }
            }
        }
        return ans;
    }

    // optimised Code
    public int numIdenticalPairsOptimised(int[] nums) {
        int ans = 0;
        int[] count = new int[101];
        for (int a: nums) {
            ans += count[a]++;
        }
        return ans;
    }


}
