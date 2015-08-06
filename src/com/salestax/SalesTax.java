package com.salestax;


public class SalesTax {
    View view;
    Input input;
    Parser parser;

    public SalesTax(View view, Input input, Parser parser) {
        this.view = view;
        this.input = input;
        this.parser = parser;
    }

    public void start() {
        view.printMessage("Enter Items Purchased: (Enter Quit to get the bill)\n");

        while (true) {
            String inputItem = input.acceptInput();
            if (inputItem.equalsIgnoreCase("quit"))
                break;
            view.printMessage(parser.parseInput(inputItem).toString());
            view.printMessage("\nEnter Next Item:\n");
        }
    }
}
