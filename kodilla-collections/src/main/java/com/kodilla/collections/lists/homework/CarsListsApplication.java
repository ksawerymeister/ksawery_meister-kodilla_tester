package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;

import java.util.ArrayList;
import java.util.List;

public class CarsListsApplication {

    public static void main(String[] args) {

        ArrayList<Ford> fords = new ArrayList<>();

        fords.add(new Ford());
        fords.add(new Ford());
        fords.add(new Ford());

        Ford fordEscort = new Ford();
        fords.add(fordEscort);


        for (Ford ford :  fords){
            CarUtils.describeCar(ford);
        }

        fords.remove(1);

        fords.remove(fordEscort);

        for (Ford ford :  fords){
            CarUtils.describeCar(ford);
        }

        System.out.println(fords.size());



    }

}
