package com.oop.HotelRoomBookingSys;

public class SuiteRoom extends Room{


    public SuiteRoom(int roomId, int roomNumber, double pricePerNight, int countRoomAvailabile) {
        super(roomId, roomNumber, pricePerNight, countRoomAvailabile);
    }

    @Override
    double CalculateBookingPrice(int night) {
        return getPricePerNight()*night;
    }

    @Override
    void roomType() {
        System.out.println("Room Type:Suite Room");

    }

    @Override
    void checkRoomAvailable() {
        if(getRoomAvailability() >0){
            System.out.println("SuiteRoom Available: "+getRoomAvailability() +" Rooms Available");
        }else {
            System.out.println("SuiteRoom Unavailable");
        }
    }
}
