package com.company;

import java.util.Scanner;

public class ClockDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the time in seconds: ");

        int firstSeconds = scanner.nextInt();
        Clock firstClock = new Clock(firstSeconds);

        for (int i = 0; i < 10; i++) {
            firstClock.tick();
            System.out.println(firstClock);
        }

        System.out.println("Enter the time");
        System.out.print("Hour: ");
        int secondHours = scanner.nextInt();
        System.out.print("Minutes: ");
        int secondMinutes = scanner.nextInt();
        System.out.print("Seconds: ");
        int secondSeconds = scanner.nextInt();
        Clock secondClock = new Clock(secondHours, secondMinutes, secondSeconds);
        for (int i = 0; i < 10; i++) {
            secondClock.tickDown();
            System.out.println(secondClock);
        }

        System.out.println("First clock: " + firstClock);
        System.out.println("Second clock: " + secondClock);

        System.out.println("Sum: " + firstClock.addClock(secondClock));

        Clock thirdClock;
        thirdClock = firstClock.subtractClock(secondClock);
        System.out.println("Difference: " + thirdClock);
    }
}
