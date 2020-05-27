package com.kodilla.inheritance.homework;

public class MacOS extends OperatingSystem {

    public MacOS(int year) {
        super(year);
    }

    @Override
    public String turnOn() {
        return "MacOS System from " + super.getYear() + " turns on";
    }

    @Override
    public String turnOff() {
        return "MacOS System from " + super.getYear() + " turns off";
    }
}
