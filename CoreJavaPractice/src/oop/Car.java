package com.oop;

// example of encapsulation hidding  property and function in single unit is call encapsulation
public class Car {
    private  String color;
    private  String brand="Maruti"; // unable to setmethod does not change any one after
    private  String model;
  private   int year= 2020; // unable to setmethod does not change any one after
    private  int speed;

    public void acclerate(int increament){
        speed += increament;

    }

    public void slow(int decreament){
        speed -= decreament;

    }

    // getter setter


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

//    public void setBrand(String brand) {
//        this.brand = brand;
//    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

//    public void setYear(int year) {
//        this.year = year;
//    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
