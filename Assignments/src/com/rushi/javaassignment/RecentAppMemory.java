package com.rushi.javaassignment;

import java.util.*;
import java.util.LinkedList;

public class RecentAppMemory {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        LinkedList<String> recentApps = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Open app " + (i + 1) + ": ");
            String app = scanner.nextLine();

            if (recentApps.contains(app)) {
                recentApps.remove(app);
            }

            recentApps.addFirst(app);

            System.out.println("Current Recent Apps: " + recentApps);
        }

        System.out.println("\nFinal Recent Apps: " + recentApps);

        scanner.close();

	}

}