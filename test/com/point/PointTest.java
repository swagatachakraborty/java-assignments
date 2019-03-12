package com.point;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void distanceFromOriginForPointThatInitializedWithDefaultConstructor() {
        Point p = new Point();
        assertEquals(0.0,p.distance());
    }

    @Test
    void distanceFromOriginForPointThatInitializedWith2ArgumentConstructor() {
        Point p = new Point(6, 5);
        assertEquals(7.810249675906654 ,p.distance());
    }

    @Test
    void distanceOfTwoDifferentPointObjects() {
        Point p1 = new Point(6, 5);
        Point p2 = new Point(3, 1);
        assertEquals(5.0 ,p1.distance(p2));
    }

    @Test
    void distanceOfOnePointObjectToAnotherCoordinate() {
        Point p1 = new Point(6, 5);
        assertEquals(5.0 ,p1.distance(2,2));
    }
}