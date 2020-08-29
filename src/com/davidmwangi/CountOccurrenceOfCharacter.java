package com.davidmwangi;

public class CountOccurrenceOfCharacter {


    /** Write a program that counts the occurrences of a certain character in a given string.**/
    public static int countOccurrencesOfACertainCharacterV1(String str, char ch){ //O(n)
        // abbsaabhgga
        int counter = 0;
        if(str == null || str.trim().isEmpty()){
            return counter;
        }
        for(char c :  str.toCharArray()){
            if(ch == c){
                counter++;
            }
        }
        return counter;
    }

    //Best method O(1)
    public static int countOccurrencesOfACertainCharacterV2(String str, char ch){ //O(1)
        if(str == null || str.trim().isEmpty()){
            return 0;
        }
        return str.length() -  str.replace(String.valueOf(ch), "").length();
    }

}
