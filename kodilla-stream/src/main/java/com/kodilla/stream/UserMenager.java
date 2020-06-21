package com.kodilla.stream;

public class UserMenager {

    public static void main(String[] args) {

        UsersRepository.getUsersList()
                .stream()
                .map(u -> u.getUsername())
                .forEach(u -> System.out.println(u));


    }
}
