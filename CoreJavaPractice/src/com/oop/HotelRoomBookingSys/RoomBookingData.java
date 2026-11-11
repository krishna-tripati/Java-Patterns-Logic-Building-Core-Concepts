package com.oop.HotelRoomBookingSys;

public class RoomBookingData {
    private int bookingId;
    private Customer customer;
    private Room room;
    private int nights;
    private  double totalBill;

    public RoomBookingData(int bookingId, Customer customer, Room room, int nights, double totalBill) {
        this.bookingId = bookingId;
        this.customer = customer;
        this.room = room;
        this.nights = nights;
        this.totalBill = totalBill;
    }

    public int getBookingId() {
        return bookingId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Room getRoom() {
        return room;
    }

    public int getNights() {
        return nights;
    }

    public double getTotalBill() {
        return totalBill;
    }
}
