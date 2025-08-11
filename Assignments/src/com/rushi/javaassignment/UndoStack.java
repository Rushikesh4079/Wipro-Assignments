package com.rushi.javaassignment;

import java.util.Scanner;
import java.util.Stack;

public class UndoStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Stack<String> commandStack = new Stack<>();

        System.out.println("Enter 3 commands:");
        for (int i = 0; i < 3; i++) {
            commandStack.push(sc.nextLine());
        }

        // Undo (pop last command)
        String undoneCommand = commandStack.pop();
        System.out.println("Undone command: " + undoneCommand);

        // Redo (push it back)
        commandStack.push(undoneCommand);

        System.out.println("Commands in stack now:");
        for (int i = commandStack.size() - 1; i >= 0; i--) {
            System.out.println(commandStack.get(i));
        }
	}
}