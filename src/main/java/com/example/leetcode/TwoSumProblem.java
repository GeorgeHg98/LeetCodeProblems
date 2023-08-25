package com.example.leetcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class TwoSumProblem {

    public static void main(String[] args) {
        TwoSumProblem twoSumProblem = new TwoSumProblem();
        int[] nums = new int[]{2, 7, 5, 4, 8, 3, 6};
        int target = 9;
        System.out.println(Arrays.toString(twoSumProblem.twoSum(nums, target)));

        SpringApplication.run(TwoSumProblem.class, args);
    }

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] twoNumbers = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                twoNumbers[1] = i;
                twoNumbers[0] = map.get(target - nums[i]);
                return twoNumbers;
            }
            map.put(nums[i], i);
        }
        return twoNumbers;
    }
}
