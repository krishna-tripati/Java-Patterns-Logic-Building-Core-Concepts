package com.oop.ECommerce;

public class ClothProduct extends Product{
       String size;

    public ClothProduct(int pid, String pname, double pprice, String size) {
        super(pid, pname, pprice, size);
        this.size=size;
    }

    @Override
    void displayProduct() {
        System.out.println("Product Id: "+getPid());
        System.out.println("Product Name: "+getPname());
        System.out.println("Product Price: "+getPprice());
        System.out.println("Cloth size: "+ size);
        System.out.println();

    }
}
