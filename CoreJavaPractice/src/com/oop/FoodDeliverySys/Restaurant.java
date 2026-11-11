package com.oop.FoodDeliverySys;

public class Restaurant {
    private double GST=3.25;
    private double deliveryCharge=20;

      //food Items
    private String tandor;
    private String Chapati;
    private String palakpanner;
    private String masalapanner;
    private String rice;
    private String gulabjam;


    //foot Items price
    private double tandorprice= 20;
    private double chapatiprice= 10;
    private double palakpannerprice=200;
    private double masalapannerprice=220;
    private double riceprice=80;
    private double gulabjamprice=50;

      //getting menu price


    public double getTandorprice() {
        return tandorprice;
    }

    public double getChapatiprice() {
        return chapatiprice;
    }

    public double getPalakpannerprice() {
        return palakpannerprice;
    }

    public double getMasalapannerprice() {
        return masalapannerprice;
    }

    public double getRiceprice() {
        return riceprice;
    }

    public double getGulabjamprice() {
        return gulabjamprice;
    }

    //foot Items menu
    public void menu(){
        System.out.println(" welcome to KT Restaurant ");
        System.out.println("Tandor : "+tandorprice +" RS");
        System.out.println("Chapati: "+chapatiprice +" RS");
        System.out.println("Palak Panner: "+palakpannerprice +" RS");
        System.out.println("Masala Panner: "+masalapannerprice +" RS");
        System.out.println("Jira Rice: "+riceprice +" RS");
        System.out.println("Gulabjam: "+gulabjamprice +" RS");

    }
         double order=0;
    //Place Order
    public void PlaceOrder(double selectItem, int quantity){
         order += selectItem*quantity;

    }
    //conform order
    public double confrimOrder(){
        double getamount=order *GST/100;
        return  getamount + deliveryCharge + order;
    }

    //Cancel order
    public void CancelOrder(){
        order=0;
    }

}
