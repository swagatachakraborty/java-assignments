package com.sortArray;

public class Main {
    public static void main(String[] args) {
        int []arr = {3,4,2,5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] sort(int arr[]) {
        int temp = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 1; j < (arr.length-i); j++) {
                if(arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
