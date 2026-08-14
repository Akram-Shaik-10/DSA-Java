//leetcode 209
//Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len = Integer.MAX_VALUE;
        int sum = 0;
        int n = nums.length;

        int i = 0, j = 0;
        while(i < n && j < n) {
            sum += nums[j];
            if(sum >= target) {
                // len = ((j - i + 1) < len) ? (j - i + 1): len;
                while(sum >= target) {
                    len = ((j - i + 1) < len) ? (j - i + 1): len;
                    sum -= nums[i];
                    i++;
                }
            }
            j++;
        }

        return (len < Integer.MAX_VALUE) ? len: 0;
    }
}

public class MinimumSizeSubArray {
    public static void main(String[] args) {
        
    }   
}
