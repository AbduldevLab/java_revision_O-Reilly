package com.abduldevlab.travelbooking;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RegisterTravelTicket {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int option = 0;
        while (!(option >= 1 && option <= 3)){
            System.out.println("Enter 1 for bus tikcet, 2 for train ticket or 3 for plane ticket");
            option = sc.nextInt();
        }
    }
}
