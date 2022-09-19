package sajid;

import java.util.Scanner;

public class FactorOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number for check factor : ");
        int num = input.nextInt();
        System.out.print("Factor of " + num + " are : ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
