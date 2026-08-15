//leetcode 747
//largest element in the array is at least twice as much as every other number in the array. If it is, return the index of the largest element, or return -1 otherwise.

class Solution {
    public int dominantIndex(int[] nums) {
        int max = -1;
        int idx = -1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
                idx = i;
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(i != idx && nums[i] * 2 > max) {
                return -1;
            }
        }
        
        return idx;
    }
}

public class LargestNumberTwiceOfOthers {
    public static void main(String[] args) {
        
    }
}
