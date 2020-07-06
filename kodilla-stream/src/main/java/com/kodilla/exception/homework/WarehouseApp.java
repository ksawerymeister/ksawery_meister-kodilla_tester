package com.kodilla.exception.homework;

import java.util.List;

public class WarehouseApp {

    public static void main(String[] args) {


            Warehouse warehouse = new Warehouse();

            warehouse.orders.add(new Order("1"));
            warehouse.orders.add(new Order("2"));
            warehouse.orders.add(new Order("3"));
            warehouse.orders.add(new Order("4"));


        try {
            warehouse.getOrder("5");
        } catch (OrderDoesntExistException e) {
            System.out.println(OrderDoesntExistException.ORDER_DOES_NOT_EXIST);
        }
    }

}
