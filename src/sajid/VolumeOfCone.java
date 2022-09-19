package sajid;

import java.util.Scanner;

public class VolumeOfCone {
    //V = π r*r h/3
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Radius of volume : ");
        float r = in.nextFloat();
        System.out.print("Enter Height of volume : ");
        float h = in.nextFloat();
        double v = (Math.PI * r * r) * h / 3;
        System.out.println("Volume of Cone is : " + v);

    }
}
