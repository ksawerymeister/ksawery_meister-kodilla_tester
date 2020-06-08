package com.kodilla.collections.arrays.homework;


import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Skoda;

public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println("-----------");
        System.out.println("Car name: " + getCarName(car));
        System.out.println("Current speed: " + car.getCurrentSpeed());
    }

    private static String getCarName(Car car){
        if (car instanceof Audi)
            return "Audi";
        else if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Skoda)
            return "Skoda";
        else
            return "Unknown cars name";
    }


}
