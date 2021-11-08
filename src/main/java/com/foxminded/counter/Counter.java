package com.foxminded.counter;
import com.foxminded.couterInterface.CounterInterface;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringJoiner;

public class Counter implements CounterInterface {

private  Map<Character , Integer> mapCharacter = new LinkedHashMap<>();

    @Override
    public String charCounter (String string){
        StringJoiner stringJoiner = new StringJoiner("\n");

        char[] arrayChar = string.toCharArray();
        for(char charIter : arrayChar){
            if (mapCharacter.containsKey(charIter)){
                Integer later = mapCharacter.get(charIter) + 1;
                mapCharacter.put(charIter,later);
            }else {
                mapCharacter.put(charIter, 1);
            }
        }
        for (char key : mapCharacter.keySet()){
            stringJoiner.add("\"" + key + "\"" + " - " + mapCharacter.get(key));
        }
    return stringJoiner.toString();
    }
}
