package com.bridgelabz;

public class HotelReservationMain {
    public static void main(String[] args) {
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotel();
        System.out.println("Cheapest Hotel will be");
        hotelReservation.cheapestHotel("01-Oct-2022", "10-Oct-2022");
    }
}
