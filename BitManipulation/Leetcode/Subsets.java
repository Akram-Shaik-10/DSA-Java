//leetcode 78
//all possible subsets (the power set) of an array.

import java.util.List;
import java.util.ArrayList;
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < (1 << n); i++) {
            ArrayList<Integer> a = new ArrayList<>();
            for(int j = 0; j < n; j++) {
                if(((i >> j) & 1) == 1) a.add(nums[j]);
            }
            ans.add(a);
        }
        return ans;
    }
}

public class Subsets {
    public static void main(String[] args) {
        
    }
}
