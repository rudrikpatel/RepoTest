package com.testing.example;

import org.hamcrest.core.Is;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by Administrator on 8/24/2016.
 */
public class CalculatorTest {

    private Calculator mCalculator;

    @Before
    public void makeObject() throws Exception {
        mCalculator = new Calculator();
    }

    @Test
    public void testSum() throws Exception {
        //Expected result should be 6 because of 1 plus 5
        assertEquals(6d, mCalculator.sum(1d, 5d), 0);
    }

    @Test
    public void testSubtract() throws Exception {
        // Expected result should be 1 because of 10 minus 9
        assertEquals(1d, mCalculator.subtract(10d, 9d), 0);
    }

    @Test
    public void testDivide() throws Exception {
        assertEquals(2d, mCalculator.divide(10d, 5d), 0);
    }

    @Test
    public void email_validator() {
        assertThat(EmailValidator.isValidEmail("rudrik.pate@g.com"), is(true));
    }

    @Test
    public void testMultiply() throws Exception {
        assertEquals(90d, mCalculator.multiply(10d, 9d), 0);
    }

    @After
    public void completed() throws Exception {
        assertThat("Hello End", is("Hello End"));
    }
}