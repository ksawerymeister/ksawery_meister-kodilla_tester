package com.kodilla.abstracts.homework;

public class JobRunner {

    public static void main(String[] args) {

     BusDriver busDriver = new BusDriver(3000);

     Journalist journalist = new Journalist(100000);

     Person jacek = new Person("Jacek", 25, busDriver);

     jacek.getJob().description();

     jacek.setJob(journalist);
     jacek.getJob().description();
     
    }


}
