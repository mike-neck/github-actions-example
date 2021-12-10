package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubTest {

    @Test
    void subFrom3With1Becomes2() {
        Sub sub = new Sub(3);
        int actual = sub.calculate(1);
        assertEquals(2, actual);
    }

    @Test
    void invalid() {
        Sub sub = new Sub(4);
        int actual = sub.calculate(1);
        assertEquals(2, actual);
    }
}
