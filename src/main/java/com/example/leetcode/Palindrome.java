package com.example.leetcode;

public class Palindrome {

    public boolean isPalindrome(int x){
        StringBuilder string  = new StringBuilder(String.valueOf(x));

        return string.toString().equals(string.reverse().toString());
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        int x = 127;
        int y = 121;
        System.out.println(palindrome.isPalindrome(x));
        System.out.println(palindrome.isPalindrome(y));
    }
}
