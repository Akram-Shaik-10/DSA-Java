//leetcode 771
// Given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

import java.util.Arrays;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int n = jewels.length();
        int m = stones.length();

        char[] st = stones.toCharArray();
        char[] jew = jewels.toCharArray();

        Arrays.sort(st);
        Arrays.sort(jew);

        int i = 0, j = 0;
        int count = 0;
        while(i < n && j < m) {
            if(jew[i] > st[j]) j++;
            else if(jew[i] < st[j]) i++;
            else {
                while(i < n && j < m && jew[i] == st[j]) {
                    count++;
                    j++;
                }
            }

        }
        return count;
    }
}

public class JewelsAndStones {
    public static void main(String[] args) {
        
    }
}
