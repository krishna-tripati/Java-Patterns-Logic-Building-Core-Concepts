package com.oop.VichecalRentSys;

public class Car extends VichecalInfo{

    private int fiverseater=1;
    private int sevenseater=2;


    // 1 day rent
    private double fiverseaterRent=1000;
    private double sevenseaterRent=1500;

    //press 1 --> check availability
    public void checkavailable(){
        if(fiverseater >0 && sevenseater > 0){
            System.out.println("Five seater and Seven seater both Vehicle are available --> book a Vehicle");
        }else if(fiverseater >0){
            System.out.println("Five Seater are available --> book a vehicle");
        }else if(sevenseater >0){
            System.out.println("Seven Seater are available --> book a vehicle");
        }else {
            System.out.println("Sorry!.. vehicle unavailable");
        }
    }

    //press 2 --> display rent
    public void dispalyrent(){
        System.out.println("Five seater 1 day rent: "+fiverseaterRent);
        System.out.println("Seven seater 1 day rent: "+sevenseaterRent);
    }

    //press 3--> for book
     // choice 4 and  5
    public void book(int choice , int day){
        if(choice==4 && fiverseater >0){
            double calrent= day * fiverseaterRent;
            fiverseater -=1;
            System.out.println("Total Rent: "+calrent);
            System.out.println("Successfully booked Five Seater .. enjoy trip");
        }else if(choice ==5 && sevenseater >0){
            double calrent= day*sevenseaterRent;
            sevenseater -=1;
            System.out.println("Total Rent: "+calrent);
            System.out.println("Successfully booked Seven Seater .. enjoy trip");
        }else {
            System.out.println("Vehicle unavailable");
        }


    }

}
