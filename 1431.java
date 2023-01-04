package com.learnDSA.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans = new ArrayList<>(candies.length);
        int max=candies[0];
        for(int i:candies){
            if (i > max) {
                max = i;
            }
        }
        for (int candy : candies) {
            ans.add(candy + extraCandies >= max);
        }
        return ans;
    }
}
