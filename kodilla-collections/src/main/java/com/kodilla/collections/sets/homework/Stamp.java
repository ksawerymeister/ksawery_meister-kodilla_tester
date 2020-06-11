package com.kodilla.collections.sets.homework;

public class Stamp {

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", isStamped=" + isStamped +
                '}';
    }

    private String name;
    private double height;
    private double width;
    private boolean isStamped;

    public Stamp(String name, double height,
                 double width, boolean isStamped) {
        this.name = name;
        this.height = height;
        this.width = width;
        this.isStamped = isStamped;
    }
}
