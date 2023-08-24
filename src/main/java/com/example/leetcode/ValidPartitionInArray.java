package com.example.leetcode;

public class ValidPartitionInArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2,3,4};


         ValidPartitionInArray validPartitionInArray = new ValidPartitionInArray();
        System.out.println(validPartitionInArray.validPartition(nums));
    }
    public boolean validPartition(int[] nums) {
        int n = nums.length;
        if (n == 1) return true;

        boolean[] dp = new boolean[]{true, false, n > 1 && nums[0] == nums[1]};
        for (int i = 2; i < n; i++) {
                    boolean currentDp = false;
                    if(nums[i] == nums[i-1] && dp[1]){
                        currentDp = true;
                    } else if (nums[i] == nums[i-1] && nums[i] == nums[i-2] && dp[0]) {
                        currentDp = true;
                    }else if (nums[i] - nums[i - 1] == 1 && nums[i - 1] - nums[i - 2] == 1 && dp[0]) {
                currentDp = true;
            }
            dp[0] = dp[1];
            dp[1] = dp[2];
            dp[2] = currentDp;
        }
        return dp[2];
    }
}

