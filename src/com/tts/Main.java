package com.tts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //missing .
        //java: cannot find symbol
        //  symbol:   method outprintln(java.lang.String)
        //  location: class java.lang.System
//	System.outprintln("Hello Java!");

        Scanner input = new Scanner(System.in);
        System.out.println("what is your name?");

        //incorrect capitalization
        //java: cannot find symbol
        //  symbol:   method NextLine()
        //  location: variable input of type java.util.Scanner
//        String x = input.NextLine();

        //left off parentheses
        //C:\Users\sawye\JavaProjects\theAndreaMethod\src\com\tts\Main.java:24:35
        //java: illegal start of expression
//        String x = input.NextLine(;

        String x = input.NextLine();

        //called the wrong data type for the variable name
        //java: incompatible types: java.lang.String cannot be converted to int
//        int x = input.nextLine();

        //called the wrong variable name
        //java: cannot find symbol
        //  symbol:   method NextLine()
        //  location: variable input of type java.util.Scanner
//        System.out.printf("Hello %s. \n", y);

        //no closing quotation mark
        //C:\Users\sawye\JavaProjects\theAndreaMethod\src\com\tts\Main.java:40:27
        //java: unclosed string literal
//        System.out.printf("Hello %s. \n, x);

        System.out.printf("Hello %s. \n", x);

    }
}
