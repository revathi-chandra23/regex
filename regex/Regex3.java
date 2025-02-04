package com.atyeti.javatraining.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex3 {

    public static void main(String[] args) {

        String text = "My phone number is 123.456.7890 and my email address is abc@gmail.com .";
        String phoneRegex = "((\\d{3}|\\(\\d{3}\\))?" +      //Area code
                "(\\s|-|.)?" +                        //Separator
                "(\\d{3})" +                            //First part
                "(\\s|-|.)" +                         //Separator
                "(\\d{4})" +                            //Second part
                "(\\s*(ext|x|ext.)\\s*(\\d{2,5}))?)";   //Extension

                //"(\\d{3})-(\\d{3})-(\\d{4})"; // Matches a phone number

        Pattern pattern = Pattern.compile(phoneRegex);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println("Group count: " + matcher.groupCount());
            System.out.println("Area Code: " + matcher.group(2));
            System.out.println("First part: " + matcher.group(4));
            System.out.println("Second part: " + matcher.group(6));
        }

        String emailRegex = "(([a-zA-Z0-9._%+-])+)" +       //username
                "@" +                                       //symbol @
                "([a-zA-Z0-9.-]+" +                         //company name
                "(\\.[a-zA-Z]{2,4}))";                      //top-level domain

        Pattern emailPattern = Pattern.compile(emailRegex);
        Matcher emailMatcher = emailPattern.matcher(text);

        if(emailMatcher.find()) {
            System.out.println("Username: " + emailMatcher.group(1));
            System.out.println("Domain name: " + emailMatcher.group(3));
        } else {
            System.out.println("Matcher not matching");
        }
    }
}
