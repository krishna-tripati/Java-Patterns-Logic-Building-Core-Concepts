package com.oop.FoodDeliverySys;

public class FoodItem {

    private   String fooditem;
    private   int quantity;

    public FoodItem(String footitem, int quantity) {
        this.fooditem = footitem;
        this.quantity = quantity;
    }

    public String getFootitem() {
        return fooditem;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "footitem='" + fooditem + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
