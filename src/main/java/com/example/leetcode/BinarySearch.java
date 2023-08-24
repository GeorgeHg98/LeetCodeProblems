package com.example.leetcode;

import java.util.HashMap;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(binarySearch.search(nums, target));
    }

    public int search(int[] nums, int target) {
        int min = 0;
        int max = nums.length - 1;

        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }

        }return -1;
    }
}

