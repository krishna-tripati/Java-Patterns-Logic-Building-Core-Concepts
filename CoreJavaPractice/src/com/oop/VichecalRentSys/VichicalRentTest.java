package com.oop.VichecalRentSys;

import java.util.Scanner;

public class VichicalRentTest {
    public static void main(String[] args) {
        System.out.println("Welcome to KT Rental Vehicle ");
        System.out.println("Press 1 for Truck Vehicle");
        System.out.println("Press 2 for car Vehicle");
        System.out.println("Press 3 for Bike Vehicle ");
        Scanner sc=new Scanner(System.in);
        int selectVihicle =sc.nextInt();

        Truck t=new Truck();
        Car c=new Car();
        Bike b=new Bike();

       if (1==selectVihicle){
           System.out.println("Enter 1 for check Truck Availabilty");
           System.out.println("Enter 2 for check Truck display rentcal card");
           System.out.println("enter 3 for book a Truck");
           System.out.println("enter 4 for exit");
           int selectfun=sc.nextInt();



               switch (selectfun){
                   case 1:
                       System.out.println("check Truck Availablity");
                       t.checkavailable();
                       break;

                   case 2:
                       System.out.println("Check 1 day Truck Rent");
                       t.dispalyonedayRent();
                       break;
                   case 3:
                       System.out.println("press 4 for MINI Truck and or press 5 for big Truck");
                       int choice=sc.nextInt();
                       System.out.println("enter days for rental");
                       int day=sc.nextInt();
                       t.book(choice,day);
                       break;
                   case 4:
                       System.out.println("exit...Thank you for visiting");
                       break;
                   default:
                       System.out.println("Invalid number ... Enter 1 to 4 number");

               }



       }
       else if(2==selectVihicle){
           System.out.println("Enter 1 for check Car Availabilty");
           System.out.println("Enter 2 for check Car Rental card");
           System.out.println("enter 3 for book a Car");
           System.out.println("enter 4 for exit");

           int selectfun=sc.nextInt();

           switch (selectfun){
               case 1:
                   System.out.println("check Car Available ");
                   c.checkavailable();
                   break;
               case 2:
                   System.out.println("check 1 day Car Rent card");
                   c.dispalyrent();
                   break;
               case 3:
                   System.out.println("Book a car");
                   System.out.println("Enter a 4 for Five seater and Enter 5 for Seven seater");
                   int newchoice=sc.nextInt();
                   System.out.println("Enter a days of Rent car");
                   int newday=sc.nextInt();
                   c.book(newchoice, newday);
                   break;
               case 4:
                   System.out.println("Exit...Thank you for visiting");
                   break;
               default:
                   System.out.println("Invalid .. enter correct number 1 to 4");
           }

       } else if (3==selectVihicle) {
           System.out.println("Enter 1 for check Bike Availabilty");
           System.out.println("Enter 2 for check Bike Rental card");
           System.out.println("enter 3 for book a Bike");
           System.out.println("enter 4 for exit");

           int selectfun=sc.nextInt();

           switch (selectfun){
               case 1:
                   System.out.println("check Bike Available");
                   b.checkavailable();
                   break;
               case 2:
                   System.out.println("Check 1 day Bike Rent card");
                   b.displayRent();
                   break;
               case 3:
                   System.out.println("Book a Bike");
                   System.out.println("Enter a 4 for Low Engine Bike or Enter a 5 for Strong Bike Engine ");
                   int newchoice=sc.nextInt();
                   System.out.println("Enter a days of Rent Bike");
                   int newday=sc.nextInt();
                   b.book(newchoice, newday);
                   break;
               case 4:
                   System.out.println("Exit..Thank you for visiting");
                   break;
               default:
                   System.out.println("Invalid .. enter correct number 1 to 4");

           }

       }


    }


}

