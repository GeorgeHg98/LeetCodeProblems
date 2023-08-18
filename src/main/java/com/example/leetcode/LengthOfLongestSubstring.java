package com.example.leetcode;

import java.util.Arrays;



public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] charIndex = new int[128];
        Arrays.fill(charIndex, -1);
        int left = 0;

        for (int right = 0; right < n; right++) {
            if (charIndex[s.charAt(right)] >= left) {
                left = charIndex[s.charAt(right)] + 1;
            }
            charIndex[s.charAt(right)] = right;
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
    int x = 15;
    int y = 25;
    LengthOfLongestSubstring addTwoNumbers = new LengthOfLongestSubstring();
        System.out.println(addTwoNumbers.lengthOfLongestSubstring("apple gigant bananas"));
    }
}

