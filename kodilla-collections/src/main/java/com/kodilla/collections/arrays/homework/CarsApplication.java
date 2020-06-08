package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Skoda;

import java.util.Random;

public class CarsApplication {

    private static final Random random = new Random();


    public static void main(String[] args) {

        Car[] cars = carsArray();

        for(int i=0; i<cars.length; i++){
            cars[i] = drawCar();
        }

        for (Car car : cars){
            CarUtils.describeCar(car);
        }
    }


    private static Car[] carsArray() {

        int numberOfElements = random.nextInt(15) + 1;
        return new Car[numberOfElements];
    }


    public static Car drawCar() {
        Car car = randomCar();
        car.setCurrentSpeed(setRandomSpeed());
        return car;
    }

    private static int setRandomSpeed() {

        return random.nextInt(180) + 1;
    }

    private static Car randomCar() {

        int carsRandom = random.nextInt(3);

        if (carsRandom == 0)
            return new Audi();
        else if (carsRandom == 1)
            return new Ford();
        else
            return new Skoda();

    }

}
