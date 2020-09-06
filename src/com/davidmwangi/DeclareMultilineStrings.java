package com.davidmwangi;

import java.util.spi.LocaleServiceProvider;

public class DeclareMultilineStrings {
    /** Write a program that declares multiline strings or text blocks.**/
    private static final String LS = System.lineSeparator();
    public  static  String TEXT_1 = new StringBuilder().append("This is james").append(LS)
            .append("Eagle Shark Master").append(LS)
            .append("and he loves coding").toString();


    String TEXT_2 = String.join(LS,
            "My high school, ",
            "the Illinois Mathematics and Science Academy,",
            "showed me that anything is possible ",
            "and that you're never too young to think big.");


    String TEXT_3 = "My high school, " + LS
            + "the Illinois Mathematics and Science Academy," + LS
            + "showed me that anything is possible " + LS
            + "and that you're never too young to think big.";


}
