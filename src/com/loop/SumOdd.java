package com.loop;

public class SumOdd {
    public static boolean isOdd(int number) {
        return number > 0 && number%2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if(start < 0 || start > end) {
            return -1;
        }

        int sum = 0;

        for (int current=start; current<=end; current++) {
            if(isOdd(current)) {
                sum += current;
            }
        }

        return sum;
    }
}
