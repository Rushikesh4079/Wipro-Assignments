package com.rushi;


import java.util.Arrays;
import java.util.List;

public class Assignment11 {
	public static void main(String[] args) {
        List<String> names = Arrays.asList("Rushikesh", "Sai", "Ram", "AyushiS", "Nikita");
        names.sort((a, b) -> a.compareTo(b));
        System.out.println("Sorted Names: " + names);
    }
}