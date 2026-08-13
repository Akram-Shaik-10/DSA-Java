//leetcode 724
//The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
class Solution {
    public int pivotIndex(int[] nums) {
        int idx = -1;
        int sum = 0;
        int n = nums.length; 

        for(int i = 1; i < n; i++) {
            nums[i] += nums[i - 1];
        }

        for(int i = 0; i < n; i++) {
            sum = (i == 0) ? 0: nums[i - 1];
            if(sum == (nums[n - 1] - nums[i])) return i;
        }

        return idx;
    }
}

public class PivotIndex {
    public static void main(String[] args) {
        
    }
}