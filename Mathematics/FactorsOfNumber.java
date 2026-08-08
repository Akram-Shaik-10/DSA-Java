import java.util.Scanner;
import java.util.ArrayList;
public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1; i * i <= n; i++){
            if(n % i == 0) {
                if(n / i == i) {
                    System.out.print(i + " ");
                }
                else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }

        sc.close();
    }
}
