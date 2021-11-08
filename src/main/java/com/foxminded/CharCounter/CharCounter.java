package com.foxminded.CharCounter;

import com.foxminded.counter.Counter;
import com.foxminded.counter_proxy.CounterProxy;
import com.foxminded.couterInterface.CounterInterface;

public class CharCounter {
    public static void main(String[] args) {
        CounterInterface counterInterface = new CounterProxy();

        System.out.println(counterInterface.charCounter("hello world"));
        System.out.println(counterInterface.charCounter("hello world"));


    }
}
