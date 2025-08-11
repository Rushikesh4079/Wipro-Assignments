package com.rushi.javaassignment;

import java.util.*;
public class AvgConfusion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;

        // Take input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();

            if (numbers[i] < 10) {
                numbers[i] = numbers[i] * 2;
            }

            sum += numbers[i];
        }

        double average = sum / 5.0;
        System.out.println("The average is: " + average);

        scanner.close();
    }

}