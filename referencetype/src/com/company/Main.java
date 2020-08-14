package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        int a=5;
        int b=a;
         a=3;
        System.out.println(a);
        System.out.println(b);

        Point point1= new Point(24,2);
        System.out.println(point1);
        Point point2= point1;
        System.out.println(point2);
    }
}
