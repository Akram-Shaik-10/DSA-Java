//leetcode problem 191

class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while(n > 0) {
            if((n & 1) == 1) count++;
            n = n >> 1;
        }
        return count;
    }
}

public class HammingWeight {
    public static void main(String[] args) {
        
    }
}