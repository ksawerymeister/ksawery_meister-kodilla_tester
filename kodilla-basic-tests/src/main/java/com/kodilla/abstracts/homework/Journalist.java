package com.kodilla.abstracts.homework;

public class Journalist extends Job{

    public Journalist(int salary) {
        super(salary, "Writing articles");
    }

    @Override
    public void description() {
        System.out.println(getResponsibilities());
    }
}
