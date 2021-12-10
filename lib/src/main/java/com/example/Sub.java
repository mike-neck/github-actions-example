package com.example;

public class Sub {
    private final int from;

    public Sub(int from) {
        this.from = from;
    }

    public int calculate(int value) {
        return from - value;
    }
}
