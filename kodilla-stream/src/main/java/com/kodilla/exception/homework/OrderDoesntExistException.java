package com.kodilla.exception.homework;

public class OrderDoesntExistException extends Exception {

    public static String ORDER_DOES_NOT_EXIST = "Order doesn't exist";

    public OrderDoesntExistException(String message) {
        super(message);
    }
}
