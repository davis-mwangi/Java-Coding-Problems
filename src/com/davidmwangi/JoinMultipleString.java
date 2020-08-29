package com.davidmwangi;

import java.util.StringJoiner;

public class JoinMultipleString {

  public static String  joinByDelimiterV1(char delimiter, String... args){
     if(args == null ||  args.length == 0){
         return "";
     }
     StringBuilder sb =  new StringBuilder();
     for(String str : args){
         sb.append(delimiter).append(str);
     }
     return sb.substring(1); // Remove the preceding  delimiter
  }

    public static String joinByDelimiterV2(char delimiter, String... args) {

        if (args == null || args.length == 0) {
            // or throw IllegalArgumentException
            return "";
        }
        StringJoiner joiner = new StringJoiner(String.valueOf(delimiter));

        for (String arg : args) {
            joiner.add(arg);
        }

        return joiner.toString();
    }
}
