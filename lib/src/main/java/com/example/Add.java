package com.example;

public class Add {

    private final int base;

    public Add(int base) {
        this.base = base;
    }

    public int calculate(int value) {
        return base + value;
    }
}
