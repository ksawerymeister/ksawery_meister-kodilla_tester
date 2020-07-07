package com.kodilla.exception.homework;

import org.junit.Test;

import static junit.framework.Assert.*;


public class WarehouseTestSuite {

    @Test(expected = OrderDoesntExistException.class)
    public void isExceptionThrownTest() throws OrderDoesntExistException {

        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        //when
        Order orderToCheck = warehouse.getOrder("2");
        //then
        assertNotNull(warehouse.getOrder("1"));
        assertNull(orderToCheck);

    }


}