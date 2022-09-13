package com.bridgelabz;
public class Hotels {
    String hotelName;
    int regularRates;
    int total;
    public Hotels(String hotelName,int regularRates) {
        this.hotelName = hotelName;
        this.regularRates = regularRates;
    }
    public Hotels() { super(); }
    public String getHotelName() { return hotelName; }
    public void setHotelName(String hotelName) { this.hotelName = hotelName; }
    public int getRegularRates() { return regularRates; }
    public int getTotal() { return total; }
    public void setTotal(int total) { this.total = total; }
    @Override
    public String toString() {
        return "HotelName -> '" + hotelName + "', regularRates -> '" + regularRates + "', total -> '" + total + "'";
    }
}