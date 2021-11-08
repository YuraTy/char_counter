package com.foxminded.counter;

import com.foxminded.couterInterface.CounterInterface;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringJoiner;

public class Counter implements CounterInterface {

    @Override
    public String charCounter(String string) {
        Map<Character, Integer> mapCharacter = new LinkedHashMap<>();
        StringJoiner stringJoiner = new StringJoiner("\n");
        char[] arrayChar = string.toCharArray();
        for (char uniqueSymbol : arrayChar) {
            if (mapCharacter.containsKey(uniqueSymbol)) {
                Integer later = mapCharacter.get(uniqueSymbol) + 1;
                mapCharacter.put(uniqueSymbol, later);
            } else {
                mapCharacter.put(uniqueSymbol, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : mapCharacter.entrySet()) {
            stringJoiner.add("\"" + entry.getKey() + "\"" + " - " + entry.getValue());
        }
        return stringJoiner.toString();
    }
}
