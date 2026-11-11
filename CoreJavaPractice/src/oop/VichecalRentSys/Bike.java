package com.oop.VichecalRentSys;

public class Bike extends VichecalInfo{

    private int lowpowerengine=1;
    private int strongpowerengine=1;

    private double lowEngineRent=500;
    private double strongeEngineRent=800;


    //press 1 for check available
    public void checkavailable(){
        if(lowpowerengine > 0 && strongpowerengine >0){
            System.out.println(" Lower power Engine and Strong power Engine are available--> BooK a Bike");
        }else if(lowpowerengine > 0){
            System.out.println("Lower power Engine are Available --> Book a Bike");
        }else if(strongpowerengine > 0){
            System.out.println("Strong Power Engine are Available --> Book a Bike");
        }else {
             System.out.println("sorry!... Unavailable ");
        }


    }

    //press 2 for rent card
    public void displayRent(){
        System.out.println(" Low Engine Bike 1 day rent: "+lowEngineRent);
        System.out.println("Strong Engine Bike 1 day rent: "+strongeEngineRent);
    }

    //press 3 for book a bike
      //press 4 for low enine and 5 for strong engine
    public void book(int choice, int days){
        if(choice ==4 && lowpowerengine >0){
            double rent= lowEngineRent *days;
            lowpowerengine -=1;
            System.out.println("Total Rent : "+rent);
            System.out.println("successfully booked a Bike..enjoy trip");
        } else if (choice ==5 && strongpowerengine >0) {
            double rent= strongeEngineRent *days;
            strongpowerengine -=1;
            System.out.println("Total Rent: "+rent);
            System.out.println("successfully booked a Bike..enjoy trip");
        }else {
            System.out.println("Vehicle unavailable");

        }


    }
}

