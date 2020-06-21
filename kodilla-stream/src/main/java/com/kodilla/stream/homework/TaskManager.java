package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();

        List<LocalDate> upcomingDeadlines = new ArrayList<>();

        TaskRepository.getTasks()
                .stream()
                .filter(d -> d.getDeadline().isAfter(currentDate))
                .map(Task::getDeadline)
                .forEach(d -> upcomingDeadlines.add(d));

    }
}
