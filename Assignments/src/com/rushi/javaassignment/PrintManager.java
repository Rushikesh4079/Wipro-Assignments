package com.rushi.javaassignment;

import java.util.concurrent.ArrayBlockingQueue;

public class PrintManager {
    public static void main(String[] args) {
     
        ArrayBlockingQueue<String> printQueue = new ArrayBlockingQueue<>(3);

        addJob(printQueue, "Job1");
        addJob(printQueue, "Job2");
        addJob(printQueue, "Job3");

        addJob(printQueue, "Job4"); 

        while (!printQueue.isEmpty()) {
            String job = printQueue.poll();
            System.out.println("Printing: " + job);
        }
    }

    static void addJob(ArrayBlockingQueue<String> queue, String job) {
        if (!queue.offer(job)) {
            System.out.println("Queue full. Skipping: " + job);
        } else {
            System.out.println("Added: " + job);
        }
    }
}