//leetcode 260
//Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice.

class Solution {
    public int[] singleNumber(int[] nums) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++) {
            ans ^= nums[i];
        }
        int b1 = 0;
        int b2 = 0;
        int mask = (ans & (~ans + 1));

        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++) {
            if((mask & nums[i]) != 0) b1 ^= nums[i];
            else b2 ^= nums[i];
        }
        result[0] = b1;
        result[1] = b2;
        return result;
    }
}

public class SingleNumberIII {
    public static void main(String[] args) {
        
    }
}
