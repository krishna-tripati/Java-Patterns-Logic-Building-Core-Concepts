package com.oop.ECommerce;

public class GroceryProduct extends Product{
     String expiredate;

    public GroceryProduct(int pid, String pname, double pprice, String expiredate) {
        super(pid, pname, pprice, expiredate);
        this.expiredate=expiredate;
    }

    @Override
    void displayProduct() {
        System.out.println("Product Id: "+getPid());
        System.out.println("Product Name: "+getPname());
        System.out.println("Product Price: "+getPprice());
        System.out.println("Grocery: expire date: "+expiredate);
        System.out.println();

    }
}
