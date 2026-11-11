package com.oop.HotelRoomBookingSys;

public class Customer {

    private int CustomerId;
    private String CustomerName;
    private int phooneNumber;

    public Customer(int customerId, String customerName, int phooneNumber) {
        CustomerId = customerId;
        CustomerName = customerName;
        this.phooneNumber = phooneNumber;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public int getPhooneNumber() {
        return phooneNumber;
    }
}
