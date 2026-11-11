package com.oop.HotelRoomBookingSys;

public class DeluxeRoom extends Room{


    public DeluxeRoom(int roomId, int roomNumber, double pricePerNight, int countRoomAvailabile) {
        super(roomId, roomNumber, pricePerNight, countRoomAvailabile);
    }

    @Override
    double CalculateBookingPrice(int night) {
        return getPricePerNight()*night;
    }

    @Override
    void roomType() {
        System.out.println("Room Type: DeluxeRoom");
    }

    @Override
    void checkRoomAvailable() {
          if(getRoomAvailability() >0){
              System.out.println("DeluxeRoom Available "+getRoomAvailability() +" Rooms Available");
          }else {
              System.out.println("DeluxeRoom Unavailable");
          }
    }
}
