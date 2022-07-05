package com.bridgelabz.basicCore;

import java.util.Scanner;

public class Power_of_2 {
    /*
    3. Power of 2
        a. Desc -> This program takes a command-line argument N and prints a table of the
            powers of 2 that are less than or equal to 2^N.
        b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
        c. Logic -> repeat until i equals N.
        d. O/P -> Print the output.
     */
    public static void main(String[] args) {
        int powerOf2=1;
        int N;
        Scanner scanner=new Scanner(System.in);

        System.out.print("enter power for 2    \nN = ");
        N=scanner.nextInt();

        while (N<0 || N>31){
            System.out.print("enter power betn 0 to 31 \nN= ");
            N=scanner.nextInt();
        }


        for (int i = 0; i < N; i++) {
            powerOf2=powerOf2*2;
        }
        System.out.println("2^"+N+" = "+powerOf2);
    }
}
