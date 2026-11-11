package com.oop.HotelRoomBookingSys;

public abstract class Room {
    private int roomId;
    private int roomNumber;
    private double pricePerNight;
    private int countRoomAvailabile;

    public Room(int roomId, int roomNumber, double pricePerNight, int countRoomAvailabile) {
        this.roomId = roomId;
        this.roomNumber = roomNumber;
        this.pricePerNight = pricePerNight;
        this.countRoomAvailabile = countRoomAvailabile;
    }


    public int getRoomId() {
        return roomId;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public int getRoomAvailability() {
        return countRoomAvailabile;
    }

    abstract double CalculateBookingPrice(int night);
    abstract void roomType();
    abstract void checkRoomAvailable();
}
