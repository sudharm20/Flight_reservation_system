package com.codeWithSid.ims;
import java.time.LocalDateTime;
public abstract class ticket {


    private String PNRNumber;
    private String departureLocation;
    private String destinationLocation;
    private String dateTimeOfDeparture;
    private String dateTimeOfArrival;
    private String seatNo;
    private float cost;
    private Boolean cancelled;
    private  Flight flight;
    private  Passenger passenger;


    public ticket(String PNRNumber, String departureLocation, String destinationLocation, String dateTimeOfDeparture,
                  String dateTimeOfArrival, String seatNo, float cost, boolean cancelled,
                  Flight flight, Passenger passenger) {
        this.PNRNumber = PNRNumber;
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;
        this.dateTimeOfDeparture = dateTimeOfDeparture;
        this.dateTimeOfArrival = dateTimeOfArrival;
        this.seatNo = seatNo;
        this.cost = cost;
        this.cancelled = cancelled;
        this.flight = flight;
        this.passenger = passenger;
    }



    public String getPNRNumber() {
        return PNRNumber;
    }

    public void setPNRNumber(String PNRNumber) {
        this.PNRNumber = PNRNumber;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public String getDateTimeOfDeparture() {
        return dateTimeOfDeparture;
    }

    public void setDateTimeOfDeparture(String dateTimeOfDeparture) {
        this.dateTimeOfDeparture = dateTimeOfDeparture;
    }

    public String getDateTimeOfArrival() {
        return dateTimeOfArrival;
    }

    public void setDateTimeOfArrival(String dateTimeOfArrival) {
        this.dateTimeOfArrival = dateTimeOfArrival;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Boolean getCancelled() {
        return cancelled;
    }

    public void setCancelled(Boolean cancelled) {
        this.cancelled = cancelled;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public String checkStatus(boolean cancelled)
    {
        return cancelled ? "Cancelled" : "Confirmed";
    }
    public void cancellation()
    {
        cancelled = true;
    }
    public int getDuration() {
        LocalDateTime departureLocalDateTime = LocalDateTime.parse(dateTimeOfDeparture);
        LocalDateTime arrivalLocalDateTime = LocalDateTime.parse(dateTimeOfArrival);
        return (arrivalLocalDateTime.getDayOfMonth() - departureLocalDateTime.getDayOfMonth()) * 24 +
                (arrivalLocalDateTime.getHour() - departureLocalDateTime.getHour());
    }


}
