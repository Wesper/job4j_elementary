package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int actual = Factorial.calc(5);
        int expected = 120;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int actual = Factorial.calc(0);
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenCalculateFactorialForOneThenOne() {
        int actual = Factorial.calc(1);
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }
}