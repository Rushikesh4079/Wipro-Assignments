package com.rushi.javaassignment;

import java.util.concurrent.*;

class Task {
    int id;
    String desc;

    Task(int id, String desc) {
        this.id = id;
        this.desc = desc;
    }

    public String toString() {
        return "Task#" + id + " - " + desc;
    }
}

public class StageBasedTaskRunner {
	public static void main(String[] args) {
        LinkedBlockingQueue<Task> stage1 = new LinkedBlockingQueue<>();
        LinkedBlockingQueue<Task> stage2 = new LinkedBlockingQueue<>();

        stage1.add(new Task(1, "Load"));
        stage1.add(new Task(2, "Parse"));
        stage1.add(new Task(3, "Validate"));
        stage1.add(new Task(4, "Save"));

        while (!stage1.isEmpty()) {
            Task task = stage1.poll();
            System.out.println("Stage 1: " + task);
            if (task.id % 2 == 0) {
                stage2.add(task);
            }
        }

        System.out.println("\nStage 2 Tasks:");
        for (Task t : stage2) {
            System.out.println("Stage 2: " + t);
        }
    }
}