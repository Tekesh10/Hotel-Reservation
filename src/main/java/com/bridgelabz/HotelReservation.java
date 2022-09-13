package com.bridgelabz;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.Optional;

public class HotelReservation {
    ArrayList<Hotels> hotelList = new ArrayList<>();
    public void addHotel() {
        Hotels hotel1 = new Hotels("Lake wood", 110);
        Hotels hotel2 = new Hotels("Bridge wood", 150);
        Hotels hotel3 = new Hotels("Ridge wood", 220);
        hotelList.add(hotel1);
        hotelList.add(hotel2);
        hotelList.add(hotel3);
    }
    public void cheapestHotel(String fromDate, String toDate) {
        LocalDate startDate = LocalDate.parse(fromDate, DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
        LocalDate endDate = LocalDate.parse(toDate, DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
        int numberOfDays = endDate.getDayOfMonth() - startDate.getDayOfMonth() + 1;
        Optional<Hotels> cheapestHotel = this.hotelList.stream().sorted(Comparator.comparing(Hotels::getRegularRates)).findFirst();
        Hotels hotel = new Hotels();
        hotel.setHotelName(cheapestHotel.get().getHotelName());
        hotel.setTotal(cheapestHotel.get().getRegularRates() * numberOfDays);
        System.out.println("HotelName -> " + hotel.getHotelName());
        System.out.println("TotalRate -> $" + hotel.getTotal());
    }
}