package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance() {
        int x1 = 12;
        int y1 = 122;
        int x2 = 1;
        int y2 = 54;
        double expected = 68.88;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distanceZero() {
        int x1 = 12;
        int y1 = 12;
        int x2 = 12;
        int y2 = 12;
        double expected = 0.00;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}