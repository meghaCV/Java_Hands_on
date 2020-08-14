package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] numbers= {209,3,45,51,6,7,8};

        System.out.println(numbers.length);

		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.stream(numbers).sum());


    }
}
