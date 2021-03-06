package com.foxminded.counterProxy;
import com.foxminded.counter.Counter;
import com.foxminded.couterInterface.CounterInterface;
import java.util.HashMap;
import java.util.Map;

public class CounterProxy implements CounterInterface {

    public CounterProxy(){
        this.counterInterface = new Counter();
    }

    private  CounterInterface counterInterface;
    private final Map<String, String> mapCache = new HashMap<>();


    @Override
    public String charCounter(String string) {
        mapCache.computeIfAbsent(string, key -> counterInterface.charCounter(string));
        return mapCache.get(string);
    }
}
