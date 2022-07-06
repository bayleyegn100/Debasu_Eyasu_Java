package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FarmerTest {
    private Farmer farmer;
    @Before

    public void setUp(){
        farmer = new Farmer();
    }

    @Test
    public void ShouldAttackAnotherCharacter() {

        assertEquals(1, farmer.getAttackPower());
        assertEquals(75, farmer.getStamina());
        assertEquals(75, farmer.getStrength());

    }

}