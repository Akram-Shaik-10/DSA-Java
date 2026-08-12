//leetcode 1431

import java.util.List;
import java.util.ArrayList;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int n = candies.length;
        int maxCandies = candies[0];
        for(int candy : candies) {
            if(candy > maxCandies) maxCandies = candy;
        }
        int i = 0;
        while(i < n) {
            if(candies[i] + extraCandies >= maxCandies) result.add(true);
            else result.add(false);
            i++;
        }
        return result;
    }
}

public class KidsWithCandies {
    public static void main(String[] args) {
        
    }
}
