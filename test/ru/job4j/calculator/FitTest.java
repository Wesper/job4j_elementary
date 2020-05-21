package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void manWeight() {
        double in = 182;
        double expected = 94.3;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight() {
        double in = 164;
        double expected = 73.6;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}