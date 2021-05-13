package com.company;


public class Main {

    public static void main(String[] args) {

        Clock clock = new Clock();
        System.out.println(clock.toString());
        Clock clock1 = new Clock(2, 18,15);
        System.out.println(clock1.toString());

        clock1.tick();
        System.out.println(clock1.toString());
    }
}
