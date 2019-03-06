package com.overload;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    @DisplayName("should add two positive number")
    @Test
    void add0() {
        assertEquals(2, AddTwoNumbers.add(1, 1));
    }

    @DisplayName("should add three integers")
    @Test
    void add() {
        assertEquals(3, AddTwoNumbers.add(1, 1, 1));
    }

    @DisplayName("should add one integer and one floating point number")
    @Test
    void add1() {
        assertEquals(2.5, AddTwoNumbers.add(1, 1.5F));
    }

    @DisplayName("should add one floating point number and one integer")
    @Test
    void add2() {
        assertEquals(2.5, AddTwoNumbers.add(1.5F, 1));
    }

    @DisplayName("should add one two floating point numbers")
    @Test
    void add3() {
        assertEquals(3.0, AddTwoNumbers.add(1.5F, 1.5F));
    }

    @DisplayName("should add one negative and positive number")
    @Test
    void add4() {
        assertEquals(0, AddTwoNumbers.add(1, -1));
    }
}