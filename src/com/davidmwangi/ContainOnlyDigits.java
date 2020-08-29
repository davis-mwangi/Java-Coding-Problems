package com.davidmwangi;

public class ContainOnlyDigits {
    /** Write a program that checks whether the given string contains only digits.**/
    public static boolean containsOnlyDigitsV1(String str) {
         //Check is empty
        if(str == null || str.trim().isEmpty()){
            return false;
        }

        for(char ch : str.toCharArray()){
            if(!Character.isDigit(ch)){
               return false;
            }
        }
        return true;
    }
}