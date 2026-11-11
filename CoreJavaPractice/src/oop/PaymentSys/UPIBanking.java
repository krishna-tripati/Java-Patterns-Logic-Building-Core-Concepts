package com.oop.PaymentSys;

public class UPIBanking extends Payments{
    private long UPIId;
    private String UPIpassword;
    int Balance=1000;

    public UPIBanking(long UPIId, String UPIpassword) {
        this.UPIId = UPIId;
        this.UPIpassword = UPIpassword;
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
