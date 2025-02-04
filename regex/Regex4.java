package com.atyeti.javatraining.regex;

public class Regex4 {

    public static void main(String[] args) {

        String text = "The quick brown fox jumps over the lazy dog.";
        String regex = "\\bfox\\b";  // Word boundary around "fox"

        String result = text.replaceAll(regex, "cat");
        System.out.println(result);
    }
}
