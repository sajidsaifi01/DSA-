package sajid;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstTerm = 0, secondTerm = 1, count;
        System.out.print("Enter the number till where you want to print : ");
        count = in.nextInt();
        for (int i = 1; i <= count; i++) {
            System.out.print(firstTerm + ",");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
