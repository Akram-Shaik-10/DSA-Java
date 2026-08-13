//leetcode 977
//Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int i = 0;
        for(i = 0; i < n; i++) {
            if(nums[i] > 0) break;
        }
        int j = i - 1;
        int k = 0;
        while(j >= 0 && i < n) {
            if(-nums[j] < nums[i]){
                ans[k++] = nums[j ] * nums[j];
                j--;
            }
            else {
                ans[k++] = nums[i] * nums[i];
                i++;
            }
        }
        while(j >= 0) {
            ans[k++] = nums[j ] * nums[j];
            j--;
        }
        while(i < n) {
            ans[k++] = nums[i] * nums[i];
            i++;
        }
        return ans;
    }
}

public class SquareOfSortedArray {
    public static void main(String[] args) {
        
    }
}
