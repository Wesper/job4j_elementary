package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance() {
        Point first = new Point(12, 122);
        Point second = new Point(1, 54);
        double expected = 68.88;
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distanceZero() {
        Point first = new Point(12, 12);
        Point second = new Point(12, 12);
        double expected = 0.00;
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }
}