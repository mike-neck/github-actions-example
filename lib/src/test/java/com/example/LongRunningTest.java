package com.example;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;

import java.util.stream.IntStream;
import java.util.stream.Stream;

class LongRunningTest {

    static void waitMs(long tms) {
        try {
            Thread.sleep(tms);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @TestFactory
    Stream<DynamicTest> longRunningTests() {
        return IntStream.range(1, 100)
                .mapToLong(i -> i * 100L)
                .mapToObj(t ->
                        DynamicTest.dynamicTest(
                                String.format("takes %d ms", t),
                                () -> waitMs(t)));

    }
}
