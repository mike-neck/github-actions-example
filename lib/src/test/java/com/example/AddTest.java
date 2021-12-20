package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTest {

    @Test
    void add1With2Returns3() {
        Add add = new Add(1);
        int actual = add.calculate(2);
        assertEquals(3, actual, "1 + 2 = 3");
    }

    @Test
    void failedTest() {
        Add add = new Add(1);
        int actual = add.calculate(3);
        assertEquals(4, actual);
    }
}
