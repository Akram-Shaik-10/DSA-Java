//leetcode 1470
//Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].Return the array in the form [x1,y1,x2,y2,...,xn,yn].

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int i = 0;
        while(i < n) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[i + n];
            i++;
        }
        return ans;
    }
}

public class ShuffleArray {
    public static void main(String[] args) {
        
    }
}
