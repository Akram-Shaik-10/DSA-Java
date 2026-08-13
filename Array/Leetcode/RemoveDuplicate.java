//leetcode 26
//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = i, k = i;
        int n = nums.length;
        while(i < n && j < n) {
            if(nums[i] != nums[j]) {
                nums[++k] = nums[j];
                i = j;
            }
            j++;
        }
        return ++k;
    }
}

public class RemoveDuplicate {
    public static void main(String[] args) {
        
    }
}
