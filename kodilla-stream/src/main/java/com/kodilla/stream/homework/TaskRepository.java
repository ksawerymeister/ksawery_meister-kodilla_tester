package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    public static List<Task> getTasks(){
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Task 1", LocalDate.of(2020, 1, 1), LocalDate.of(2020, 2, 3)));
        tasks.add(new Task("Task 1", LocalDate.of(2020, 2, 1), LocalDate.of(2020, 3, 3)));
        tasks.add(new Task("Task 1", LocalDate.of(2020, 3, 1), LocalDate.of(2020, 7, 3)));
        tasks.add(new Task("Task 1", LocalDate.of(2020, 4, 1), LocalDate.of(2020, 8, 3)));

        return tasks;
    }


}
