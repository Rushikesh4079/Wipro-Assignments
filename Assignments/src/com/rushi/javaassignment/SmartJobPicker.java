package com.rushi.javaassignment;

import java.util.*;
import java.util.PriorityQueue;

class Job {
    String name;
    int urgency;

    public Job(String name, int urgency) {
        this.name = name;
        this.urgency = urgency;
    }

    @Override
    public String toString() {
        return name + " (Urgency: " + urgency + ")";
    }
}

public class SmartJobPicker {

	public static void main(String[] args) {
        PriorityQueue<Job> jobQueue = new PriorityQueue<>(
            Comparator.comparingInt((Job j) -> j.urgency)
                      .thenComparing(j -> j.name.length())
        );

        jobQueue.add(new Job("Fix", 2));
        jobQueue.add(new Job("Deploy", 1));
        jobQueue.add(new Job("Audit", 1));
        jobQueue.add(new Job("Build", 3));

        while (!jobQueue.isEmpty()) {
            System.out.println("Picked: " + jobQueue.poll());
        }
    }
}