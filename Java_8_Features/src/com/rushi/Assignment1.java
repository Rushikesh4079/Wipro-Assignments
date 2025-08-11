package com.rushi;
import java.util.Arrays;
import java.util.List;

public class Assignment1 {

	public static void main(String[] args) {
	        List<String> names = Arrays.asList("Ronaldo", "Messi", "Neymar", "Devid", "Pele");
	        names.sort((a, b) -> a.compareTo(b));
	        System.out.println("Sorted Names: " + names);
	    }
}