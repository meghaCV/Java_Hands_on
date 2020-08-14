package com.company;

import java.text.DateFormat;
import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result = currency.format(45774657.0447);
        String resp = percent.format(34);
        String mc= NumberFormat.getCurrencyInstance().format(6785);
        System.out.println(result);
        System.out.println(resp);
        System.out.println(mc);
        DateFormat f = DateFormat.getDateInstance();
        String d = f.format(125);
        System.out.println(d);
    }
}
