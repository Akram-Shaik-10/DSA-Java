import java.util.Scanner;
public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        System.out.print("Enter precision : ");
        int p = sc.nextInt();

        sqrt(num, p);

        System.out.printf("%f",sqrt(num, p));
        sc.close();
    }

    private static double sqrt(int num, int p) {
        int i = 0;
        int j = num;
        double root = 0.0;
        while(i <= j) {
            int m = i + (j - i) / 2;
            if(m * m == num) {
                return m;
            }
            else if(m * m < num) {
                i = m + 1;
            }
            else {
                j = m - 1;
            }
        }

        root = j;
        double increment = 0.1;
        for(int k = 1; k <= p; k++) {
            while(root * root <= num) {
                root += increment;
            }
            root -= increment;
            increment /= 10;
        }
        return root;
    }
}
