//leetcode 283
//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0, j = i;
        int n = nums.length;
        for(i = 0; i < n; i++) {
            if(nums[i] == 0) {
                j = i;
                break;
            }
        }
        while(i < n && j < n) {
            if((nums[i] != 0)) {
                swap(nums, i, j);
                j++;
            }
            i++;
        }
    }
    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

public class MoveZerosToEnd {
    public static void main(String[] args) {
        
    }
}