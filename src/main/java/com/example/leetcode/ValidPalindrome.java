package com.example.leetcode;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String cleanString = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String reversedString = new StringBuffer(cleanString).reverse().toString();
        return cleanString.equals(reversedString);
    }

    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        System.out.println(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));

    }
}
