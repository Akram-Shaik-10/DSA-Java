//leetcode387
//Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(freq[ch - 'a'] == 1) return i;
        }
        return -1;
    }
}

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        
    }
}
