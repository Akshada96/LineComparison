package com.bridgelabz;

import java.util.Scanner;
import java.lang.Math;

public class LineComparison {
    static int x1, x2, y1, y2;
    void getCoordinates() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter (x1, y1) : ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.println("Enter (x2, y2) : ");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
    }
    double lineLength() {
        return Math.sqrt((x2-x1)^2+(y2-y1)^2);
    }
    void lineCompare(double length1, double length2) {
        if (length1 == length2)
            System.out.println("Line1 is equal to Line2");
        else if (length1 > length2)
            System.out.println("Line1 is greater than Line2");
        else
            System.out.println("Line1 is less than Line2");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
        LineComparison lc1 = new LineComparison();
        System.out.println("Enter line1 co-ordinates");
        lc1.getCoordinates();
        double length1 = lc1.lineLength();
        LineComparison lc2 = new LineComparison();
        System.out.println("Enter line2 co-ordinates");
        lc2.getCoordinates();
        double length2 = lc2.lineLength();
        System.out.println("Comparing line1 & line2");
        lc1.lineCompare(length1, length2);
    }
}
