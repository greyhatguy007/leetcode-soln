package com.learnDSA.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode989 {
    public List<Integer> addToArrayForm(int[] num, int k) {

        int carry = 0;
        List<Integer> res = new ArrayList<>();
        int i = num.length - 1;

        while(carry > 0 || k > 0 || i >= 0) {
            int n = i >= 0 ? num[i--]: 0;
            int a = k%10;
            int sum = n + a + carry;
            res.add(sum%10);
            carry = sum/10;
            k = k/10;
        }

        Collections.reverse(res);
        return res;
    }
}
