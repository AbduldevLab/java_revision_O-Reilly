package com.abduldevlab.travelbooking.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PlaneTicket extends TravelTicket{

    private Integer travelClass;
    private Integer seatNumber;
    private Integer stopOvers;

    public PlaneTicket(){
        super();
    }
    public PlaneTicket(Long bookingRef, String origin, String destination, BigDecimal price, LocalDateTime departureTime, LocalDateTime arrivalTime, Integer travelClass, Integer seatNumber, Integer stopovers) {
        super(bookingRef, origin, destination, price, departureTime, arrivalTime);
        this.travelClass = travelClass;
        this.seatNumber = seatNumber;
        this.stopOvers = stopovers;
    }

    public Integer getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(Integer travelClass) {
        this.travelClass = travelClass;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Integer getStopovers() {
        return stopOvers;
    }

    public void setStopovers(Integer stopovers) {
        this.stopOvers = stopovers;
    }

    public void upgrade(){
        super.setPrice(getPrice().multiply(new BigDecimal(("2"))));
        System.out.println("you have been upgraded");
    }
    public void addStopOvers(){
        stopOvers++;
        System.out.println("You have " + stopOvers);
    }
}
