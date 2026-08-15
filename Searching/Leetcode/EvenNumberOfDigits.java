//leetcode 1295
//Given an array nums of integers, return how many of them contain an even number of digits.

class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int evenCount = 0;
        for(int i = 0; i < n; i++) {
            int ele = nums[i];
            int count = 0;
            while(ele > 0) {
                ele /= 10;
                count++;
            }
            if((count & 1) == 0) evenCount++;
        }
        return evenCount;
    }
}

public class EvenNumberOfDigits {
    public static void main(String[] args) {
        
    }
}
