package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WarriorTest {

    private Warrior warrior;
    @Before

    public void setUp(){
        warrior = new Warrior();
    }

    @Test
    public void ShouldAttackAnotherCharacter() {

        assertEquals(100, warrior.getShieldStrength());
        assertEquals(50, warrior.getSpeed());
        assertEquals(100, warrior.getStamina());

    }
}