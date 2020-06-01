package com.kodilla.abstracts.homework;

public class BusDriver extends Job {

    public BusDriver(int salary) {
        super(salary, "Driving");
    }

    @Override
    public void description() {
        System.out.println(getResponsibilities());
    }
}
