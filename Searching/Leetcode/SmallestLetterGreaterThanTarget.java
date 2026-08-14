//leetcode 744
//Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int i = 0, j = letters.length - 1;
        while(i <= j) {
            int mid = i + (j - i) / 2;
            if(letters[mid] > target)  j = mid - 1;
            else i = mid + 1;
        }
        return i >= letters.length ? letters[0]: letters[i];
    }
}

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        
    }   
}
