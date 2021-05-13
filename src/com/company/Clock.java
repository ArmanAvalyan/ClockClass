package com.company;

public class Clock {

    private int house;
    private int minutes;
    private int seconds;

    public Clock() {
        setHouse(12);
    }

    public Clock(int house, int minutes, int seconds) {
        setHouse(house);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public Clock(int seconds) {
        setHouse((seconds / 3600) % 24);
        setMinutes((seconds % 3600) / 60);
        setSeconds((seconds % 3600) % 60);
    }

    public void setClock(int seconds) {
        setHouse((seconds / 3600) % 24);
        setMinutes((seconds % 3600) / 60);
        setSeconds((seconds % 3600) % 60);
    }

    public void tick() {
        setSeconds(getSeconds() + 1);
        setMinutes(getMinutes() + getSeconds() / 60);
        setSeconds(getSeconds() % 60);
        setHouse(getHouse() + getMinutes() / 60);
        setMinutes(getMinutes() % 60);
        setHouse(getHouse() % 24);
    }

    public Clock addClock(Clock clock) {
        Clock clock1 = new Clock(6, 7, 47);
        int seconds = clock.getHouse() * 3600 + clock.getMinutes() * 60 + clock.getSeconds();
        int seconds1 = clock1.getHouse() * 3600 + clock1.getMinutes() * 60 + clock1.getSeconds();
        int tempSeconds = seconds + seconds1;
        Clock tempClock = new Clock(tempSeconds);
        return tempClock;
    }

    public Clock subtractClock(Clock clock) {
        Clock clock1 = new Clock(3, 9, 50);
        int seconds = clock.getHouse() * 3600 + clock.getMinutes() * 60 + clock.getSeconds();
        int seconds1 = clock1.getHouse() * 3600 + clock1.getMinutes() * 60 + clock1.getSeconds();
        int tempSeconds = Math.abs(seconds - seconds1);
        Clock tempClock = new Clock(tempSeconds);
        return tempClock;
    }

    @Override
    public String toString() {
        return getHouse() + ":" + getMinutes() + ":" + getSeconds();
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
