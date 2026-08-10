//leetcode 2220
// minimum number of bit flips to convert start to goal
class Solution {
    public int minBitFlips(int start, int goal) {
        int flips = 0;
        while(start > 0 || goal > 0) {
            if((start & 1) != (goal & 1)) flips++;
            start = start >> 1;
            goal = goal >> 1;
        }
        return flips;
    }
}

public class MinimumBitFlips {
    public static void main(String[] args) {

    }
}
