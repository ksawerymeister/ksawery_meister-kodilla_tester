package com.kodilla.abstracts.homework;

public class BusDriver extends Job {

    public BusDriver(int salary, String responsibilities) {
        super(4000, "Driving a bus");
    }

    @Override
    public void description() {
        System.out.println(getResponsibilities());
    }
}
