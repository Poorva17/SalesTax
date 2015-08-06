package com.salestax;

public class Parser {
    Item item;

    public Item parseInput(String inputItem) {
        String[] lexems = inputItem.split(" ");
        int quantity = Integer.parseInt(lexems[0]);
        String type = "";
        double price = 0.0;

        for (int i = 1; i< lexems.length; i++) {
            if (lexems[i].equalsIgnoreCase("at")) {
                for (int j = 1 ; j < i; j++) {
                    type += lexems[j];
                    type += " ";
                }
                price = Double.parseDouble(lexems[i+1]);
            }
        }
        this.item = new Item(quantity, type, price);
        return item;
    }
}
