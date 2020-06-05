package com.kodilla.inheritance.school;

public class Student {
//
//    private String name;
//    private Grades maths;
//    private Grades physics;
//    private Grades geography;
//    private Grades history;
//
//    public Student(String name) {
//        this.name = name;
//        this.maths = new Grades();
//        this.physics = new Grades();
//        this.geography = new Grades();
//        this.history = new Grades();
//    }
//
//    public void addMathGrade(int grade) {
//        if (grade > 0 && grade < 7) {
//            this.maths.add(grade);
//        }
//    }
//
//    public void addPhysicsGrade(int grade) {
//        if (grade > 0 && grade < 7) {
//            this.physics.add(grade);
//        }
//    }
//
//    public void addGeographyGrade(int grade) {
//        if (grade > 0 && grade < 7) {
//            this.geography.add(grade);
//        }
//    }
//
//    public void addHistoryGrade(int grade) {
//        if (grade > 0 && grade < 7) {
//            this.history.add(grade);
//        }
//    }
//
//    public double getMathsAverage() {
//        return this.maths.getAverage();
//    }
//
//    public double getPhysicsAverage() {
//        return this.physics.getAverage();
//    }
//
//    public double getGeographyAverage() {
//        return this.geography.getAverage();
//    }
//
//    public double getHistoryAverage() {
//        return this.history.getAverage();
//    }
//
//


    private String name;
    private Grades math;
    private Grades physics;
    private Grades geography;
    private Grades history;


    public Student(String name, Grades math,
                   Grades physics, Grades geography,
                   Grades history) {
        this.name = name;
        this.math = math;
        this.physics = physics;
        this.geography = geography;
        this.history = history;
    }


    public void addMathGrade(int grade) {

        if (grade > 0 && grade <= 6) {
            this.math.add(grade);
        }

    }

    public void addPhysicsGrade(int grade) {

        if (grade > 0 && grade <= 6) {
            this.physics.add(grade);
        }
    }

     public void addGeographyGrade(int grade){

        if(grade>0 && grade<7){
            this.geography.add(grade);

        }





    }


}
