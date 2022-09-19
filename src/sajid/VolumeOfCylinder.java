package sajid;

import java.util.Scanner;

public class VolumeOfCylinder {
    //V = πr2h
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r, h;
        System.out.print("Enter radius of volume : ");
        r = in.nextInt();
        System.out.print("Enter height of volume : ");
        h = in.nextInt();
        double volume = Math.PI * r * 2 * h;
        System.out.print("Volume of Cylinder is : " + volume);
    }
}
