package com.codeWithSid.ims;

public class flight {

    private int flightNo;
    private String airline;
    private int capacity;
    private int bookedSeats;

    public int getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(int flightNo) {
        this.flightNo = flightNo;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public String getFlightDetails()
    {
        return "Flight No: " + flightNo + ", Airline: " + airline +
                ", Capacity: " + capacity + ", Booked Seats: " + bookedSeats;


    }
    public boolean availability()
    {
        return bookedSeats < capacity;

    }
    public void updateBooking()
    {
        bookedSeats++;

    }




}
