package sajid;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    // 2πrh
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float r, h;
        System.out.print("Enter radius of curved surface : ");
        r = in.nextFloat();
        System.out.print("Enter height of curved surface : ");
        h = in.nextFloat();
        double c = 2 * Math.PI * r * h;
        System.out.print("Curved surface area of cylinder : " + c);
    }
}
