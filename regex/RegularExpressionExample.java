package com.atyeti.javatraining.regex;

import java.util.regex.Pattern;

public class RegularExpressionExample {

    public static void main(String[] args) {

        System.out.println(Pattern.matches(".r.", "arp")); // This statement displays Boolean value True because the second character is r in both string and regular exp.

        System.out.println(Pattern.matches(".bm", "abc")); //This statement displays Boolean value False because the third character is different in both string and regular exp.

        System.out.println(Pattern.matches("..m", "msm")); //This statement displays Boolean value True because the third character is m in both string and regular exp.

        System.out.println(Pattern.matches("a..s", "amns")); //This statement displays Boolean value True because the first and last character is same in both string and regular exp.

        System.out.println(Pattern.matches(".s.", "mas")); //This statement displays Boolean value False because the second character is different in both string and regular exp.

        System.out.print(" 1. ");
        System.out.println(
                Pattern.matches("^[a-z]om", "Tom")); // This statement returns False because the string starts with the Upper-case letter which does not match with the regex.

        System.out.print(" 2. ");
        System.out.println(
                Pattern.matches("[Rpq]om", "Tom")); // This statement returns False because the string starts with 'T', which does not match with any character R, P, or Q of Regex.

        System.out.print(" 3. ");
        System.out.println(
                Pattern.matches("[Tt]om", "Tom")); // This statement returns True because the string starts with 'T' which matches with a character T from Regex.

        System.out.print(" 4. ");
        System.out.println(
                Pattern.matches("Cat|Rat", "Rat")); // This statement returns True because the string matches with the Second part from the Regular Expression.

        System.out.print(" 5. ");
        System.out.println(
                Pattern.matches("[CM]at|[Bb]ad", "Bad")); // This statement returns True because the string matches with the Second part from the Regular Expression.

        System.out.print(" 6. ");
        System.out.println(
                Pattern.matches(".*bit.*", "rabbit")); // This statement returns True because the string contains the bit which match to the Regular Expression.

        System.out.print(" 7. ");
        System.out.println(
                Pattern.matches("^[\\d].*", "abc")); // This statement returns False because the string starts with the letter not a digit, which does not match with the regular expression.

        System.out.print(" 8. ");
        System.out.println(
                Pattern.matches("^[^\\d].*", "abc123")); // This statement returns True because the string starts with the letter, which matches with the regular expression due to the negation of digit.

        System.out.print(" 9. ");
        System.out.println(
                Pattern.matches("[a-zA-Z][a-zA-Z][0-9A-Z]", "aPz")); // This statement returns False because the last character 'z' in string does not match with the '0-9A-Z' in regular expression.

        System.out.print(" 10. ");
        System.out.println(
                Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z]", "aAA")); // This statement returns True because the all the characters in string matches with the regular expression.

        System.out.print(" 11. ");
        System.out.println(
                Pattern.matches("\\D*", "abcde")); // This statement returns True because the string does not contain any digit, so it follows the regular expression.

        System.out.print(" 12. ");
        System.out.println(
                Pattern.matches("\\D*", "abcde123")); // This statement returns False because the string contains the digits, so it does not follow the regular expression.
    }
}
