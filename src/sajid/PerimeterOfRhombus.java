package sajid;

import java.util.Scanner;

public class PerimeterOfRhombus {
    // p = 4a
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter side of rhombus : ");
        int a = in.nextInt();
        int p = 4 * a;
        System.out.println("Perimeter of rhombus is : " + p);
    }
}
