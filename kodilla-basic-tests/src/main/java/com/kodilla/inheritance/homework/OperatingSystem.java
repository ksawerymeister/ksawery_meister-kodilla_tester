package com.kodilla.inheritance.homework;

public class OperatingSystem {

    private int year;

    public OperatingSystem(int year) {
        this.year = year;
    }

    public String turnOn() {
        return "System from " + year + " turning on";
    }

    public String turnOff() {
        return "System from " + year + " turning off";
    }

    public int getYear() {
        return year;
    }
}
