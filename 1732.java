package com.learnDSA.leetcode;
import java.util.ArrayList;
public class Leetcode1732 {
    public int largestAltitude(int[] gain) {
        int ans = 0, temp=0;
        for(int i : gain){
            temp += i;
            if(ans < temp ){
                ans = temp;
            }
        }
        return ans;
    }

}
