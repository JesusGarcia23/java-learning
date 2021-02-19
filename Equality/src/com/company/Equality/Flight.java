package com.company.Equality;

public class Flight {
    // other members elided for clarity
    private int flightNumber;
    private char flightClass;


    public Flight(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    @Override
    public boolean equals(Object o) {

        Flight other = (Flight) o;
        return
                flightNumber == other.flightNumber && flightClass == other.flightClass;
    }
}
