package com.example.leetcode;

import java.util.HashMap;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String input = "eendava";
        System.out.println("First non-repeating character: " + findFirstUniqueChar(input));
    }

    public static char findFirstUniqueChar(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Counting character occurrences
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Finding the first unique character
        for (int i = 0; i < str.length(); i++) {
            if (charCount.get(str.charAt(i)) == 1) {
                return str.charAt(i);
            }
        }
        return '\0';
    }
}