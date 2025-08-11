package com.rushi.javaassignment;

import java.util.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class ReversedTaskQueue {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        LinkedList<String> tasks = new LinkedList<>();

        // Take 4 task inputs
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter task " + (i + 1) + ": ");
            String task = scanner.nextLine();

            if (task.endsWith("!")) {
                tasks.addFirst(task);
            } else {
                tasks.addLast(task);
            }
        }

        // Print tasks in reverse
        System.out.println("\nTasks in reverse order:");
        ListIterator<String> iterator = tasks.listIterator(tasks.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

        scanner.close();

	}

}