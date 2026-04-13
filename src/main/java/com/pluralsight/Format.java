package com.pluralsight;

public class Format {
    public static void main(String[] args) {

        System.out.println(formatName("bob","Smith"));

        String formatName = formatName("Alice","Johnson");
        System.out.println(formatName);

    }
    public static String formatName(String first,String last){
        return last + "," + first;
    }
}
