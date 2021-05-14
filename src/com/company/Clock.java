package com.company;

public class Clock {

    private int house;
    private int minutes;
    private int seconds;

    // default constructor
    public Clock() {
        setHouse(12);
    }

    // constructor with 3 parameters
    public Clock(int house, int minutes, int seconds) {
        setHouse(house);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    // constructor with 1 parameter
    public Clock(int seconds) {
        setHouse((seconds / 3600) % 24);
        setMinutes((seconds % 3600) / 60);
        setSeconds((seconds % 3600) % 60);
    }

    //converted into the time value in hours, minutes, and seconds
    public void setClock(int seconds) {
        setHouse((seconds / 3600) % 24);
        setMinutes((seconds % 3600) / 60);
        setSeconds((seconds % 3600) % 60);

    }

    // increments the time stored by one second.
    public void tick() {
        setSeconds(getSeconds() + 1);
        setMinutes(getMinutes() + getSeconds() / 60);
        setSeconds(getSeconds() % 60);
        setHouse(getHouse() + getMinutes() / 60);
        setMinutes(getMinutes() % 60);
        setHouse(getHouse() % 24);
    }

    //adds the time presented parameter class for the time represented in the current class
    public Clock addClock(Clock clock) {
        int seconds = clock.getHouse() * 3600 + clock.getMinutes() * 60 + clock.getSeconds();
        int seconds1 = getHouse() * 3600 + getMinutes() * 60 + getSeconds();
        int tempSeconds = seconds + seconds1;
        Clock tempClock = new Clock(tempSeconds);
        return tempClock;
    }

    // decrements the time stored in an object by one second
    public void tickDown() {
        setSeconds(getSeconds() - 1);
        if (getSeconds() < 0) {
            setSeconds(getSeconds() + 60);
            setMinutes(getMinutes() - 1);
        }
        setSeconds(getSeconds() % 60);

        if (getMinutes() < 0) {
            setMinutes(getMinutes() + 60);
            setHouse(getHouse() - 1);
        }
        setMinutes(getMinutes() % 60);

        if (getHouse() < 0) {
            setHouse(getHouse() + 24);
        }
        setHouse(getHouse() % 24);

    }

    //returns the difference between the time represented in the current object
    public Clock subtractClock(Clock clock) {
        int seconds = clock.getHouse() * 3600 + clock.getMinutes() * 60 + clock.getSeconds();
        int seconds1 = getHouse() * 3600 + getMinutes() * 60 + getSeconds();
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
