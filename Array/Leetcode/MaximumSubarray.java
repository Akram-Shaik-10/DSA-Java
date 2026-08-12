//leetcode 53
//Given an integer array nums, find the subarray with the largest sum, and return its sum.
//Kadane's algorithm

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int ele : nums) {
            sum += ele;
            if(sum > maxSum) maxSum = sum;
            if(sum < 0) sum = 0;
        }
        return maxSum;
    }
}

public class MaximumSubarray {
    public static void main(String[] args) {
        
    }
}