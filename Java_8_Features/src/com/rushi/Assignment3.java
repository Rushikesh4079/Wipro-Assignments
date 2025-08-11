package com.rushi;

interface MessagePrinter{
	void print(String message);
}

public class Assignment3 {
	public static void printMessage(MessagePrinter printer) {
        printer.print("Hello, Java!");
    }

    public static void main(String[] args) {
        printMessage(msg -> System.out.println(msg));
    }
}