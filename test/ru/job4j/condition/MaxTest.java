package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class MaxTest {

    @Test
    public void maxTwoNumber() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void maxThreeNumber() {
        int result = Max.max(2, 1, 5);
        assertThat(result, is(5));
    }

    @Test
    public void maxFourNumber() {
        int result = Max.max(1, 3, 2, 9);
        assertThat(result, is(9));
    }

}