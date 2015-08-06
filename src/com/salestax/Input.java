package com.salestax;

import java.io.BufferedReader;


public class Input {

    BufferedReader bufferedReader;

    public Input(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    public String acceptInput() {
        String input = "";
        try {
            input = bufferedReader.readLine();
            return input;
        }
        catch (Exception e) {
        }
        return input;
    }
}
