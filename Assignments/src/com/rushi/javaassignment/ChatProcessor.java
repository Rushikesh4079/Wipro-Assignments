package com.rushi.javaassignment;
import java.util.concurrent.LinkedBlockingQueue;
public class ChatProcessor {
	
    public static void main(String[] args) {
    	
        LinkedBlockingQueue<String> chatQueue = new LinkedBlockingQueue<>();

        Thread producer = new Thread(() -> {
            int messageCount = 1;
            try {
                while (true) {
                    if (chatQueue.size() >= 5) {
                        System.out.println("Queue full (>5). Pausing adding...");
                        Thread.sleep(1000);
                    } else {
                        String message = "Message-" + messageCount++;
                        chatQueue.put(message);
                        System.out.println("Added: " + message);
                        Thread.sleep(500);
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    String message = chatQueue.take();
                    System.out.println("Processed: " + message);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}
