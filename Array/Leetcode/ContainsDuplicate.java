//leetcode 217
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

package Array.Leetcode;
import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j = 1;
        while(j < nums.length) {
            if(nums[i] == nums[j]) return true;
            i++;
            j++;
        }
        return false;
    }
}

public class ContainsDuplicate {
    public static void main(String[] args) {
        
    }
}
