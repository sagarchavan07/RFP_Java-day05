package com.bridgelabz.basicCore;

import java.util.Scanner;

public class Leap_year {
    /*
    2. Leap Year
        a. I/P -> Year, ensure it is a 4 digit number.
        b. Logic -> Determine if it is a Leap Year.
        c. O/P -> Print the year is a Leap Year or not.
     */
    public static void main(String[] args) {
        int year=0;
        Scanner scanner=new Scanner(System.in);

        System.out.print("enter year : ");

        year = scanner.nextInt();
        while (year<999 || year>9999){
            System.out.print("Opps...year is not valid \nEnter 4 digit number for year : ");
            year = scanner.nextInt();
        }

        if ((year%2) == 0) {
            System.out.println(year+" is leap year");
        }else {
            System.out.println(year+" is not leap year");
        }

    }
}
