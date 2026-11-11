package com.oop.FoodDeliverySys;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer {

    public static void main(String[] args) {
        ArrayList<FoodItem> f=new ArrayList<>();

        Restaurant r=new Restaurant();
        Scanner sc=new Scanner(System.in);

        int selectchoice=0;

         while (selectchoice !=3){
             //main menu
             System.out.println("Enter 1 for Menu ");
             System.out.println("Enter 2 for Place order");
              selectchoice=sc.nextInt();

             switch (selectchoice){
                 case 1: r.menu();
                          break;
                 case 2:
                    // int selectmanuItem=0;
                       boolean isOrder=true;

                        while (isOrder){
                         // sub menu --- order placing
                         System.out.println("Enter 1 for Tandor 20rs");
                         System.out.println("Enter 2 for Chapatti 10rs");
                         System.out.println("Enter 3 for Palak Panner 200rs");
                         System.out.println("Enter 4 for Masala Panner 220rs");
                         System.out.println("Enter 5 for Jira Rice 80rs");
                         System.out.println("Enter 6 for Gulabjam 50rs");
                         System.out.println("Enter 7 for Cancel order");
                         System.out.println("Enter 8 for conform order");


                        int selectmanuItem=sc.nextInt();

                         switch (selectmanuItem){
                             case 1: System.out.println("Enter quantity for Tandor");
                                int quantity=sc.nextInt();

                                 if (quantity >0){
                                     f.add(new FoodItem("Tandor",quantity));
                                     r.PlaceOrder(r.getTandorprice(), quantity);
                                 }else {
                                     System.out.println("please provide Quantity above 0");
                                 }

                                 break;
                             case 2:
                                 System.out.println("Enter Quantity for Chapati");
                                 int Cquantity=sc.nextInt();
                                 f.add(new FoodItem("Chapatti",Cquantity));
                                 r.PlaceOrder(r.getChapatiprice(),Cquantity);
                                 break;
                             case 3:
                                 System.out.println("Enter Quantity for Palak Panner");
                                 int Pquantity=sc.nextInt();
                                 f.add(new FoodItem("Palak Panner",Pquantity));
                                 r.PlaceOrder(r.getPalakpannerprice(),Pquantity);
                                 break;
                             case 4:
                                 System.out.println("Enter Quantity for Masala Panner");
                                 int Mquantity=sc.nextInt();
                                 f.add(new FoodItem("Masala Panner",Mquantity));
                                 r.PlaceOrder(r.getMasalapannerprice(),Mquantity);
                                 break;
                             case 5:
                                 System.out.println("Enter Quantity for Jira Rice");
                                 int Jquantity=sc.nextInt();
                                 f.add(new FoodItem("Jira Rice",Jquantity));
                                 r.PlaceOrder(r.getRiceprice(),Jquantity);
                                 break;
                             case 6:
                                 System.out.println("Enter Quantity for Gulabjam");
                                 int Gquantity=sc.nextInt();
                                 f.add(new FoodItem("Gulabjam",Gquantity));
                                 r.PlaceOrder(r.getGulabjamprice(),Gquantity);
                                 break ;
                             case 7:
                                 r.CancelOrder();
                                 f.clear();
                                 System.out.println("Cancelled Order");
                                 isOrder=false;
                                 break;
                             case 8:
                                 System.out.println("Your Oder summary ");
                                 if(f.isEmpty()){
                                     System.out.println("No items in your Order");
                                 }else {
                                     for(FoodItem fooditems:f){
                                         System.out.println("--"+fooditems.getFootitem()+"  * "+fooditems.getQuantity());
                                     }
                                     System.out.println("---------------------------");
                                     System.out.println("Total pay: "+r.confrimOrder());
                                 }
                                 isOrder=false;
                                 break;
                             default:
                                 System.out.println("Invalid !.. Enter a number 1 to 8");
                                 break;
                         }

                     }
                     break;
                 default:
                     System.out.println("Invalid number ");

             }

         }



    }
}
