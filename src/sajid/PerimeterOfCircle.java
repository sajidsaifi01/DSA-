package sajid;

import java.util.Scanner;

public class PerimeterOfCircle {
    // C=2πr formula
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of perimeter : ");
        int r = in.nextInt();
        double c = 2 * Math.PI * r;
        System.out.println("Perimeter Of Circle is : " + c);
    }
}
