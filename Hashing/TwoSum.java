import java.util.HashSet;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, -6, -3, 8};
        int target = 9;

        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr) {
            if(set.contains(target - ele)) System.out.println(ele + " " + (target - ele));
            else set.add(ele);
        }
    }
}
