package com.foxminded.counter_proxy;
import com.foxminded.counter.Counter;
import com.foxminded.couterInterface.CounterInterface;

import java.util.HashMap;
import java.util.Map;

public class CounterProxy implements CounterInterface {
    private CounterInterface counterInterface = new Counter();
    private Map <String,String> mapCache = new HashMap<>();

    @Override
    public String charCounter(String string) {
        if (!mapCache.containsKey(string)){
            mapCache.put(string,counterInterface.charCounter(string));
            return mapCache.get(string);
        }
        return mapCache.get(string);
    }
}
