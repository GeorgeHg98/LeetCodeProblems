package com.example.leetcode;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String firstString = strs[0];
        String lastString = strs[strs.length-1];
        int n1 = firstString.length();
        int n2 = lastString.length();
        int index = 0;
        while(index < n1 && index < n2){
            if(firstString.charAt(index) == lastString.charAt(index)){
                index ++;
            }else break;
        }
        return firstString.substring(0, index);
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strs = new String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix.longestCommonPrefix(strs));

    }
}
