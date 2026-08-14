//leetcode 34
//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        
        int i = 0, j = nums.length - 1;
        int start = -1, end = -1;
        while(i <= j) {
            int mid = i + (j - i) / 2;
            if(target == nums[mid]) {
                start = mid;
                j = mid - 1;
            }
            else if(target > nums[mid]) i = mid + 1;
            else j = mid - 1;
        }
        
        i = 0;
        j = nums.length - 1;
        while(i <= j) {
            int mid = i + (j - i) / 2;
            if(target == nums[mid]) {
                end = mid;
                i = mid + 1;
            }
            else if(target > nums[mid]) i = mid + 1;
            else j = mid - 1;
        }
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
}

public class FirstAndLastPosition {
    public static void main(String[] args) {
        
    }
}
