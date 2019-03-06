package com.Section5LoopAndConditioning;

public class LastDigitChecker {
    public static boolean isValid(int num) {
        return num < 1000 || num > 10;
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if( !isValid(num1) || !isValid(num2) ) {
            return false;
        }

        String num2String = Integer.toString(num2);
        String num1String = Integer.toString(num1);
        String num3String = Integer.toString(num3);

        char num1LastDigit = num1String.charAt(num1String.length() - 1);
        char num2LastDigit = num2String.charAt(num2String.length() - 1);
        char num3LastDigit = num3String.charAt(num3String.length() - 1);

        return num1LastDigit == num2LastDigit || num2LastDigit == num3LastDigit || num3LastDigit == num1LastDigit;
    }
}
