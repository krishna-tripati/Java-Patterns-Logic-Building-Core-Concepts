package com.oop.ECommerce;

public abstract class Product {
  private   int pid;
  private String pname;
  private double pprice;

    public Product(int pid, String pname, double pprice, String pwanranty) {
        this.pid = pid;
        this.pname = pname;
        this.pprice = pprice;

    }

    public int getPid() {
        return pid;
    }

    public String getPname() {
        return pname;
    }

    public double getPprice() {
        return pprice;
    }

    abstract void displayProduct();

}
