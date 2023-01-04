package com.learnDSA.leetcode;

import java.util.List;
import java.util.Objects;

public class Leetcode1773 {

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0, sIndex;
        switch (ruleKey) {
            case "type"->sIndex=0;
            case "color"->sIndex=1;
            default -> sIndex = 2;
        }
        for(List<String> item : items){
            if(Objects.equals(item.get(sIndex), ruleValue)){
                count++;
            }
        }
        return count;
    }
}
