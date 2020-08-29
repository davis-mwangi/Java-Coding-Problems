package com.davidmwangi;

public class RemoveWhiteSpacesFromString {

    /**
     * Write a program that removes all white spaces from the given string.
     **/
    public static String removeWhitespaces(String str) {
        if (str == null || str.trim().isEmpty()) {
            return "";
        }
        return str.replaceAll("\\s", "");
    }
}