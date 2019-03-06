package com.Point;

public class Point {
    private int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0,0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(int x, int y) {
        double distanceSqr = Math.pow((x - this.x) , 2) + Math.pow((y - this.y) , 2);
        return Math.sqrt(distanceSqr);
    }

    public double distance() {
        return distance(0,0);
    }

    public double distance(Point p) {
        return distance(p.getX(), p.getY());
    }
}
