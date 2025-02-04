package com.atyeti.javatraining.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex7 {

    public static void main(String[] args) {

        String text = "Hello $100";
        String regex = Pattern.quote("$100");  // Escape special characters

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println("Pattern found: " + matcher.group());
        } else {
            System.out.println("Pattern not found");
        }
    }
}
