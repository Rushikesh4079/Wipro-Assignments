package com.rushi.javaassignment;


import java.util.*;
import java.util.ArrayDeque;
import java.util.Deque;


public class LimitedChat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        Deque<String> chatHistory = new ArrayDeque<>();

        for (int i = 0; i < 6; i++) {
            System.out.print("Enter message " + (i + 1) + ": ");
            String message = scanner.nextLine();

            // If already 4 messages, remove oldest
            if (chatHistory.size() == 4) {
                chatHistory.removeFirst();
            }

            chatHistory.addLast(message);

            System.out.println("Current chat history: " + chatHistory);
        }

        scanner.close();

	}

}