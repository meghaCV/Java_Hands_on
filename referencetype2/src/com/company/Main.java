package com.company;

public class Main {

    public static void main(String[] args) {

        StringBuilder myName = new StringBuilder("meghacv \"manasvin\" ");
        myName.setCharAt(4, 'x');

        System.out.println(myName);
    }
}
