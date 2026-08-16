//leetcode 344
//Time complexity : O(n)
//space complexity : O(n)
class Solution {
    public void reverseString(char[] s) {
        int i = 0, j = s.length - 1;
        while(i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}

public class ReverseString {
    public static void main(String[] args) {

    }
}