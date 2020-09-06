package com.davidmwangi;

public class FindLongestCommonPrefix {

    /**
     * Write a program that finds the longest common prefix of given strings.
     **/
    public static String longestCommonPrefixV1(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        int firstLength = strs[0].length();
        for (int prefixLen = 0; prefixLen < firstLength; prefixLen++) {
            char ch = strs[0].charAt(prefixLen);
            for (int i = 1; i < strs.length; i++) {
                if (prefixLen >= strs[i].length()
                        || strs[i].charAt(prefixLen) != ch) {

                    return strs[i].substring(0, prefixLen);
                }
            }
        }
        return strs[0];
    }
}