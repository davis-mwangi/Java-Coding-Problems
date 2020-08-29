package com.davidmwangi;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
     /** Write a program that returns the first non-repeated character from a given string.**/
    public static char firstNonRepeatedCharacterV1(String str) {
        //Check is string is empty
        if(str == null || str.trim().isEmpty()){
            return Character.MIN_VALUE;
        }
        //We need an Ordered Key value to track the chars
        char firstNonRepeatChar = Character.MAX_VALUE;
        Map<Character, Integer> charCountMap =  new LinkedHashMap<>();
        for(int i = 0; i < str.length(); i++){
            char ch =  str.charAt(i);
            charCountMap.compute(ch, (k,v) -> (v == null) ? 1 :  ++v);
        }
        //Check the first char count is less than 1
        for(Character  character : charCountMap.keySet()){
           if(charCountMap.get(character) == 1){
               firstNonRepeatChar =  character;
               break;
           }
        }
        return firstNonRepeatChar;
    }
}
