package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {

        Car ford = new Ford();
        Car audi = new Audi();
        Car skoda = new Skoda();

        ford.doRace(ford);
        audi.doRace(audi);
        skoda.doRace(skoda);
    }
}
