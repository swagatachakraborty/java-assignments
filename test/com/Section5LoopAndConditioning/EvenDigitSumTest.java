package com.Section5LoopAndConditioning;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenDigitSumTest {

    @DisplayName("Should give 4 as sum of even digits as the number im providing is 1212")
    @Test
    void getEvenDigitSum1() {
        assertEquals(4, EvenDigitSum.getEvenDigitSum((1212)));
    }

    @DisplayName("Should give 4 as sum of even digits as the number im providing is 1212")
    @Test
    void getEvenDigitSum2() {
        assertEquals(-1, EvenDigitSum.getEvenDigitSum((-1029)));
    }
}