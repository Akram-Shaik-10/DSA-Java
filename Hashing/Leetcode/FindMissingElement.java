//leetcode 3731
//nums contained every integer within a certain range. However, some integers might have gone missing from the array..The smallest and largest integers of the original range are still present in nums.Return a sorted list of all the missing integers in this range. If no integers are missing, return an empty list.

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        boolean[] freq = new boolean[101];
        int min = nums[0];
        int max = -1;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max) max = nums[i];
            else if(nums[i] < min) min = nums[i];
            freq[nums[i]] = true;
        }

        for(int i = min + 1; i < max; i++) {
            if(!freq[i]) ans.add(i);
        }

        return ans;
    }
}

public class FindMissingElement {
    public static void main(String[] args) {
        
    }
}
