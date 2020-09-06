package com.davidmwangi;

public class RemoveLeadingAndTrailingSpaces {

    /** Write a program that removes the leading and trailing spaces of the given string.**/

    private static final char space = '\u2002';
    private static final String TEXT1 = "\n \n\n  hello  \t \n \r";
    private static final String TEXT2 = space + "\n \n\n  hello  \t \n \r" + space;

    String trimmedV1 = TEXT1.trim();
    String trimmedV2 = TEXT2.trim();
}
