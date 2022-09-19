package sajid;

import java.util.Scanner;

public class VolumeOfPrism {
    //B=l*w and v = b*h
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l, w, b, h, v;
        System.out.print("Enter length of Prism : ");
        l = in.nextInt();
        System.out.print("Enter width of Prism : ");
        w = in.nextInt();
        b = l * w;
        System.out.println("This is the base of Prism : " + b);
        System.out.print("Enter height of Prism : ");
        h = in.nextInt();
        v = h * b;
        System.out.println("Volume of prism is : " + v);
    }
}
