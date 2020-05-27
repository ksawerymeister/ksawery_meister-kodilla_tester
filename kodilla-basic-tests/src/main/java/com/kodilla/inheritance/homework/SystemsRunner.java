package com.kodilla.inheritance.homework;

public class SystemsRunner {
    public static void main(String[] args) {

//        Windows windows95 = new Windows(1995);
//        MacOS macOS = new MacOS(2001);
//
        OperatingSystem operatingSystem = new Windows(2020);
        System.out.println(operatingSystem.turnOn());
        System.out.println(operatingSystem.turnOff());
         operatingSystem = new MacOS(2020);
        System.out.println(operatingSystem.turnOn());
        System.out.println(operatingSystem.turnOff());

    }
}
