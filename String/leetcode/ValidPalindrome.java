//leetcode 125
//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward.
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();

        int i = 0;
        while(i < s.length()) {
            char ch = s.charAt(i);
            if((ch >= 97 && ch <= 122) || (ch >= 48 && ch <= 57)) {
                sb.append(ch);
            }
            i++;
        }

        return palindromeCheck(sb);
    }

    static boolean palindromeCheck(StringBuilder sb) {
        int i = 0;
        int j = sb.length() - 1;
        while(i < j) {
            char first = sb.charAt(i);
            char last = sb.charAt(j);
            if(first != last) return false;
            i++;
            j--;
        }

        return true;
    }
}

public class ValidPalindrome {
    public static void main(String[] args) {
        
    }
}
