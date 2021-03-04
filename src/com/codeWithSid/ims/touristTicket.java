package com.codeWithSid.ims;

public class touristTicket extends ticket{

    private String  hotelAddress;
    private String[] selectedTouristLocation;

    public touristTicket(String PNRNumber, String departureLocation, String destinationLocation, String dateTimeOfDeparture,
                         String dateTimeOfArrival, String seatNo, float cost, boolean cancelled,
                         flight flight, passenger passenger, String specialServices, String[] strings) {
        super(PNRNumber, departureLocation, destinationLocation, dateTimeOfDeparture, dateTimeOfArrival, seatNo, cost, cancelled,
                flight, passenger);
        this.selectedTouristLocation = selectedTouristLocation;
    }


    public  String getHotelAddress()
    {
        return hotelAddress;
    }
    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getSelectedTouristLocation() {
        return selectedTouristLocation;
    }

    public void setSelectedTouristLocation(String[] selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
    }

    public String AddLocation()
    {
        return null;
    }
    public String RemoveLocation()
    {
        return null;
    }

}
