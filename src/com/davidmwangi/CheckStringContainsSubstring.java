package com.davidmwangi;

public class CheckStringContainsSubstring {
    /** Write a program that checks whether the given string contains the given substring.**/
    public static boolean containsV1(String text, String subtext) {
       if(text == null || subtext == null || text.trim().isEmpty() || subtext.trim().isEmpty()){
           return false;
       }
       return text.contains(subtext);
    }

    public static boolean containsV2(String text, String subtext) {

        if (text == null || subtext == null
                || text.isBlank() || subtext.isBlank()) {
            // or throw IllegalArgumentException
            return false;
        }

        return text.indexOf(subtext) != -1; // or lastIndexOf()
    }
}
