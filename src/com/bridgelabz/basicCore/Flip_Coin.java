package com.bridgelabz.basicCore;

import java.util.Random;
import java.util.Scanner;

public class Flip_Coin {
/*
 1. Flip Coin and print percentage of Heads and Tails
    a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
    b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads
    c. O/P -> Percentage of Head vs Tails
 */
    public static void main(String[] args) {
        int n;
        int headCount=0;
        int tailCount=0;
        float headPercent;
        float tailPercent;

        Flip_Coin coin=new Flip_Coin();
        Scanner scanner=new Scanner(System.in);

        System.out.print("enter The number of times to Flip Coin \n n = ");
        n=scanner.nextInt();
        while (n<0){
            System.out.println("enter positive integer");
            n=scanner.nextInt();
        }
        System.out.println("flipping coin "+n+" times");
        for (int i = 0; i < n; i++) {
            int result = coin.flipCoin();
            if (result == 1) {
                headCount = headCount + 1;
            } else {
                tailCount = tailCount + 1;
            }
        }
        headPercent=((float) headCount*100/n);
        tailPercent=((float) tailCount*100/n);

        System.out.println("head count = "+headCount+ ", tail count = "+tailCount);
        System.out.println("Percentage of Head = "+headPercent);
        System.out.println("Percentage of Tail = "+tailPercent);
    }

    int flipCoin(){
        Random random=new Random();
        int result=random.nextInt(2);
        return result;
    }
}
