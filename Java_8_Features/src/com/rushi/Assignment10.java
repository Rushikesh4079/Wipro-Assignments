package com.rushi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.*;

public class Assignment10 {
	public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram", "Christy", "Alex", "heera", "Devid");
        Map<String, Long> frequency = names.stream()
                                       			.collect(groupingBy(name -> name, counting()));
        System.out.println(frequency);
    }
}