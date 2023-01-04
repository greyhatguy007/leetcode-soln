package com.learnDSA.leetcode;

import java.util.ArrayList;

public class Leetcode1832 {
    public boolean checkIfPangram(String sentence) {
        ArrayList<Character> check = new ArrayList<>();
        for (char c : sentence.toCharArray()) {
            if (!check.contains(c)) {
                check.add(c);
            }
        }
        return check.size() == 26;
    }

    // optimised solution

    public boolean checkIfPangramOptimised(String sentence) {
        // We iterate over 'sentence' for 26 times, one for each letter 'currChar'.
        for (int i = 0; i < 26; ++i) {
            char currChar = (char) ('a' + i);
            // If 'sentence' doesn't contain currChar, it is not a pangram.
            if (sentence.indexOf(currChar) == -1)
                return false;
        }
        // If we manage to find all 26 letters, it is a pangram.
        return true;
    }

}
