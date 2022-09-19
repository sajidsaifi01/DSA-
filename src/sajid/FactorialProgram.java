package sajid;

import java.util.Scanner;

public class FactorialProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, fact = 1, num;
        System.out.print("Please enter the number to check factorial : ");
        num = in.nextInt();
        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is : " + fact);
    }
}
