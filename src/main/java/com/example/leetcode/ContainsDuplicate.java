package com.example.leetcode;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            if (!hashSet.contains(num)) {
                hashSet.add(num);
            } else return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] duplicateNums = new int[]{1,2,3,1};
        int[] nums = new int[]{1,2,3,4};

        System.out.println(containsDuplicate.containsDuplicate(nums));
        System.out.println(containsDuplicate.containsDuplicate(duplicateNums));
    }
}
