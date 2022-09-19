package sajid;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    // P = 2(a+b)
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Base of Parallelogram : ");
        int base = in.nextInt();
        System.out.print("Enter side of Parallelogram : ");
        int a = in.nextInt();
        int parallelogram = 2 * (base + a);
        System.out.print("Perimeter of parallelogram : " + parallelogram);
    }
}
