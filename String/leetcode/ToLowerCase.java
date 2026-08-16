//leetcode 709
//Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.
//Time Complexity : O(n)
//Space Complexity : O(n)

class Solution {
    public String toLowerCase(String s) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while(i < s.length()) {
            char ch = s.charAt(i);
            if(ch >= 65 && ch <= 90) {
                ch = (char)(ch + 32);
                sb.append(ch);
            }
            else sb.append(ch);
            i++;
        }
        s = sb.toString();
        return s;
    }
}

public class ToLowerCase {
    public static void main(String[] args) {
        
    }
}
