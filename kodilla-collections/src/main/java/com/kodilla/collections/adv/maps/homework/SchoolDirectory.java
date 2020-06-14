package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {

    public static void main(String[] args) {

        Principal principal1 = new Principal("Henryk", "Michalski");
        Principal principal2 = new Principal("Mirosław", "Kuleta");
        Principal principal3 = new Principal("Ewa", "Kowalska");

        School school1 = new School("Chrobry");

        school1.addClass(23);
        school1.addClass(32);
        school1.addClass(24);

        School school2 = new School("Gimbaza");

        school2.addClass(21);
        school2.addClass(22);
        school2.addClass(23);

        School school3 = new School("Podstawówka");

        Map<School, Principal> mapOfSchools = new HashMap<>();
        mapOfSchools.put(school1, principal1);
        mapOfSchools.put(school2, principal2);
        mapOfSchools.put(school3, principal3);


        for (Map.Entry<School, Principal> school : mapOfSchools.entrySet()){

            if (!school.getKey().getNumberOfStudents().isEmpty())
                System.out.println("Principal: " + school.getValue().toString() +
                        " school: " + school.getKey().getNameOfSchool() +
                        " number of students: " + school.getKey().studentsQuantity());

        }




    }


}
