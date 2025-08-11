package com.rushi.javaassignment;
import java.util.ArrayDeque;


public class GroceryLineShuffle {
	public static void main(String[] args) {
        ArrayDeque<String> line = new ArrayDeque<>();
        addCustomer(line, "Ravi");
        addCustomer(line, "Meena");
        addCustomer(line, "John");
        addCustomer(line, "Alex");

        System.out.println("Grocery Queue: " + line);
    }

    static void addCustomer(ArrayDeque<String> line, String name) {
        if (name.length() % 2 == 0)
            line.addFirst(name);
        else
            line.addLast(name);
    }
}