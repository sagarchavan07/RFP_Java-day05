package com.bridgelabz.functional;

import java.util.Scanner;

public class WindChill {
    /*
    5. Write a program WindChill.java that takes two double command-line arguments t
        and v and prints the wind chill. Use Math.pow(a, b) to compute ab. Given the
        temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the
        National Weather Service defines the effective temperature (the wind chill) to be:

        Note: the formula is not valid if t is larger than 50 in absolute value or if v is larger
        than 120 or less than 3 (you may assume that the values you get are in that range).
     */

    public static void main(String[] args) {
        double t,v,w;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter temperature below 50 \nt = ");
        t=scanner.nextInt();

        while (t>50){
            System.out.print("OOps...\nEnter temperature below 50 \nt = ");
            t=scanner.nextInt();
        }
        System.out.print("enter speed betn range 3 to 120\nv = ");
        v=scanner.nextInt();

        while (v<3 || v>120){
            System.out.print("OOps...\nenter speed betn range 3 to 120 \nv = ");
            v=scanner.nextInt();
        }

        w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v,0.16);
        System.out.println("WindChill = "+w);
    }
}
