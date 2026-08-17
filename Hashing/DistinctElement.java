import java.util.HashSet;

public class DistinctElement {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,3,2,4,3,1,4,7};
        HashSet<Integer> set = new HashSet<>();
        
        for (int ele : arr) {
            set.add(ele);
        }
        System.out.println(set.size());
    }
}
