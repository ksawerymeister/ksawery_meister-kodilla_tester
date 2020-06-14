package com.kodilla.collections.adv.maps1.complex;

import java.util.HashMap;
import java.util.Map;

public class ComplexMapExample {

    public static void main(String[] args) {

        Map<Student, Grades> school = new HashMap<>();

        Student johnStevens = new Student("John", "Stevens");
        Student jessePinkman = new Student("Jesse", "Pinkman");
        Student wayneRooney = new Student("Wayne", "Rooney");

        Grades johnGrades = new Grades(4.5, 4.0, 3.5, 5.0);
        Grades jesseGrades = new Grades(5.0, 4.5, 3.5, 3.0);
        Grades wayneGrades = new Grades(3.5, 2.0, 5.5, 4.0);


        school.put(johnStevens, johnGrades);
        school.put(jessePinkman, jesseGrades);
        school.put(wayneRooney, wayneGrades);

        System.out.println(school.get(johnStevens));

            for (Map.Entry<Student, Grades> studentEntry : school.entrySet())

                System.out.println("Student: " + studentEntry.getKey().getFirstName() + " " +
                        studentEntry.getKey().getLastName() + ". Grades: " + studentEntry.getValue().getAverage());

    }
}
