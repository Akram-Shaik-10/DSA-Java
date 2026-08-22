//leetcode 242

import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        int n = s.length();
        int m = t.length();
        if(n != m) return false;

        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)) {
                int count = map.get(ch);
                map.put(ch, count + 1);
            }
            else map.put(ch, 1);
        }

        for(int i = 0; i < n; i++) {
            char ch = t.charAt(i);
            if(map.containsKey(ch)) {
                int count = map.get(ch);
                map.put(ch, count - 1);
            }
            else return false;
        }

        for(char ch : map.keySet()) {
            if(map.get(ch) >= 1) return false;
        }
        return true;
    }
}

public class ValidAnagram {
    public static void main(String[] args) {
        
    }
}
