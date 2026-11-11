package com.oop.RideBookingSys;

public class Customer {
    private int custId;
    private String custName;
    private int custPhoneNo;

    public Customer(int custId, String custName, int custPhoneNo) {
        this.custId = custId;
        this.custName = custName;
        this.custPhoneNo = custPhoneNo;
    }

    public int getCustId() {
        return custId;
    }

    public String getCustName() {
        return custName;
    }

    public int getCustPhoneNo() {
        return custPhoneNo;
    }
}
