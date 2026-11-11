package com.oop.RideBookingSys;

public class PremiumRide extends Ride{


    public PremiumRide(int rideId, double baseFare, double perKmRate) {
        super(rideId, baseFare, perKmRate);
    }

    @Override
    double calculateFare(int distance) {
        return getBaseFare() + distance*getPerKmRate();
    }

    @Override
    void displayRiderType() {
        System.out.println("Rider Type: Premium Ride");
    }
}
