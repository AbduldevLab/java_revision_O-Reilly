package com.abduldevlab.travelbooking;

import com.abduldevlab.travelbooking.domain.BusTicket;
import com.abduldevlab.travelbooking.domain.PlaneTicket;
import com.abduldevlab.travelbooking.domain.TrainTicket;
import com.abduldevlab.travelbooking.domain.TravelTicket;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.Scanner;

public class RegisterTravelTicket {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int option = 0;
        while (!(option >= 1 && option <= 3)) {
            System.out.println("Enter 1 for bus tikcet, 2 for train ticket or 3 for plane ticket");
            option = sc.nextInt();
        }

        System.out.print("Enter the booking ref: ");
        Long ref = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter the origin: ");
        String origin = sc.nextLine();

        System.out.print("Enter the destination: ");
        String destination = sc.nextLine();

        System.out.print("Enter the price: ");
        BigDecimal price = sc.nextBigDecimal();
        sc.nextLine();

        System.out.print("Enter the departure time: ");
        String dTime = sc.nextLine();
        LocalDateTime departureTime = LocalDateTime.parse(dTime);

        System.out.print("Enter the arrival time: ");
        String aTime = sc.nextLine();
        LocalDateTime arrivalTime = LocalDateTime.parse(aTime);

        switch (option) {
            case 1:
                BusTicket BusTicket = new BusTicket(ref, origin, destination, price, departureTime, arrivalTime, null);
                System.out.println(BusTicket);
                break;
            case 2:
                System.out.print("Enter your travel class: ");
                String tClass = sc.nextLine();
                //TravelClass travelClass = TravelClass.valueOf(tClass.toUpperCase();

                System.out.print("Enter the carriage number: ");
                int carriageNumber = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter the seat number: ");
                int seatNumber = sc.nextInt();
                sc.nextLine();

                //TravelTicket trainTicket = new TrainTicket(ref, origin, destination, price, departureTime, arrivalTime, carriageNumber, seatNumber);
                //System.out.println(trainTicket);
                break;
            case 3:
                System.out.print("Enter your travel class: ");
                String tClass2 = sc.nextLine();
                //TravelClass travelClass = TravelClass.valueOf(tClass.toUpperCase();

                System.out.print("Enter the number of stopovers: ");
                int stopOvers = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter the seat number: ");
                int seatNumber2 = sc.nextInt();
                sc.nextLine();

//                PlaneTicket planeTicket = new PlaneTicket(ref,origin,destination,price,departureTime,arrivalTime,seatNumber,stopOvers);
//                System.out.println(planeTicket);
                break;
        }

    }
}
