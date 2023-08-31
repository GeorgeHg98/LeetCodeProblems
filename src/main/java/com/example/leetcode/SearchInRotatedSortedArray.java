package com.example.leetcode;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
    int low = 0;
    int high = nums.length - 1;
    while(low < high){
        int mid = (low + high)/2;
        if(nums[mid] == target){
            return mid;
        }
        if(nums[low] <= nums[mid]){
            if(target >= nums[low] && target <= nums[mid]){
                high = mid -1;
            }else{
                low = mid +1;
            }
        }else  {
            if(target > nums[mid] && target <= nums[high]){
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
    }return nums[low] == target ? low:-1;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{4,5,6,7,0,1,2};
        int target = 0;
        SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();
        System.out.println(searchInRotatedSortedArray.search(nums,target));
    }
}
