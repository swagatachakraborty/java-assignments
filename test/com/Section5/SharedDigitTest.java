package com.Section5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SharedDigitTest {

    @DisplayName("Should return true when the given numbers has any common digit")
    @Test
    void hasSharedDigitFor2CommonDigit() {
        assertEquals(true, SharedDigit.hasSharedDigit(21, 22));
    }

    @DisplayName("Should return true when the given numbers has any common digit")
    @Test
    void hasSharedDigitFor3CommonDigit() {
        assertEquals(true, SharedDigit.hasSharedDigit(13, 31));
    }

    @DisplayName("Should return false when the given numbers not have any common digit")
    @Test
    void hasSharedDigitForNoCommonDigit() {
        assertEquals(false, SharedDigit.hasSharedDigit(21, 34));
    }

    @DisplayName("Should return false when any of the given number is smaller than 10")
    @Test
    void hasSharedDigitFor1NumberLessThan10() {
        assertEquals(false, SharedDigit.hasSharedDigit(12, 9));
    }

    @DisplayName("Should return false when the given numbers are smaller than 10")
    @Test
    void hasSharedDigitFor2NumbersLessThan10() {
        assertEquals(false, SharedDigit.hasSharedDigit(9, 35));
    }

    @DisplayName("Should return false when any of the given number are larger than 99")
    @Test
    void hasSharedDigitFor1NumbersGreaterThan99() {
        assertEquals(false, SharedDigit.hasSharedDigit(9, 39));
    }

    @DisplayName("Should return false when any of the given number are larger than 99")
    @Test
    void hasSharedDigitFor2NumbersGreaterThan99() {
        assertEquals(false, SharedDigit.hasSharedDigit(900, 350));
    }
}