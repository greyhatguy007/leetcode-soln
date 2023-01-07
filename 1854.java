package com.learnDSA.leetcode;

public class Leetcode1854 {

    public int maximumPopulation(int[][] logs) {
        int[] year = new int[2051];
        for(int[] log:logs){
            year[log[0]]++;
            year[log[1]]--;
        }
        int maxNum = year[1950], maxYear = 1950;
        for(int i = 1951; i < year.length; i++){
            year[i] += year[i - 1];

            if(year[i] > maxNum){
                maxNum = year[i];
                maxYear = i;
            }
        }

        return maxYear;
    }
}
