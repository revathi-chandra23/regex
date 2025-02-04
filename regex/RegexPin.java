package com.atyeti.javatraining.regex;

public class RegexPin {
    public static boolean validatePin(String pin) {
//        int len=pin.length();
//        if(len==4 | len==6) {
//            for(char c:pin.toCharArray()) {
//                if(!Character.isDigit(c)) return false;
//                return true;
//            }
//        }
//        return false;
        return pin.matches("\\d{4}|\\d{6}[a-zA-Z]");
       // return pin.matches("[0-9]{4}|[0-9]{6}");
    }

    public static void main(String[] args) {
        String num="0j34";
        System.out.println(validatePin(num));
    }
}
