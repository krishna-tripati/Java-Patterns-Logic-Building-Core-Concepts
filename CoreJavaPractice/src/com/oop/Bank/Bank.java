package com.oop.Bank;

public class Bank {

    private long accountNumber;
    private String HolderName;
    private double Balance;

    public Bank(long accountnumber,String HolderName, double Balance){
        this.accountNumber=accountnumber;
        this.HolderName=HolderName;
        this.Balance=Balance;
    }
    public void deposit(double amount){

        if(amount <= 0){
            System.out.print("Deposite amount greater than 0");
            return;
        }
        Balance +=amount;
        System.out.println("deposited amount: "+amount);
        System.out.println("total Balance : "+Balance);
    }

    public void withdraw(double amount){
        if(amount <= 0){
            System.out.print("withdrwal amount must  greater than 0");
            return;
        }

        if(Balance < amount ){
            System.out.println("Insufficient amount");
        }
        Balance -= amount;
        System.out.println("withdraw amount: "+amount);
        System.out.println("total amount : " +Balance);

    }

    //check balance
    public double getBalance(){
        return Balance;
    }



}
