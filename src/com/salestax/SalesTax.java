package com.salestax;


public class SalesTax {
    View view;
    Input input;
    Parser parser;
    Item item;

    public SalesTax(View view, Input input, Parser parser, Item item) {
        this.view = view;
        this.input = input;
        this.parser = parser;
        this.item = item;
    }

    public void start() {
        view.printMessage("Enter Items Purchased: (Enter Quit to get the bill)\n");

        while (true) {
            String inputItem = input.acceptInput();
            if (inputItem.equalsIgnoreCase("quit"))
                break;

            this.item = (parser.parseInput(inputItem));
            item.calculateTax();
            view.printMessage(item.toString());
            view.printMessage("\nEnter Next Item:\n");
        }
    }
}
