package com.company;


public class Main {

    public static void main(String[] args) {

        Clock clock = new Clock(5, 8, 19);
        System.out.println(clock);
        System.out.println(clock.subtractClock(clock));
        System.out.println(clock.addClock(clock));
    }
}
