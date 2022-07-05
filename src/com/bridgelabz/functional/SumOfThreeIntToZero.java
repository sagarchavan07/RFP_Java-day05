package com.bridgelabz.functional;

import java.util.Scanner;

public class SumOfThreeIntToZero {
    /*
    2. Sum of three Integer adds to ZERO
        a. Desc -> A program with cubic running time. Read in N integers and counts the
        number of triples that sum to exactly 0.
        b. I/P -> N number of integer, and N integer input array
        c. Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
        d. O/P -> One Output is number of distinct triplets as well as the second output is to
        print the distinct triplets.
     */

    public static void main(String[] args) {
        int n;
        int count=0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter  number of inputs \n= ");
        n=scanner.nextInt();

        System.out.println("enter numbers : ");
        int[] ar =new int[n];
        for (int i = 0; i < n; i++) {
            ar[i]=scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (j != i) {
                    for (int k = j+1; k < n; k++) {
                        if (k != i  && k != j) {
                            if (ar[i]+ar[j]+ar[k] ==0) {
                                System.out.println(ar[i]+" + "+ar[j]+" + "+ar[k]+" =0");
                                count++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("no of triplets = "+count);
    }
}
