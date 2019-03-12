package com.cylinder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle c = new Circle(3.75);

    void getRadius() {
        assertEquals(3.75, c.getRadius());
    }

    @Test
    void getArea() {
        assertEquals(44.178646691106465, c.getArea());
    }
}