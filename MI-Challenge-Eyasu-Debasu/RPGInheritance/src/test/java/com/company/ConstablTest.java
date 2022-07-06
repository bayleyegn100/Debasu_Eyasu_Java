package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstablTest {

    private Constabl constabl;
    @Before

    public void setUp(){
        constabl = new Constabl();
    }

    @Test
    public void shouldAttackAnotherCharacter() {


        assertEquals(60, constabl.getStamina());
        assertEquals(20, constabl.getSpeed());
        assertEquals(60, constabl.getStrength());
        assertEquals(100, constabl.getHealth());
    }
    @Test
    public void shouldArrestAnotherCharacter() {
        String expectedJurisdictionName = "Inspector";
//
        assertEquals(expectedJurisdictionName, constabl.getJurisdiction());;

    }

}