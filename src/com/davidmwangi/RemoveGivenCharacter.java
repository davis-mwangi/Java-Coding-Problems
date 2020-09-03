package com.davidmwangi;

public class RemoveGivenCharacter {
  /** Write a program that removes the given character from the given string.**/
    public static String removeCharacterV1(String str, char ch) {
        if(str ==null || str.trim().isEmpty()){
            return "";
        }
        StringBuilder sb =  new StringBuilder();
        for(char cha: str.toCharArray()){
            if(cha != ch){
                sb.append(cha);
            }
        }
       return sb.toString();
    }
    public static String removeCharacterV2(String str, char ch) {
        if(str ==null || str.trim().isEmpty()){
            return "";
        }

        return str.replaceAll(String.valueOf(ch), "");
    }
}
