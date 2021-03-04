package com.codeWithSid.ims;

public class regularTicket extends ticket {

    private String specialService;


    public regularTicket(String PNRNumber, String departureLocation, String destinationLocation, String dateTimeOfDeparture,
                         String dateTimeOfArrival, String seatNo, float cost, boolean cancelled,
                         Flight flight, Passenger passenger, String specialServices) {
        super(PNRNumber, departureLocation, destinationLocation, dateTimeOfDeparture, dateTimeOfArrival, seatNo, cost, cancelled,
                flight, passenger);
        this.specialServices = specialServices;
    }


    public String specialServicesAvailed(int id)
    {
        return specialServices;
    }

    public void  updateSpecialServices(String specialService)
    {
        this.specialServices = specialServices;
    }
}
