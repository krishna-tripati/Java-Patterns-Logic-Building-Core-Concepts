package com.oop.PaymentSys;

public class CreditCard extends Payments {
    private int cardNO;
    private String holdername;
    private String password;
    private double Balance=5000;

    public CreditCard(int cardNO, String holdername, String password) {
        this.cardNO = cardNO;
        this.holdername = holdername;
        this.password=password;
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
