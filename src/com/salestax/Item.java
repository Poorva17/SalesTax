package com.salestax;

public class Item {
    int quantity;
    String productName;
    Double price;

    public Item(int quantity, String productName, Double price) {
        this.quantity = quantity;
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product Item\n" +
                "quantity = " + quantity +
                "\nproductName = " + productName +
                "\nprice = " + price ;
    }
}
