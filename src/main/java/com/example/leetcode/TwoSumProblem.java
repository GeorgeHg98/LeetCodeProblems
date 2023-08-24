package com.example.leetcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class TwoSumProblem {

    public static void main(String[] args) {
        SpringApplication.run(TwoSumProblem.class, args);
    }
        public int[] twoSum(int[] nums, int target){

            Map<Integer, Integer> map = new HashMap<>();
            int[] result = new int[2];
            for(int i = 0; i< nums.length; i++){
                if(map.containsKey(target - nums[i])){
                    result[1] = i;
                    result[0] = map.get(target - nums[i]);
                    return result;
                }
                map.put(nums[i], i);
        }
            return result;
        }
}
