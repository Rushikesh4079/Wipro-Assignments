package com.rushi;


interface Power {
    void turnOn();
    default void showStatus() {
        System.out.println("Power is ON");
    }
}

public class Assignment4 implements Power {
    public void turnOn() {
        System.out.println("Turning on...");
    }

    public static void main(String[] args) {
        Power p = new Assignment4();
        p.turnOn();
        p.showStatus();
    }
}