package com.rushi;


import java.util.Arrays;
import java.util.List;

public class Assignment9 {
	public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(9, 8, 7, 6, 5);
        nums.parallelStream().forEach(n -> System.out.println("Square: " + (n * n)));
    }
}