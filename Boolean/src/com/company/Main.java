package com.company;

public class Main {

    public static void main(String[] args) {
	boolean highestMarks= true;
	boolean aptitude= true;
	boolean advance=false;
	boolean admissionGranted=(highestMarks && aptitude) || advance;
        System.out.println(admissionGranted);
    }
}
