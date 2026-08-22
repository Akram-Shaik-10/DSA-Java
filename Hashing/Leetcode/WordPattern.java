//leetcode 290
import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        int j = 0, k = 0;
        for(int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);
            if(j == s.length()) return false;
            while( j < s.length() && s.charAt(j) != ' ') {
                j++;
            }
            String str = s.substring(k, j);
            if(j < s.length()) {
                j++;
                k = j;
            }
            else k = j;
            if(map1.containsKey(ch) && !((map1.get(ch)).equals(str))) return false;
            else if(map1.containsValue(str) && ch != map2.get(str)) return false;
            map1.put(ch, str);
            map2.put(str, ch);
        }
        if(k < s.length() ) return false;
        return true;
    }
}

public class WordPattern {
    public static void main(String[] args) {
        
    }
}
