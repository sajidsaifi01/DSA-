package sajid;

import java.util.Scanner;

public class VolumeOfSphere {
    //V = 4/3πr3
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of sphere : ");
        int radius = in.nextInt();
        double volume = 4 / 3 * Math.PI * Math.pow(radius, 3);
        System.out.print("Volume of Sphere is : " + volume);

    }
}
