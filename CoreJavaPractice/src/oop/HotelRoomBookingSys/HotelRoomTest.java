package com.oop.HotelRoomBookingSys;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class HotelRoomTest {
    //customer data
  static ArrayList<Customer> customers=new ArrayList<>();
  static ArrayList<RoomBookingData> roomBookingData=new ArrayList<>();

    //find Customer by Id
    public static Customer customerFindById(int customerId, ArrayList<Customer> customers){
        for(Customer cust: customers){
            if(cust.getCustomerId()==customerId){
                return cust;
            }
        }
        return null;
    }

    //booking data
    public static void bookRoom(int custid, ArrayList<Customer> customers,
                                Room selctRoom, int nights, double totalBill){

        int bookingId=1;
       // roomBookingData.add(new RoomBookingData(bookingId,selctRoom,nights,totalBill));


    }





    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Room> rooms=new ArrayList<>();
        rooms.add(new StandardRoom(101,1,200,0));
        rooms.add(new DeluxeRoom(201,1,300,4));
        rooms.add(new SuiteRoom(301,1,400,5));

        //menu
        boolean breakmanu=true;
        while (breakmanu){
            System.out.println("Welcome to KT Hotel Room Booking ");
            System.out.println("Enter 1 for Register Customer ");
            System.out.println("Enter 2 for View Available Rooms ");
            System.out.println("Enter 3 for Book Room");
            System.out.println("Enter 4 for View All Bookings ");
            System.out.println("Enter 5 for Cancel Booking");
            System.out.println("Enter 6 for Exit");
            System.out.println();
            int selectOption=sc.nextInt();

            switch (selectOption){
                case 1:
                    System.out.println("Enter a Customer ID: ");
                    int custId=sc.nextInt();
                    System.out.println("Enter a Customer Name: ");
                    String custName=sc.nextLine();
                    System.out.println("Enter a Customer PhoneNumber ");
                    int custPhoneNo=sc.nextInt();
                    customers.add(new Customer(custId,custName,custPhoneNo));
                    System.out.println("Successfully Added Customer Data");
                    break;

                case 2:
                    System.out.println("View Available Rooms");
                    rooms.get(0).checkRoomAvailable();
                    System.out.println();
                    rooms.get(1).checkRoomAvailable();
                    System.out.println();
                    rooms.get(2).checkRoomAvailable();
                    System.out.println();
                    break;
                case 3:
                    System.out.println(" ---- Book a Room ---- ");
                    System.out.println("Enter a Customer ID: ");
                    int customerId=sc.nextInt();
                    Customer cust= customerFindById(customerId, customers);
                    //check customer exit
                    if(cust==null){
                        System.out.println("Customer Unavailable -- plz Customer Register");
                    }else {
                        //check Available Room
                        System.out.println("View Available Rooms");
                        rooms.get(0).checkRoomAvailable();
                        System.out.println();
                        rooms.get(1).checkRoomAvailable();
                        System.out.println();
                        rooms.get(2).checkRoomAvailable();
                        System.out.println();
                        System.out.println("Enter 1 for Standard Room");
                        System.out.println("Enter 2 for Deluxe Room");
                        System.out.println("Enter 3 for Suite Room");
                        int selectroom=sc.nextInt();
                        System.out.println("Enter number of nights: ");
                        int nights=sc.nextInt();


                        if(1==selectroom){
                           if(rooms.get(selectroom).getRoomAvailability()>0){
                               double totalbill= rooms.get(0).CalculateBookingPrice(nights);
                               bookRoom(customerId,customers,rooms.get(0),nights,totalbill);
                           }else {
                               rooms.get(0).checkRoomAvailable();
                           }

                        }
                        if(2==selectroom){
                            double totalbill= rooms.get(1).CalculateBookingPrice(nights);
                            bookRoom(customerId,customers,rooms.get(1),nights,totalbill);
                        }
                        if(3==selectroom){
                            double totalbill= rooms.get(2).CalculateBookingPrice(nights);
                            bookRoom(customerId,customers,rooms.get(2),nights,totalbill);
                        }


                    }




            }


        }



    }
}
