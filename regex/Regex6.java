package com.atyeti.javatraining.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex6 {

    public static void main(String[] args) {

        String text = "hello world";
        String regex = "HELLO";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println("Pattern found (case-insensitive match): " + matcher.group());
        } else {
            System.out.println("Pattern not found");
        }
    }
}
