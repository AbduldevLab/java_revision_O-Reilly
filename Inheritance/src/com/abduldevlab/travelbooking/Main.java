package com.abduldevlab.travelbooking;

import com.abduldevlab.travelbooking.domain.BusTicket;
import com.abduldevlab.travelbooking.domain.PlaneTicket;
import com.abduldevlab.travelbooking.domain.TrainTicket;
import com.abduldevlab.travelbooking.domain.TravelTicket;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        TrainTicket trainTicket = new TrainTicket();

        trainTicket.cancel();
        //trainTicket.

        TrainTicket trainTicket2 = new TrainTicket(123L, "Dublin", "Limerick", new BigDecimal("29.00"),
                LocalDateTime.of(2024,10, 10, 16, 03),
                LocalDateTime.of(2024, 10, 10, 19, 03),
        1,3,42);
        trainTicket2.upgrade();

        String[] providers = {"First bus company", "Second bus company"};
        BusTicket busTicket = new BusTicket(124L, "Dublin", "Limerick", new BigDecimal("29.00"),
                LocalDateTime.of(2023,10, 10, 16, 03),
                LocalDateTime.of(2023, 10, 10, 19, 03),
                providers);

        trainTicket2.cancel();
        busTicket.cancel();

        //TravelTicket ticket = new TravelTicket();

        PlaneTicket planeTicket = new PlaneTicket();
        //planeTicket.setSeatNumber();
    }
}