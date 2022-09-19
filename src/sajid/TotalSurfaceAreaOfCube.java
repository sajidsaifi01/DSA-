package sajid;

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    // 6a2
    public static void main(String[] args) {
        int c, a;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter side of cube : ");
        a = in.nextInt();
        c = 6 * a * a;
        System.out.print("Total surface area of cube is : " + c);

    }
}
