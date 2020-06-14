package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;

public class School {


    private String nameOfSchool;
    private ArrayList<Integer> numberOfStudents;
    private int studentsCounter;

    public School(String nameOfSchool) {
        this.nameOfSchool = nameOfSchool;
        this.numberOfStudents = new ArrayList<>();
    }

    public void addClass(int students) {
        numberOfStudents.add(students);

    }

    public int studentsQuantity() {

        int studentsCounter = 0;
        for (int i = 0; i < numberOfStudents.size(); i++) {
            studentsCounter += numberOfStudents.get(i);
        }
        return studentsCounter;
    }


    public String getNameOfSchool() {
        return nameOfSchool;
    }

    public ArrayList<Integer> getNumberOfStudents() {
        return numberOfStudents;
    }


}
