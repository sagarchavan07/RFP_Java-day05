package com.bridgelabz.basicCore;

import java.util.ArrayList;
import java.util.Scanner;

public class Factors {
    /*
    5. Factors
        a. Desc -> Computes the prime factorization of N using brute force.
        b. I/P -> Number to find the prime factors
        c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
        d. O/P -> Print the prime factors of number N.
     */
    public static void main(String[] args) {
        int n;

        Scanner scanner=new Scanner(System.in);
        Factors factors=new Factors();
        ArrayList <Integer> primeFactors=new ArrayList<Integer>();

        System.out.print("Entaer Number to find the prime factors \nn = ");
        n=scanner.nextInt();

        for (int i = 2; i < n/2; i++) {
            if (factors.checkPrime(i) && n%i==0 ){
                primeFactors.add(i);
            }
        }
        System.out.println("prime factors of number "+n);
        for (int x:primeFactors) {
            System.out.println(x+" ");
        }
    }

    boolean checkPrime(int x){
        boolean prime=true;
        for (int i = 2; i < x/2; i++) {
            if (x%i==0){
                prime=false;
                break;
            }
        }
        return prime;
    }
}
