package com.oop.RideBookingSys;

public abstract class Ride {

    private int rideId;
    private double baseFare;
    private double perKmRate;

    public Ride(int rideId, double baseFare, double perKmRate) {
        this.rideId = rideId;
        this.baseFare = baseFare;
        this.perKmRate = perKmRate;
    }

    public int getRideId() {
        return rideId;
    }

    public double getBaseFare() {
        return baseFare;
    }

    public double getPerKmRate() {
        return perKmRate;
    }

    abstract double calculateFare(int distance);
    abstract void displayRiderType();




}
