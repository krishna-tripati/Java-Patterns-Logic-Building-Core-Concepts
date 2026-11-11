package com.oop.ECommerce;

public class ElectronicsProduct extends Product{
      private String pwanranty;

    public ElectronicsProduct(int pid, String pname, double pprice, String pwanranty ) {
        super(pid, pname, pprice,pwanranty);
        this.pwanranty=pwanranty;
    }

    @Override
    void displayProduct() {
        System.out.println("Product Id: "+getPid());
        System.out.println("Product Name: "+getPname());
        System.out.println("Product Price: "+getPprice());
        System.out.println("Product Wanranty "+pwanranty);
        System.out.println();
    }


}
