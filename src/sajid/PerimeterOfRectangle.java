package sajid;

import java.util.Scanner;

public class PerimeterOfRectangle {
    //P = 2(l+w)
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of perimeter : ");
        int l = in.nextInt();
        System.out.print("Enter width of perimeter : ");
        int w = in.nextInt();
        int p = 2 * (l + w);
        System.out.println("Perimeter of rectangle is : " + p);
    }
}
