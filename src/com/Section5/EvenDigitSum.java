package com.Section5;

public class EvenDigitSum {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int getEvenDigitSum(int number) {
        if(number < 0) {
            return -1;
        }

        int sum = 0;

        while(number != 0){
            int lastDigit = number % 10;
            if(isEven(lastDigit)) {
                sum += lastDigit;
            }
            number = number / 10;
        }
        return sum;
    }
}
