package com.oop.RideBookingSys;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RideBookingTest {

    //booking data store
     static  List<BookingData> bookingData=new ArrayList<>();

     //check customor exit or not
    public static Customer checkCustomerExits(int custId, List<Customer> customers){
        for(Customer c: customers){
            if(c.getCustId()==custId){
                return c;
            }
        }
      return null;
    }

   // check booking data available or not using booking id
     public static BookingData checkBookingDatabyId(int BId, List<BookingData> bookingData){
        for(BookingData dataById: bookingData){
            if(dataById.getBookingId()==BId){
                return dataById;
            }
        }
        return null;
     }



    public static void addBookingData(int custId, List<Customer> customers, Ride selectRide, String Pickup ,
         String destination,int rideDistance, double totalFare ){

          int bookingId=0;
        Customer cust=checkCustomerExits(custId,customers);

        if(cust==null){
            System.out.println("Customer unavailable ");
        }

          bookingData.add(new BookingData(bookingId,selectRide,Pickup,destination,rideDistance,cust,totalFare));


          //view booking
        System.out.println("Riding Data");
        System.out.println("Booking ID: "+bookingId);
        System.out.println("Customer ID: "+custId);
        System.out.println("Customer Name: "+cust.getCustName());
        System.out.println("Customer Phone no: "+cust.getCustPhoneNo());
        System.out.println("Pickup: "+Pickup);
        System.out.println("Destination: "+destination);
        System.out.println("Distance: "+rideDistance);
        System.out.println("Total Fare: "+totalFare);

        System.out.println("Thank you for Booking Riding");

        bookingId++;
    }

    //view all booking data
    public static void viewAllBooking(){
        if(bookingData.isEmpty()){
            System.out.println("Data Unavailable ");

        }else {
            for(BookingData data: bookingData){
                System.out.println("Booking ID: "+data.getBookingId());
                System.out.println("Customer ID: "+data.getCustomerData().getCustId());
                System.out.println("Customer Name: "+data.getCustomerData().getCustName());
                System.out.println("Customer Phone NO: "+data.getCustomerData().getCustPhoneNo());
                  data.getSelectRideData().displayRiderType();
                System.out.println("Customer pickup: "+data.getPickUpData());
                System.out.println("Customer Destination: "+data.getDestinationData());
                System.out.println("Total Distance: "+data.getRideDistanceData());
                System.out.println("Total Fare: "+data.getTotalFareData());
            }

        }

    }

    //Cancelling booking
    public static void CancelRide(int bookingId){
        BookingData data= checkBookingDatabyId(bookingId,bookingData);

        if(data==null){
            System.out.println(bookingId+" is not available ");
        }else {
            bookingData.remove(data);
            System.out.println("Ride Cancel Successfully");
        }

    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       ArrayList<Customer> customers=new ArrayList<>();
       ArrayList<Ride> ride=new ArrayList<>();
       ride.add(new BikeRide(101, 50,10));
       ride.add(new CarRide(201,100,15));
       ride.add(new PremiumRide(301,200,20));


       boolean isBraek=true;
       while (isBraek){
           System.out.println("KT RIDE BOOKING");
           System.out.println("Enter 1 for Register Customer");
           System.out.println("Enter 2 for Book Ride");
           System.out.println("Enter 3 for View All Bookings");
           System.out.println("Enter 4 for Cancel Booking");
           System.out.println("Enter 5 for Exit");
           int selectmanu= sc.nextInt();
           switch (selectmanu){
               case 1:
                   System.out.println("Enter a Customer Data");
                   System.out.println("Enter a Customer ID: ");
                    int custID=sc.nextInt();
                    sc.nextLine();
                   System.out.println("Enter a Customer Name: ");
                   String custName=sc.nextLine();
                   System.out.println("Enter a Customer Phone Number: ");
                   int custPhoneNo=sc.nextInt();
                   customers.add(new Customer(custID,custName,custPhoneNo));
                   System.out.println("Successfully Added Customer Data");
                   break;

               case 2:
                       //customer id
                   System.out.println("Enter Customer ID: ");
                   int custId=sc.nextInt();

                   Customer cust=checkCustomerExits(custId,customers);

                   if(cust==null){
                       System.out.println("Customer unavailable ");
                   }else {

                       //select ride
                       System.out.println(" -- Select a Ride -- ");
                       System.out.println("Enter 1 for Bike Ride ");
                       System.out.println("Enter 2 for Car Ride ");
                       System.out.println("Enter 3 for Premium Ride ");
                       int selctRide=sc.nextInt();
                       sc.nextLine();

                       System.out.println("Enter Pickup point");
                       String pickUp=sc.nextLine();
                       System.out.println("Enter Destination ");
                       String distinatoion=sc.nextLine();
                       System.out.println("Enter a Distance");
                       int rideDistance=sc.nextInt();


                       if(selctRide ==1){
                           double totalBikeFare =ride.get(0).calculateFare(rideDistance);
                           addBookingData(custId,customers,ride.get(0),pickUp,distinatoion,rideDistance,totalBikeFare);

                       }

                       if (selctRide == 2){
                           double totalCarFare=ride.get(1).calculateFare(rideDistance);
                           addBookingData(custId,customers,ride.get(1),pickUp,distinatoion,rideDistance, totalCarFare);
                       }

                       if(selctRide ==3){
                           double totalPremiumFare=ride.get(2).calculateFare(rideDistance);
                           addBookingData(custId,customers,ride.get(2),pickUp,distinatoion,rideDistance,totalPremiumFare);
                       }
                   }
                break;
               case 3:
                   viewAllBooking();
                   break;

               case 4:
                   System.out.println("Cancelling Ride");
                   System.out.println("Enter booking Id");
                   int bid=sc.nextInt();
                   CancelRide(bid);
                   break;
               case 5:
                   System.out.println("Thank you for visiting ");
                   isBraek=false;
                   break;
               default:
                   System.out.println("Invalid number --- > Enter 1 to 5");
                   break;
           }
       }


    }
}
