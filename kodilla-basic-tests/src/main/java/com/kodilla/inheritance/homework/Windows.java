package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {

    public Windows(int year) {
        super(year);
    }

    @Override
    public String turnOn() {
        return "Windows System from " + super.getYear() + " turns on";
    }

    @Override
    public String turnOff() {
        return "Windows System from " + super.getYear() + " turns off";
    }
}
