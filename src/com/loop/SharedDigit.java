package com.loop;

public class SharedDigit {
    public static boolean hasSharedDigit(int number1, int number2) {
        if(number1 <10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return false;
        }

        String number1String = Integer.toString(number1);
        String number2String = Integer.toString(number2);

        for(char character : number1String.toCharArray()) {
            if(number2String.indexOf(character) >= 0) {
                return true;
            }
        }
        return false;
    }
}
