package com.bridgelabz;

import java.util.Scanner;
import java.lang.Math;

public class LineComparison {
    public static void main(String args[]) {
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter co-ordinates for line1 (x1, y1) : ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter co-ordinates for line1 (x2, y2) : ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double length1 = Math.sqrt((x2-x1)^2+(y2-y1)^2);
        System.out.println("Enter co-ordinates for line2 (x3, y3) : ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        System.out.println("Enter co-ordinates for line2 (x4, y4) : ");
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();
        double length2 = Math.sqrt((x4-x3)^2+(y4-y3)^2);
        if (length1 == length2)
            System.out.println("Two lines are equal");
        else
            System.out.println("Two lines are not equal");
    }
}
