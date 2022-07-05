package com.bridgelabz.functional;

import java.util.Scanner;

public class Distance {
    /*
    3. Write a program Distance.java that takes two integer command-line arguments x
        and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
        formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
     */
    public static void main(String[] args) {
        int x,y;
        double distance=0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter integer \nx = ");
        x=scanner.nextInt();
        System.out.print("y = ");
        y=scanner.nextInt();

        distance=Math.sqrt(x*x+y*y);
        System.out.println("Distance from the Origin = "+distance);
    }
}
