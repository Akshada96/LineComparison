package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    public static void main(String args[]) {
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter co-ordinates for line (x1, y1) : ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter co-ordinates for line (x2, y2) : ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double length = Math.sqrt((x2-x1)^2+(y2-y1)^2);
        System.out.println("Length of line is "+length);
    }
}
