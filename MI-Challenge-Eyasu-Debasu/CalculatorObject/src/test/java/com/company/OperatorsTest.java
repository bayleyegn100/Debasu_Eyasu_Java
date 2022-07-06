package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OperatorsTest {

    private Operators operators;

    @Before
    public void setUp(){
        operators = new Operators();

    }

    @Test
    public void ShouldAddTwoIntegers() {
        int expecttedResult = 2;
        int acctualResult = operators.addition(1, 1);
        assertEquals(expecttedResult, acctualResult);

    }

    @Test
    public void shouldSubtractTwoIntegers() {
        int expecttedResult = -29;
        int acctualResult = operators.subtract(23, 52);
        assertEquals(expecttedResult, acctualResult);
    }

    @Test
    public void shouldMultiplyTwoIntegers() {
        int expecttedResult = 68;
        int acctualResult = operators.multiply(34, 2);
        assertEquals(expecttedResult, acctualResult);
    }

    @Test
    public void shouldDivivdeTwoIntegers() {
        int expecttedResult = 4;
        int acctualResult = operators.divide(12, 3);
        assertEquals(expecttedResult, acctualResult);
    }

    @Test
    public void shouldAddTwoDoubles() {
        double expecttedResult = 5.699999999999999;
        double acctualResult = operators.addition(3.4, 2.3 );

       assertEquals(expecttedResult, acctualResult, 0.00001);
    }

    @Test
    public void shouldSubtractTwoDoubles() {
        double expecttedResult = 5.0;
        double acctualResult = operators.subtract(5.5, 0.5);
        assertEquals(expecttedResult, acctualResult, 0.0011);
    }

    @Test
    public void shouldMultiplyTwoDoubles() {
        double expecttedResult = 29.480000000000004;
        double acctualResult = operators.multiply(6.7, 4.4);
        assertEquals(expecttedResult, acctualResult, 0.00021);
    }

    @Test
    public void ShouldDivideTwoDoubles() {
        double expecttedResult = 4.909090909090909;
        double acctualResult = operators.divide(10.8, 2.2);
        assertEquals(expecttedResult, acctualResult, 0.00015);
    }

}