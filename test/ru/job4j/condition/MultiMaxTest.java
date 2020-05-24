package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }
    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = check.max(10, 4, 2);
        assertThat(result, is(10));
    }

    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 12);
        assertThat(result, is(12));
    }

    @Test
    public void whenAllMax() {
        MultiMax check = new MultiMax();
        int result = check.max(8, 8, 8);
        assertThat(result, is(8));
    }
}