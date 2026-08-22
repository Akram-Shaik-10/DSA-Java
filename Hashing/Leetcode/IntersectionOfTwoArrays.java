//leetcode 349
import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int ele : nums1) {
            map.put(ele, 1);
        }
       
        ArrayList<Integer> ans = new ArrayList<>();
        for(int ele : nums2) {
            if(map.containsKey(ele)) {
                ans.add(ele);
                map.remove(ele);
            }
        }
        int[] a = new int[ans.size()];
        int i = 0;
        for(int ele : ans) {
            a[i] = ele;
            i++;
        }
        return a;
    }
}

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        
    }
}
