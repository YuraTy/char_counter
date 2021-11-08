package com.foxminded.counter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CounterTest {
    private Counter counter = new Counter();

private final String stringExpected =
        "\"h\" - 1\n" +
        "\"e\" - 1\n" +
        "\"l\" - 3\n" +
        "\"o\" - 2\n" +
        "\" \" - 1\n" +
        "\"w\" - 1\n" +
        "\"r\" - 1\n" +
        "\"d\" - 1";

    @Test
    void charCounter() {
        String stringActual = counter.charCounter("hello world");
        Assertions.assertEquals(stringExpected,stringActual);
    }
}