package com.abduldevlab.travelbooking.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

//abstract == cannot be instantiated itself
public abstract class TravelTicket {
    private Long bookingRef;
    private String origin;
    private String destination;
    private BigDecimal price;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;

    //Default constructor
    public TravelTicket() {
    }

    public TravelTicket(Long bookingRef, String origin, String destination, BigDecimal price, LocalDateTime departureTime, LocalDateTime arrivalTime) {
        this.bookingRef = bookingRef;
        this.origin = origin;
        this.destination = destination;
        this.price = price;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public Long getBookingRef() {
        return bookingRef;
    }

    //protected can be seen and accessed only within same package!
    protected void setBookingRef(Long bookingRef) {
        this.bookingRef = bookingRef;
    }

    public String getOrigin() {
        return origin;
    }

    protected void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    protected void setDestination(String destination) {
        this.destination = destination;
    }

    public BigDecimal getPrice() {
        return price;
    }

    protected void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    protected void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    protected void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void reschedule(){
        System.out.println("I'm rescheduling the ticket");
    }
    public void cancel(){
        System.out.println("I'm cancelling the ticket");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TravelTicket that = (TravelTicket) o;
        return Objects.equals(bookingRef, that.bookingRef) && Objects.equals(origin, that.origin) && Objects.equals(destination, that.destination) && Objects.equals(price, that.price) && Objects.equals(departureTime, that.departureTime) && Objects.equals(arrivalTime, that.arrivalTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingRef, origin, destination, price, departureTime, arrivalTime);
    }

    @Override
    public String toString() {
        return "TravelTicket{" +
                "bookingRef=" + bookingRef +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", price=" + price +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                '}';
    }
}
