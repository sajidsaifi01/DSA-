package sajid;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter first number : ");
        int num1 = in.nextInt();
        System.out.print("Please enter second number : ");
        int num2 = in.nextInt();
        System.out.println("Addition of both the numbers are : " + (num1 + num2));

    }
}
