package com.codeWithSid.ims;

public class regularTicket extends ticket {

    private String specialService;


    public regularTicket(String PNRNumber, String departureLocation, String destinationLocation, String dateTimeOfDeparture,
                         String dateTimeOfArrival, String seatNo, float cost, boolean cancelled,
                         flight flight, passenger passenger, String specialServices) {
        super(PNRNumber, departureLocation, destinationLocation, dateTimeOfDeparture, dateTimeOfArrival, seatNo, cost, cancelled,
                flight, passenger);
        this.specialService = specialServices;
    }
    public String specialServicesAvailed(int id)
    {
        return specialService;
    }

    public void  updateSpecialServices(String specialService)
    {
        this.specialService = specialService;
    }
}
