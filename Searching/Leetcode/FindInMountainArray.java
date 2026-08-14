//leetcode 1095

class Solution {

    public static int peak(MountainArray arr) {
        int i = 0, j = arr.length() - 1;
        int peak = -1;
        while(i < j ) {
            int mid = i + (j - i) / 2;
            if(arr.get(mid) > arr.get(mid + 1)) {
                j = mid;
                peak = mid;
            }
            else i = mid + 1;
        }
        return peak;
    }

    public static int binarySearchAscending(MountainArray arr, int i, int j, int target) {
        while(i <= j) {
            int mid = i + (j - i) / 2;
            if(arr.get(mid) == target) return mid;
            else if(arr.get(mid) > target) j = mid - 1;
            else i = mid + 1;
        }
        return -1;
    }

    public static int binarySearchDescending(MountainArray arr, int i, int j, int target) {
        while(i <= j) {
            int mid = i + (j - i) / 2;
            if(arr.get(mid) == target) return mid;
            else if(arr.get(mid) > target) i = mid + 1;
            else j = mid - 1;
        }
        return -1;
    }

    public int findInMountainArray(int target, MountainArray arr) {
        int peak = peak(arr);
        
        int idx = binarySearchAscending(arr, 0, peak, target);
        if(idx != -1) return idx;

        return binarySearchDescending(arr, peak + 1, arr.length() - 1, target);
    }
}

public class FindInMountainArray {
    public static void main(String[] args) {
        
    }
}
