package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Warehouse {

    public List<Order> orders = new ArrayList<>();


    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {

        return orders.stream()
                .filter(n -> n.getNumber().equals(number))
                .findFirst().orElseThrow(()-> new OrderDoesntExistException(OrderDoesntExistException.ORDER_DOES_NOT_EXIST));

    }

}
