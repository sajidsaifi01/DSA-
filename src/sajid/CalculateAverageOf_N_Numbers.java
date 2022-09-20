package sajid;

import java.util.Scanner;

public class CalculateAverageOf_N_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Total count of number to find the average of : ");
        int n = in.nextInt();
        int sum = 0;
        System.out.print("Enter the number : ");
        for (int i = 1; i <= n; i++) {
            sum += in.nextInt();
        }
        double average = sum / (double) n;
        System.out.println("Average of n given number is : " + average);
    }
}
