package com.company.pos;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamTest {

    private IceCream iceCream;

    @Before
    public void  setUp(){
        iceCream = new IceCream();

    }
    @Test
    public void shouldHaveEnoughFlavors(){
       boolean expectedValue = false;
       iceCream.haveEnoughFlavors();
       assertEquals(expectedValue, iceCream.isFlavor());
    }

    @Test
    public void shouldKeepColdTheIceCream(){
        int expectedTemp = 35;
        iceCream.keepColdTheIceCream();
        assertEquals(expectedTemp, iceCream.getTemp());
    }

    @Test
    public void shouldFullFillCustomerSatisfaction(){
        int expectedValueOfCusttomerSatsfaction = 7;
        iceCream.customerSatisfactions();
        assertEquals(expectedValueOfCusttomerSatsfaction, iceCream.getCustomerSatsfaction());
    }


}