package com.oop.VichecalRentSys;

public class Truck extends VichecalInfo{

    private int twentyton=1;
    private int fourtyton=2;

    //1 day rent
    private double twentytonRent=10000;
    private double fourtytonRent=25000;

   // press 1 for ==>check availabilty
    public void checkavailable(){
        if(twentyton >0 && fourtyton >0){
            System.out.println("Mini and big both truck are available..book Truck");
        }else if(twentyton >0){
            System.out.println("Min Truck are available... book Truck");
        }else if(fourtyton >0){
            System.out.println("big Truck are available... book Truck");
        }else {
            System.out.println("sorry!... Unavailable ");
        }
    }

    // press 2 for --> check 1 day rent
    public void dispalyonedayRent(){
        System.out.println("1 day mini Truck Rent (load capacity - Twenty Ton): "+twentytonRent);
        System.out.println("1 day big truck Rent (load capacity - fourty Ton): "+fourtytonRent);
    }

    // press 3 for --> book a tuck
     //  press 4 for mini truck || press 5 for big truck
    public void book(int choice ,int day){
        if(4==choice && twentyton >0){
           double calrent=  day*twentytonRent;
              twentyton -=1;
            System.out.println("Total Rent "+calrent);

            System.out.println("sucessfully book a Vehicle ..enjoy trip");
        }
        else if(5==choice && fourtyton> 0){
            double calrent= day*fourtytonRent;
             fourtyton -=1;
            System.out.println("Total rent: "+calrent);
            System.out.println("sucessfully book a vehicle..enjoy trip");

        }
        else {
             System.out.println("Vehicle unavailable");
         }


    }

}
