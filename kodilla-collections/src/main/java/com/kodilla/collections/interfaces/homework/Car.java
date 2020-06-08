package com.kodilla.collections.interfaces.homework;

public interface Car {

    void setCurrentSpeed(int currentSpeed);

    int getCurrentSpeed();

    void increaseSpeed(int value);

    void decreaseSpeed(int value);

    void doRace(Car car);
}
