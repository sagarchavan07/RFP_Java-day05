package com.bridgelabz.functional;

import java.util.Scanner;

public class Quadratic {
    /*
    4. Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
        Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
        can be found using a formula (Note: Take a, b and c as input values)
        delta = b*b - 4*a*c
        Root 1 of x = (-b + sqrt(delta))/(2*a)
        Root 2 of x = (-b - sqrt(delta))/(2*a)
     */
    public static void main(String[] args) {
        double a,b,c;
        double delta,root1,root2;

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter integer \na = ");
        a=scanner.nextInt();
        System.out.print("b = ");
        b=scanner.nextInt();
        System.out.print("c = ");
        c=scanner.nextInt();

        delta=b*b - 4*a*c;
        root1=(-b + Math.sqrt(delta))/(2*a);
        root2=(-b - Math.sqrt(delta))/(2*a);

        System.out.println("root 1 = "+root1);
        System.out.println("root 2 = "+root2);
    }
}
