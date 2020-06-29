package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {

    public static void main(String[] args) {

        double averagePostsHigher40 = UsersRepository.getUsersList().stream()
                .filter(n->n.getAge()>=40)
                .mapToDouble(User::getNumberOfPosts)
                .average()
                .getAsDouble();

        double averagePostsUnder40 = UsersRepository.getUsersList().stream()
                .filter(n->n.getAge()<40)
                .mapToDouble(User::getNumberOfPosts)
                .average()
                .getAsDouble();

        System.out.println(averagePostsHigher40);
        System.out.println(averagePostsUnder40);

    }

}
