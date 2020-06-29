package com.kodilla.stream;

import java.util.ArrayList;
import java.util.List;

public class UsersRepository {
    public static List<User> getUsersList() {
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50, 7, "Chemist"));
        users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        users.add(new User("Tuco", 30, 100, "Manager"));
        users.add(new User("Gus", 59, 7, "Board"));
        users.add(new User("Gale", 40, 666, "Chemist"));
        users.add(new User("Mike", 50, 7, "Security"));

        return users;
    }


}
