//The given number should contain excatly one adjacent set bit pair
class Solution {
    public boolean consecutiveSetBits(int n) {
        int count = 0;
        while(n > 0) {
            if(((n & 1) == 1) && (((n >> 1) & 1) == 1)) count++;
            n = n >> 1;
        }
        return count == 1;
    }
}

public class ConsecutiveSetBitPair {
    public static void main(String[] args) {
        
    }
}