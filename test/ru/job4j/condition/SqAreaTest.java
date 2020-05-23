package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void areaSqrOne() {
        int p = 4;
        int k = 1;
        double expected = 1;
        double out = SqArea.area(p, k);
        Assert.assertEquals(out, expected, 0.01);
    }

    @Test
    public void areaSqrTwo() {
        int p = 6;
        int k = 2;
        double expected = 2;
        double out = SqArea.area(p, k);
        Assert.assertEquals(out, expected, 0.01);
    }
}