package com.sortArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void sort() {
        int[] arr = {4,3,5,1,2};
        int[] sortArr = {1,2,3,4,5};
        assertArrayEquals(sortArr, Main.sort(arr));
    }

    @Test
    void sort1() {
        int[] arr = {4,3,3,1,2};
        int[] sortArr = {1,2,3,3,4};
        assertArrayEquals(sortArr, Main.sort(arr));
    }
}