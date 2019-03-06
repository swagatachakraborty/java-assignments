package com.overload;

public class AddTwoNumbers {
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static double add(float num1, float num2) {
        return num1 + num2;
    }

    public static double add(float num1, int num2) {
        return num1 + num2;
    }

    public static double add(int num1, float num2) {
        return num1 + num2;
    }
}
