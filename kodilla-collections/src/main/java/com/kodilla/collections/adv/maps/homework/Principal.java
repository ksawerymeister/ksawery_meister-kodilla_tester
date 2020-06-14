package com.kodilla.collections.adv.maps.homework;

public class Principal {

    private String name;
    private String surname;

    public Principal(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Principal: " + name + " "  +
              surname;
    }
}
