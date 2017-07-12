package edu.pdx.cs510J.linbin;

import edu.pdx.cs410J.AbstractAirline;

import java.util.ArrayList;

/**
 * Created by blin on 7/12/17.
 */
public class Airline extends AbstractAirline<Flight> {
    private final String name;
    private ArrayList<Flight> flights = new ArrayList<>();

    public Airline(String name) {
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void addFlight(Flight flight){
        flights.add(flight);
    }

    @Override
    public ArrayList<Flight> getFlights(){
        return flights;
    }
}
