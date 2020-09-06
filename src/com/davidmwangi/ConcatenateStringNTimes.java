package com.davidmwangi;

public class ConcatenateStringNTimes {

    /**
     * Write a program that concatenates the same string a given number of times.
     */
    public static String concatRepeat(String str, int n) {
        if (str == null || str.trim().isEmpty()) {
            return "";
        }

        if (n <= 1) {
            return str;
        }

        if (Integer.MAX_VALUE / n < str.length()) {
            throw new OutOfMemoryError("Maximum Size of a String will be  exceeded");
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
