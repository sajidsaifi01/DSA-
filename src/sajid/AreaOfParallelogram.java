package sajid;

import java.util.Scanner;

// Area = b * h
public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base of area : ");
        int b = input.nextInt();
        System.out.print("Enter height of area : " );
        int h = input.nextInt();
        int area = b * h;
        System.out.println("Area of Parallelogram is : " + area);
    }
}
