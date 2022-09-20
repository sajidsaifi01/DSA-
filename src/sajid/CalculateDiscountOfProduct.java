package sajid;

import java.util.Scanner;

public class CalculateDiscountOfProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double dis, amount, marketPrice, s;
        System.out.print("Enter market price : ");
        marketPrice = in.nextDouble();
        System.out.print("enter discount percentage : ");
        dis = in.nextDouble();
        s = 100 - dis;
        amount = (s * marketPrice) / 100;
        System.out.print("Amount after discount = " + amount);
    }
}
