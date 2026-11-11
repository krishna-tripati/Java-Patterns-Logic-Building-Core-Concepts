package com.oop.RideBookingSys;

public class BookingData {
    private int bookingId;
    private Ride selectRideData;
    private   String pickUpData;
    private  String destinationData;
    private int rideDistanceData;
    private  Customer customerData;
    private double totalFareData;

    public BookingData( int bookingId,Ride selectRideData, String pickUpData, String destinationData,  int rideDistanceData, Customer customerData ,double totalFareData) {
        this.bookingId=bookingId;
        this.selectRideData = selectRideData;
        this.pickUpData = pickUpData;
        this.destinationData = destinationData;
        this.rideDistanceData = rideDistanceData;
       this.customerData = customerData;
        this.totalFareData = totalFareData;
    }

    public int getBookingId() {
        return bookingId;
    }

    public Ride getSelectRideData() {
        return selectRideData;
    }

    public String getPickUpData() {
        return pickUpData;
    }

    public String getDestinationData() {
        return destinationData;
    }

    public int getRideDistanceData() {
        return rideDistanceData;
    }

    public Customer getCustomerData() {
        return customerData;
    }

    public double getTotalFareData() {
        return totalFareData;
    }
}
