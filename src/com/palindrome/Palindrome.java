package com.palindrome;

public class Palindrome {
    static boolean isPalindrome(String str) {

//        int strLength = str.length();
//        for(int index=0; index<strLength; index++){
//            if (str.charAt(index) != str.charAt(strLength - index)) {
//                return false;
//            }
//        }
//        return true;

        String reverseStr = new StringBuilder(str).reverse().toString();
        return str.equals(reverseStr);
    }

    static boolean isPalindrome(int number) {
        return isPalindrome(Integer.toString(number));
    }
}
