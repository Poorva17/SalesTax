package com.salestax;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EntryPoint {
    public static void main(String[] args) {
        View view = new View();
        Input input = new Input(new BufferedReader(new InputStreamReader(System.in)));
        SalesTax salesTax = new SalesTax(view, input);
        salesTax.start();
    }
}