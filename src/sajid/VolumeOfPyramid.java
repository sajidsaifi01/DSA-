package sajid;

import java.util.Scanner;

public class VolumeOfPyramid {
    //V = l*w*h/3
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l, w, h, v;
        System.out.print("Enter length of volume : ");
        l = in.nextInt();
        System.out.print("Enter width of volume : ");
        w = in.nextInt();
        System.out.print("Enter height of volume : ");
        h = in.nextInt();
        v = l * w * h / 3;
        System.out.print("Volume of pyramid is : " + v);
    }
}
