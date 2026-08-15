//leetcode 485
//Given a binary array nums, return the maximum number of consecutive 1's in the array.
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for(int ele : nums) {
            count++;
            if(ele != 1) count = 0;
            max = count > max ? count : max;
        }
        return max;
    }
}

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        
    }
}
