package com.kodilla.collections.interfaces.homework;

import java.util.Random;

public class Skoda implements Car {

    public int currentSpeed;

    @Override
    public void increaseSpeed(int value) {
        currentSpeed = currentSpeed + value;
    }

    @Override
    public void decreaseSpeed(int value) {
        currentSpeed = currentSpeed - value;
    }

    @Override
    public void doRace(Car car) {
        int value;
        Random random = new Random();
        increaseSpeed(value = random.nextInt(51)+50);
        increaseSpeed(value = random.nextInt(51)+50);
        decreaseSpeed(value = random.nextInt(81));
        increaseSpeed(value = random.nextInt(51)+50);
        decreaseSpeed(value = random.nextInt(81));
        System.out.println("Current speed of Skoda is: " + currentSpeed);
    }
}
