package sajid;

import java.util.Scanner;

public class PerimeterOfSquare {
    // P = 4a
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter side of square : ");
        int a = in.nextInt();
        int p = 4 * a;
        System.out.println("Perimeter of square is : " + p);
    }
}
