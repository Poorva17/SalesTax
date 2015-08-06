package com.salestax;

public class Item {
    int quantity;
    String productName;
    double price;
    double tax;
    double priceAfterTax;
    boolean isExempted;
    boolean isImported;


    public Item(int quantity, String productName, double price) {
        this.quantity = quantity;
        this.productName = productName;
        this.price = price;
        this.tax = 0.0;
        this.priceAfterTax = price;
        this.isExempted = false;
        this.isImported = false;
    }

    @Override
    public String toString() {
        return "Item \n" +
                "quantity = " + quantity +
                "\nproductName = " + productName+
                "\nprice = " + price +
                "\n tax = " + tax +
                "\npriceAfterTax = " + priceAfterTax;
    }

    public void calculateTax() {
        checkIsExempted();
        checkIsImported();

        if (isExempted) {
            if (isImported) {
                tax = 0.05 * price;
                priceAfterTax = price + tax;
            }
        }
        else if (!isExempted) {
            tax = 0.1 * price;
            priceAfterTax = price + tax;
            if (isImported) {
                tax = 0.05 * price;
                priceAfterTax = priceAfterTax + tax;
            }
        }
        else if (!isExempted && !isImported) {
            tax = 0.1 * price;
            priceAfterTax = price + tax;
        }
    }

    private void checkIsImported() {
        if (productName.contains("imported"))
            this.isImported = true;
    }

    private void checkIsExempted() {
        if ((productName.contains("book")) || (productName.contains("chocolate") || (productName.contains("pills")))) {
            this.isExempted = true;
        }
    }
}
