package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void findFlightsFromTest(){
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> expectedFlights = flightFinder.findFlightsFrom("Londyn");
        //then
        assertEquals(2, expectedFlights.size());
    }
    @Test
    public void findFlightsToTest(){
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> expectedFlights = flightFinder.findFlightsTo("Warszawa");
        //then
        assertEquals(3, expectedFlights.size());

    }
}