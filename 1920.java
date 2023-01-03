package com.learnDSA.leetcode;

import java.util.ArrayList;

public class Leetcode1920 {

    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    // Optimised code - O(1)
    public int[] buildArrayOptimised(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = nums[i] + n*(nums[nums[i]] % n);
        }

        for(int i=0; i<n; i++){
            nums[i] = nums[i]/n;
        }

        return nums;
    }


}
