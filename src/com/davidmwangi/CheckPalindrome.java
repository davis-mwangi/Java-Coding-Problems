package com.davidmwangi;

import java.util.Arrays;
import java.util.StringJoiner;

public class CheckPalindrome {

    /** Write a program that determines whether the given string is a palindrome or not.*/
    public  static  boolean isPalindrome(String str){
       //Reverse string
        int len = str.length();
        StringBuilder sb =  new StringBuilder();
        for( int i = len -1; i >= 0; i--){
            sb.append(str.charAt(i));
        }
     System.out.println(sb.toString());
        //Compare if reversed string and original str are equal
       if(str.equals(sb.toString())){
           return true;
       }
       return false;

    }
}
