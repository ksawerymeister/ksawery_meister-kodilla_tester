package com.kodilla.collections.interfaces.homework;

import java.util.Random;

public class Ford implements Car {

    int currentSpeed = 0;

//    @Override
//    public int getSpeed() {
//        return 0;
//    }

    @Override
    public void increaseSpeed(int value) {

        currentSpeed = currentSpeed + value;
//        System.out.println("Ford is driving with " +
//                "the speed of " + currentSpeed);

    }

    @Override
    public void decreaseSpeed(int value) {
        
        currentSpeed = currentSpeed - value;
//        System.out.println("Ford is driving with " +
//                "the speed of " + currentSpeed);
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
        System.out.println("Current speed of Ford is: " + currentSpeed);
    }
}
