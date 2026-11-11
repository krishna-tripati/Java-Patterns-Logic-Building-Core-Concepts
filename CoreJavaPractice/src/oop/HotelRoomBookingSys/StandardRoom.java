package com.oop.HotelRoomBookingSys;

public class StandardRoom extends Room{

    public StandardRoom(int roomId, int roomNumber, double pricePerNight, int countRoomAvailabile) {
        super(roomId, roomNumber, pricePerNight, countRoomAvailabile);
    }

    @Override
    double CalculateBookingPrice(int nights) {
        return getPricePerNight()*nights;
    }

    @Override
    void roomType() {
        System.out.println("Room Type: Standard Room");
    }

    @Override
    void checkRoomAvailable() {
       if(getRoomAvailability() >0){
           System.out.println("Standard Room Available "+getRoomAvailability() +" Rooms Available");
       }else {
           System.out.println("Standard Room Unavailable");
       }
    }


}
