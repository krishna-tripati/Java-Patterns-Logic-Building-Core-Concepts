package com.oop.PaymentSys;

import java.util.ArrayList;

public class PaymentsTest {
    public static void main(String[] args) {

        ArrayList<Payments> payments=new ArrayList<>();
        payments.add(new CreditCard(101,"krishna","123456"));
       payments.add(new Netbanking(201,"4123"));
        payments.add(new UPIBanking(301,"987456"));

        for(Payments pay: payments){
            pay.pay(100);
        }

    }
}
