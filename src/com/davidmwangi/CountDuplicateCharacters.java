package com.davidmwangi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CountDuplicateCharacters {
    /**Write a program that counts duplicate characters from a given string.**/
    public static Map<Character, Integer> countDuplicateCharactersV1(String str) {
        //Check if string is empty
        if(str == null || str.isEmpty()){
           return Collections.emptyMap();
        }
        //Iterate over the characters
        HashMap<Character, Integer>charCountMap =  new HashMap<>();
        for(int i = 0; i <  str.length(); i++){
            char ch = str.charAt(i);
            charCountMap.compute(ch, (k,v) -> (v == null) ? 1 : ++v);
        }
        return charCountMap;
    }
}
