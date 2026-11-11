package com.oop.PaymentSys;

public class Netbanking extends Payments{
    private int userId;
    private String password;
    private int Balance=2000;

    public Netbanking(int userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public void pay(double amount) {

        if(Balance < amount){
            System.out.println("insufficient Balance");
        }else {
            System.out.println("payment successfully sended: "+amount);
            Balance -=amount;
            System.out.println("available balance: "+ Balance);
        }

    }


    public void refund(double amount) {

        Balance+=amount;
        System.out.println("Refund credited back to account: " +amount );
        System.out.println("available balance: "+ Balance);
    }

}
