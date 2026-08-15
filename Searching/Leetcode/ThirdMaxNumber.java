//leetcode 414
//Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

class Solution {
    public int thirdMax(int[] nums) {
        long thirdMax = Long.MIN_VALUE;
        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;

        for(int ele : nums) {
            if(ele > firstMax){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = ele;
            }
            else if(ele > secondMax && ele != firstMax){
                thirdMax = secondMax;
                secondMax = ele;
            }
            else if(ele > thirdMax && ele != firstMax && ele != secondMax) {
                thirdMax = ele;
            }
        }
        if(thirdMax == Long.MIN_VALUE) return (int)firstMax;
        return (int)thirdMax;
    }
}

public class ThirdMaxNumber {
    public static void main(String[] args) {
        
    }
}
