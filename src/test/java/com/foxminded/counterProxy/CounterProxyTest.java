package com.foxminded.counterProxy;

import com.foxminded.counter.Counter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CounterProxyTest {

    @Mock
    Counter counterMock;
    @InjectMocks
    CounterProxy counterProxy;

    @Test
    void charCounter() {
        String stringExpected =
                "\"h\" - 1\n" +
                        "\"e\" - 1\n" +
                        "\"l\" - 3\n" +
                        "\"o\" - 2\n" +
                        "\" \" - 1\n" +
                        "\"w\" - 1\n" +
                        "\"r\" - 1\n" +
                        "\"d\" - 1";
        Mockito.when(counterMock.charCounter("hello world")).thenReturn(stringExpected);
        counterProxy.charCounter("hello world");
        counterProxy.charCounter("hello world");
        counterProxy.charCounter("hello world");
        Mockito.verify(counterMock).charCounter("hello world");
    }
}