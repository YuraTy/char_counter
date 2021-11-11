package com.foxminded.counterProxy;

import com.foxminded.couterInterface.CounterInterface;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CounterProxyTest {

    private static final String EXPECTED_WORD = "hello world";

    @Mock
    private CounterInterface counterInterface;

    @InjectMocks
    private CounterProxy counterProxy;

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
        Mockito.when(counterInterface.charCounter(Mockito.eq(EXPECTED_WORD))).thenReturn(stringExpected);
        counterProxy.charCounter(EXPECTED_WORD);
        counterProxy.charCounter(EXPECTED_WORD);
        String result = counterProxy.charCounter(EXPECTED_WORD);
        Mockito.verify(counterInterface,Mockito.times(1)).charCounter(Mockito.eq(EXPECTED_WORD));
        Assertions.assertEquals(result,stringExpected);
    }
}