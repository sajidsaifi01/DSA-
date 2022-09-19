package sajid;

import java.util.Scanner;

public class AreaOfRhombus {
    // a = p*q/2
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter p diagonal : ");
        float p = input.nextInt();
        System.out.print("Enter q diagonal : ");
        float q = input.nextInt();
        float area = p * q / 2;
        System.out.print("Area of rhombus : " + area);
    }
}
