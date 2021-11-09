package com.foxminded.charCounter;

import com.foxminded.counterProxy.CounterProxy;
import com.foxminded.couterInterface.CounterInterface;

public class CharCounter {

    public static void main(String[] args) {
        CounterInterface counterInterface = new CounterProxy();
        System.out.println(counterInterface.charCounter("hello world"));
        System.out.println(counterInterface.charCounter("hello world"));
    }
}
