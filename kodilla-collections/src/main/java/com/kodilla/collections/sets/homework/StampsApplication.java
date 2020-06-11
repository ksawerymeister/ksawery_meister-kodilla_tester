package com.kodilla.collections.sets.homework;

import java.util.HashSet;

public class StampsApplication {

    public static void main(String[] args) {

        HashSet<Stamp> stamps = new HashSet<>();

        Stamp stamp1 = new Stamp("Chopin", 3.5, 4, false);
        Stamp stamp2 = new Stamp("Duck", 3.5, 4, true);

        stamps.add(stamp1);
        stamps.add(stamp1);
        stamps.add(stamp2);
        stamps.add(stamp1);
        stamps.add(stamp2);
        stamps.add(stamp1);
        stamps.add(stamp2);

        for (Stamp stamp : stamps)
            System.out.println(stamp);

        System.out.println(stamps.size());

    }
}
