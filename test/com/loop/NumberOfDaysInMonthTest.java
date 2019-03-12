package com.loop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfDaysInMonthTest {

    @DisplayName("Should give the number of days in the given month of given year")
    @Test
    void getDaysInMonth() {
        assertEquals(31, NumberOfDaysInMonth.getDaysInMonth(1, 2001));
    }

    @DisplayName("Should give the number of days in feb as 28 if the year is not leap year")
    @Test
    void getDaysInMonth2() {
        assertEquals(28, NumberOfDaysInMonth.getDaysInMonth(2, 2001));
    }

    @DisplayName("Should give the number of days in feb as 29 if the year is leap year")
    @Test
    void getDaysInMonth3() {
        assertEquals(29, NumberOfDaysInMonth.getDaysInMonth(2, 2000));
    }
}