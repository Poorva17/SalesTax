package com.salestax;


public class SalesTax {
    View view;
    Input input;

    public SalesTax(View view, Input input) {
        this.view = view;
        this.input = input;
    }

    public void start() {
        view.printMessage("Enter Items Purchased: (Enter Quit to get the bill)\n");
        String inputItem = input.acceptInput();
        while (!inputItem.equalsIgnoreCase("quit")) {
            view.printMessage("Enter Next Item:\n");
            inputItem = input.acceptInput();
        }
    }
}
