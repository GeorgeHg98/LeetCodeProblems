package com.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequencies {
    public static void main(String[] args) {

      int[] nums = new int[]{1,1,1,5,5};
       int k = 2;

      TopKFrequencies topKFrequencies = new TopKFrequencies();
        System.out.println(Arrays.toString(topKFrequencies.topKFrequent(nums, k)));

    }

    public int[] topKFrequent(int[] nums, int k){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i: nums){
            map.put(i,map.getOrDefault(i, 0) + 1);
        }
        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for(int key : map.keySet()){
            int freq = map.get(key);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        int res[] = new int[k];
        int index = 0;
        for(int i = bucket.length - 1; i>=0; i--){
            if(bucket[i] != null){
                for(int val : bucket[i]){
                    res[index++] = val;
                    if(index == k) return res;
                }
            }
        }return res;
    }
    }

