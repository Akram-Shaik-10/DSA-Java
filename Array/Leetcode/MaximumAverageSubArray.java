//leetcode 643
//Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value.
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg = 0;
        double sum = 0;

        for(int i = 0; i < k; i++) {
            sum = sum + nums[i];
        }
        
        avg = sum / k;
        for(int i = 0, j = k; j < nums.length; i++, j++) {
            sum = sum - nums[i] + nums[j];
            avg = avg > sum / k ? avg: sum / k; 
        }
        return avg;
    }
}

public class MaximumAverageSubArray {
    public static void main(String[] args) {
        
    }
}