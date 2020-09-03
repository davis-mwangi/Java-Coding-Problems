package com.davidmwangi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateCharacters {

    /** Write a program that removes the duplicate characters from the given string **/
    public static String removeDuplicatesV1(String str) {
           if(str == null  || str.trim().isEmpty()){
               return "";
           }
           Set<Character> characterSet = new HashSet<>();
            StringBuilder sb =  new StringBuilder();
           for(char ch: str.toCharArray()){
              if(characterSet.add(ch)){
                  sb.append(ch);
               }
           }
           return sb.toString();
    }
    public static String removeDuplicatesV2(String str) {

        if (str == null || str.isEmpty()) {
            // or throw IllegalArgumentException
            return "";
        }

        return Arrays.asList(str.split("")).stream()
                .distinct()
                .collect(Collectors.joining());
    }
}
