package com.example.leetcode;

public class LongestPalindromicSubstring {
    int count = 0;

    public int longestPalindrome(String s) {

        char[] stringArray = s.toCharArray();
        int n = stringArray.length;
        if (s.length() == 0) {
            return 0;
        }
        for (int i = 0; i < n; i++) {
        expandPalindrome(stringArray,i,i);
        expandPalindrome(stringArray,i,i+1);
        }
        return count;
    }

    public void expandPalindrome(char[] input, int j, int k) {
        while (j >= 0 && k < input.length && input[j] == input[k]) {
            count++;
            j--;
            k++;
        }

        }

    public static void main(String[] args) {
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        String string = "aabaa";
        System.out.println(longestPalindromicSubstring.longestPalindrome(string));
    }
    }


