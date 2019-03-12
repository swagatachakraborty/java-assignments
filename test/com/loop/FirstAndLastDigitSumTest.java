package com.loop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstAndLastDigitSumTest {

    @DisplayName("Should give 3 as the number is 112")
    @Test
    void sumFirstAndLastDigit1() {
        assertEquals(3, FirstAndLastDigitSum.sumFirstAndLastDigit(112));
    }

    @DisplayName("Should give -1 as the number is negetive")
    @Test
    void sumFirstAndLastDigit2() {
        assertEquals(-1, FirstAndLastDigitSum.sumFirstAndLastDigit(-109));
    }
}