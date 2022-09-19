package sajid;

import java.util.Scanner;

public class Area_Of_Equilateral_Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter area of equilateral triangle : ");
        float a = in.nextFloat();
        double area = (1.73 * a * a) / 4;
        System.out.println("Area of Equilateral Triangle is : " + area);
    }
}
