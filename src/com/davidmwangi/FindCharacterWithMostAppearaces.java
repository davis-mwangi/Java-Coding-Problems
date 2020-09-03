package com.davidmwangi;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindCharacterWithMostAppearaces {
    /** Write a program that finds the character with the most appearances in the given string.**/
    public static Map<Character, Integer> maxOccurenceCharacterV1(String str){
        if(str == null || str.trim().isEmpty()){
           return Collections.emptyMap();
        }
        int len = str.length();
        Map<Character,Integer>characterIntegerMap =  new LinkedHashMap<>();
        for(int i =0; i < len; i++){
            char ch = str.charAt(i);
            characterIntegerMap.compute(ch, (k, v) -> (v == null)? 1 :++v);
        }
        int maxCounter = 0;
        char mostChar = Character.MAX_VALUE;  //{a=3,b=6,c=1,5}
        for(char ch :  characterIntegerMap.keySet()){
             if(!Character.isWhitespace(ch) && characterIntegerMap.get(ch) > maxCounter){
                 maxCounter = characterIntegerMap.get(ch);
                 mostChar = ch;
             }
        }
        return Map.of(mostChar,maxCounter);
    }

    public static Map<Character, Integer> maxOccurenceCharacterV2(String str) {

        if (str == null || str.isBlank()) {
            // or throw IllegalArgumentException
            return Collections.emptyMap();
        }

        Map<Character, Integer> counter = new HashMap<>();
        char[] chStr = str.toCharArray();
        for (int i = 0; i < chStr.length; i++) {

            char currentCh = chStr[i];
            if (!Character.isWhitespace(currentCh)) { // ignore spaces
                Integer noCh = counter.get(currentCh);
                if (noCh == null) {
                    counter.put(currentCh, 1);
                } else {
                    counter.put(currentCh, ++noCh);
                }
            }
        }

        int maxOccurrences = Collections.max(counter.values());

        char maxCharacter = Character.MIN_VALUE;
        for (Map.Entry<Character, Integer> entry : counter.entrySet()) {
            if (entry.getValue() == maxOccurrences) {
                maxCharacter = entry.getKey();
            }
        }

        return Map.of(maxCharacter, maxOccurrences);
    }
}
