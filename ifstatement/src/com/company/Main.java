package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter the age:");
        Scanner scanner = new Scanner( System.in );
        int res = scanner.nextInt();
        System.out.println( "Age entered is : " + res );

        if (res > 5 && res <18) {
            System.out.println( "grade1 starts" );
        } else if (res < 5 && res >1) {
            System.out.println( "preschool time" );
        } else {
            System.out.println( "swedish education system" );
        }
    }
}