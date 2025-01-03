package com.abduldevlab.travelbooking.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PlaneTicket that = (PlaneTicket) o;
        return Objects.equals(travelClass, that.travelClass) && Objects.equals(seatNumber, that.seatNumber) && Objects.equals(stopOvers, that.stopOvers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), travelClass, seatNumber, stopOvers);
    }

    @Override
    public String toString() {
        return "PlaneTicket{" +
                "travelClass=" + travelClass +
                ", seatNumber=" + seatNumber +
                ", stopOvers=" + stopOvers +
                '}';
    }
}
