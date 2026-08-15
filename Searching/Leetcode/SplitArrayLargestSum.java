//leetcode 410
//Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.

class Solution {
    public int splitArray(int[] nums, int m) {
        int min = nums[0];
        int max = nums[0];
        int n = nums.length;
        for(int i = 1; i < n; i++) {
            max += nums[i];
            if(nums[i] > min) min = nums[i];
        }

        int i = min, j = max;
        while(i < j) {
            int mid = i + (j - i) / 2;
            int pieces = 1;
            int sum = 0;
            for(int k = 0; k < n; k++) {
                sum += nums[k];
                if(sum > mid) {
                    k--;
                    pieces++;
                    sum = 0;
                } 
            }
            if(pieces <= m) {
                j = mid;
            }
            else i = mid + 1;
        }
        return i;
    }
}

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        
    }
}
