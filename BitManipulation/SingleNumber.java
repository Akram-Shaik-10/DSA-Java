//In an array containing elements which repeat twice..one element appears only once.
//Ex:{1,4,7,9,7,1,9} ans = 4
import java.util.Scanner;

public class SingleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size;
        System.out.print("Enter size of array :");
        size = sc.nextInt();
        
        int[] arr = new int[size];
        System.out.print("Enter array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int n = 0;
        for (int ele : arr) {
            n ^= ele;
        }
        System.out.println("Single element in array is : " + n);

        sc.close();
    }
}
