//leetcode 190
//Reverse bits of a given 32 bits signed integer.

import java.util.ArrayList;

class Solution {
    public int reverseBits(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < 32; i++){
            ans.add(n & 1);
            n = n >> 1;
        }
        int decimal = 0;
        int i = 0, j = 31;
        while(i < 32) {
            decimal += ((1 << i) * ans.get(j));
            i++;
            j--;
        }
        return decimal;
    }
}

public class ReverseBits {
    public static void main(String[] args) {
        
    }
}
