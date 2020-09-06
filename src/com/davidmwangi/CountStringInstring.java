package com.davidmwangi;

public class CountStringInstring {


    /** Write a program that counts the occurrences of a given string in another given string.**/
    public static int countStringInStringV1(String string, String toFind) {
        if(string == null || toFind == null ||  string.trim().isEmpty() || toFind.trim().isEmpty()){
            return 0;
        }
        int position = 0;
        int count =0;
        int n =toFind.length();
        while ( (position = string.indexOf(toFind, position)) != -1){
            position = position + n;
            count++;
        }
        return  count;
    }

}
