package com.foxminded.counter_proxy;

import com.foxminded.counter.Counter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

class CounterProxyTest {

    private final String stringExpected =
            "\"h\" - 1\n" +
                    "\"e\" - 1\n" +
                    "\"l\" - 3\n" +
                    "\"o\" - 2\n" +
                    "\" \" - 1\n" +
                    "\"w\" - 1\n" +
                    "\"r\" - 1\n" +
                    "\"d\" - 1";

    @Mock
    private Counter counter;

    @BeforeEach
    void init() {
        counter = Mockito.mock(Counter.class);
    }

    @Test
    void charCounter() {
        Mockito.when(counter.charCounter("hello world")).thenReturn(null).thenReturn(stringExpected);
        Assertions.assertNull(null, counter.charCounter("hello world"));
        Assertions.assertEquals(stringExpected, counter.charCounter("hello world"));
    }
}