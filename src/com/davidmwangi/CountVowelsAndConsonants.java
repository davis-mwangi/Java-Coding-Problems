package com.davidmwangi;

import java.util.*;

public class CountVowelsAndConsonants {

    /**
     * Write a program that counts the number of vowels and consonants in a given string. Do this for the English
     * language, which has five vowels (a, e, i, o, and u).
     * @param str
     * @return
     */
    public static Map<String, Integer> countVowelsAndConsonantsV1(String str) {
        if(str == null || str.trim().isEmpty()){
            return Collections.emptyMap();
        }
        //Initialize a set of vowels
        Set<Character> vowels =  new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        //Since we comparing with lowercase chars lets first convert all chars to lowercase
       str =  str.toLowerCase();

        //Declare a Key value Map //key - consonants, vowels
        Map<String, Integer> vowConsCountMap =  new HashMap<>();
        for(int i =0 ; i <  str.length(); i++){
            char ch =  str.charAt(i);
            if(vowels.contains(ch)){
                vowConsCountMap.compute("vowels", (k,v) -> (v == null) ? 1 : ++v);
            } else if(ch >= 'a' && ch <= 'z'){
                vowConsCountMap.compute("consonants", (k,v) -> (v == null) ? 1: ++v);
            }
        }
        System.out.println("Map :"+ vowConsCountMap);
        return vowConsCountMap;

    }
}