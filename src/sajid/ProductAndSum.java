package sajid;

import java.util.Scanner;

public class ProductAndSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        Output: 15
        int sum = 0;
        int product = 1;
        while (n > 0) {
            sum += n % 10;
            product *= n % 10;
            n /= 10;
        }
        System.out.println(product - sum);
    }
}
