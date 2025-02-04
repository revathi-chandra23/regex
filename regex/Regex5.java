package com.atyeti.javatraining.regex;

public class Regex5 {

    public static void main(String[] args) {

        String text = "apple,orange,banana,grapes";
        String regex = ",";
        String[] fruits = text.split(regex);
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
