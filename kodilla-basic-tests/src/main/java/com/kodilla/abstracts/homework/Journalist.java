package com.kodilla.abstracts.homework;

public class Journalist extends Job{

    public Journalist() {
        super(5000, "Writing articles");
    }

    @Override
    public void description() {
        System.out.println(getResponsibilities());
    }
}
