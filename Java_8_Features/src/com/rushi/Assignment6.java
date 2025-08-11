package com.rushi;

import java.util.Arrays;
import java.util.List;

public class Assignment6 {
	public static void main(String[] args) {
        List<String> names = Arrays.asList("Rushi", "Sanket", "Atharav", "Siddharth");
        long count = names.stream()
                          .filter(name -> name.length() > 5)
                          .count();
        System.out.println("Names longer than 5 chars: " + count);
    }
}