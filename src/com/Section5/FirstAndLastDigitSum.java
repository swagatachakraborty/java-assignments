package com.Section5;

public class FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if(number < 0) {
            return -1;
        }

        int lastDigit = number % 10;
        int firstDigit = 0;

        while(number != 0) {
            firstDigit = number % 10;
            number = number / 10;
        }

        return firstDigit + lastDigit;
    }
}