package com.kodilla.collections.interfaces.homework;

import java.util.Random;

public class Ford implements Car {



    int currentSpeed = 0;

    @Override
    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }


    @Override
    public int getCurrentSpeed() {
        return currentSpeed;
    }

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
        Random random = new Random();
        increaseSpeed(random.nextInt(51) + 50);
        increaseSpeed(random.nextInt(51) + 50);
        decreaseSpeed(random.nextInt(81));
        increaseSpeed(random.nextInt(51) + 50);
        decreaseSpeed(random.nextInt(81));
        System.out.println("Current speed of Ford is: " + getCurrentSpeed());
    }
}
