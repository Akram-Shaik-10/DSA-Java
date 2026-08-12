//leetcode 169
//Given an array nums of size n, return the majority element.The majority element is the element that appears more than ⌊n / 2⌋ times.
//MOORE'S VOTING ALGORITHM

class Solution {
    public int majorityElement(int[] nums) {
        int ele = nums[0];
        int count = 0;
        for(int n : nums) {
            if(count == 0) {
                count = 1;
                ele = n;
            }
            else if(n == ele) count++;
            else count--;
        }
        return ele;
    }
}

public class MajorityElement {
    public static void main(String[] args) {
        
    }
}