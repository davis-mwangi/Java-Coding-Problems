package com.davidmwangi;

import java.util.Arrays;
import java.util.StringJoiner;

public class CheckPalindrome {

    /** Write a program that determines whether the given string is a palindrome or not.*/
    public  static  boolean isPalindromeV2(String str){
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

    public  static  boolean isPalindromev1(String str){
        //Reverse string
       if(str == null ||  str.trim().isEmpty()){
           return false;
       }
       int len =  str.length();
       for(int i =0; i < len/2; i++){
           if(str.charAt(i) != str.charAt(len - i -1)){
               return false;
           }
       }
       return true;
    }




}
