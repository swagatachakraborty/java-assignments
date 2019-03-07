package com.Cylinder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {
    Cylinder c = new Cylinder(5.55, 7.25);

    @Test
    void getHeight() {
        assertEquals(7.25, c.getHeight());
    }

    @Test
    void getRadius() {
        assertEquals(5.55, c.getRadius());
    }

    @Test
    void getArea() {
        assertEquals(96.76890771219959, c.getArea());
    }

    @Test
    void getVolume() {
        assertEquals(701.574580913447, c.getVolume());
    }
}