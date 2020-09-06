package com.davidmwangi;

import java.util.Arrays;

public class CheckTwoStringsAnagram {
    /** Write a program that checks whether two strings are anagrams. Consider that an anagram of a string is a
     * permutation of this string by ignoring capitalization and white spaces.
     */
    public static boolean isAnagramV1(String str1, String str2) {
        //Check for null or empty values
       if(str1 == null ||  str2 == null ||  str1.trim().isEmpty() || str2.trim().isEmpty()){
           return false;
       }
       //Create  lowercase char  array  without whitespaces
       char []charStr1 = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
       char []charStr2 = str2.replaceAll("\\s", "").toLowerCase().toCharArray();

       if(charStr1.length != charStr2.length){
           return false;
       }
       Arrays.sort(charStr1);
       Arrays.sort(charStr2);
       return  Arrays.equals(charStr1,charStr2);
    }
    public static boolean isAnagramV2(String str1, String str2) {

        if (str1 == null || str2 == null
                || str1.isBlank() || str2.isBlank()) {
            // throw IllegalArgumentException
            return false;
        }

        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        return Arrays.equals(
                str1.chars().sorted().toArray(),
                str2.chars().sorted().toArray()
        );
    }

}
