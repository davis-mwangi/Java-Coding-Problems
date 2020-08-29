package com.davidmwangi;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeatedCharacter {
    /** Write a program that returns the first repeated character from a given string.**/
    public static char firstRepeatedCharacterV1(String str) {
        //First Check string is empty
        if(str == null || str.trim().isEmpty()){//Java 11  str.isBlank()
            return Character.MIN_VALUE;
        }
        Map<Character, Integer>charCountMap = new LinkedHashMap<>();
        for(int i =0; i < str.length(); i++){
            char ch = str.charAt(i);
            charCountMap.compute(ch, (k,v) ->(v ==null) ? 1: ++v);
            if(charCountMap.get(ch) == 2){
                return ch;
            }
        }
        return Character.MIN_VALUE;
    }
}
