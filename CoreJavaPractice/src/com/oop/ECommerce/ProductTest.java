package com.oop.ECommerce;

import java.util.ArrayList;

public class ProductTest {
    public static void main(String[] args) {
        ArrayList<Product> products=new ArrayList<>();

       products.add(new ElectronicsProduct(101,"TV",20000, "5 years"));
       products.add(new ElectronicsProduct(102,"vivo v10",10000, "5 years"));
       products.add(new GroceryProduct(103,"amual milk",30,"5 days"));
       products.add(new ClothProduct(104,"Tshairt",500,"S,M,L"));

       for(Product product: products){
           product.displayProduct();
       }


    }
}
