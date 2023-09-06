package com.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m+n-1; i >= m; i--){
            nums1[i]=nums2[i-m];
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        MergeSortedArray mergeSortedArray = new MergeSortedArray();

       mergeSortedArray.merge(nums1,3,nums2,3);
        for (int num:nums1) {
            System.out.println(num);
        }
    }
}


